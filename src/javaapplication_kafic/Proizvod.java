
package javaapplication_kafic;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;

public class Proizvod {
    private Integer id;
    private float cena;
    private String naziv;

    public Proizvod() {
        this.id = null;
        this.cena = 0;
        this.naziv = "";
    }

    public Proizvod(Integer id, String naziv, float cena) {
        this.id = id;
        this.naziv = naziv;
        this.cena = cena;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public float getCena() {
        return cena;
    }

    public void setCena(float cena) {
        this.cena = cena;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    @Override
    public String toString() {
        return "Proizvod{" + "id=" + id + ", cena=" + cena + ", naziv=" + naziv + '}';
    }
    
    public static boolean sacuvaj(Proizvod p){
        String query = "INSERT INTO `proizvod`(`naziv`, `cena`) VALUES (?,?)";
        try {
            PreparedStatement ps = DB.getKonekcija().prepareStatement(query);
            ps.setString(1, p.getNaziv());
            ps.setFloat(2, p.getCena());
            
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            Logger.getLogger(Proizvod.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public static boolean izmeni(Proizvod p){
        String query = "UPDATE `proizvod` SET `naziv`=?,`cena`=? WHERE `id`=?";
        try {
            PreparedStatement ps = DB.getKonekcija().prepareStatement(query);
            ps.setString(1, p.getNaziv());
            ps.setFloat(2, p.getCena());
            ps.setInt(3, p.getId());
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            Logger.getLogger(Proizvod.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public static boolean izbrisi(int id){
        if(brzoBiranjePostoji(id)){
            String query = "DELETE proizvod, brzo_biranje \n" +
                           "FROM proizvod , brzo_biranje\n" +
                           "WHERE proizvod.id='"+id+"'\n" +
                           "AND\n" +
                           "brzo_biranje.proizovd_id='"+id+"'";
            try {
               Connection con = DB.getKonekcija();
               PreparedStatement ps = con.prepareStatement(query);
                return ps.executeUpdate() > 0;
            }
            catch (SQLException ex) {
                // Logger.getLogger(Proizvod.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
       
        }else{
        String query = "DELETE FROM proizvod\n" +
                       "WHERE proizvod.id = '"+id+"'";
        try {
            Connection con = DB.getKonekcija();
            PreparedStatement ps = con.prepareStatement(query);
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
           // Logger.getLogger(Proizvod.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        }
    }
    public static boolean brzoBiranjePostoji(int id){
        String query = "SELECT * FROM `brzo_biranje` WHERE `proizovd_id`='"+id+"'";
        try {
            PreparedStatement ps = DB.getKonekcija().prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                return true;
            }else{
                return false;
            }  
        } catch (SQLException ex) {
            //Logger.getLogger(Proizvod.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public static ArrayList<Proizvod> listaProizvoda(String podatak){
        ArrayList<Proizvod> lista = new ArrayList<>();
        String query = "SELECT * FROM `proizvod` WHERE CONCAT (`naziv`) LIKE ?";
        Proizvod p;
        try {
            PreparedStatement ps = DB.getKonekcija().prepareStatement(query);
            ps.setString(1, "%"+podatak+"%");
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                p = new Proizvod(rs.getInt(1), rs.getString(2), rs.getFloat(3));
                lista.add(p);
            }
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(Proizvod.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    } 
    
    public Integer ID(String naziv){
        String query = "SELECT `id` FROM `proizvod` WHERE `naziv`=?";
        try {
            PreparedStatement ps = DB.getKonekcija().prepareStatement(query);
            ps.setString(1, naziv);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                return rs.getInt(1);
            }else{
                return null;
            } 
            
        } catch (SQLException ex) {
            Logger.getLogger(Proizvod.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}


package javaapplication_kafic;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Sto {
    private Integer id;
    private String oznaka;
    private int kapacitet;

    public Sto() {
        this.id = null;
        this.oznaka = "";
        this.kapacitet = 0;
    }

    public Sto(Integer id, String oznaka, int kapacitet) {
        this.id = id;
        this.oznaka = oznaka;
        this.kapacitet = kapacitet;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    

    public String getOznaka() {
        return oznaka;
    }

    public void setOznaka(String oznaka) {
        this.oznaka = oznaka;
    }

    public int getKapacitet() {
        return kapacitet;
    }

    public void setKapacitet(int kapacitet) {
        this.kapacitet = kapacitet;
    }

    @Override
    public String toString() {
        return "Sto{" + "id=" + id + ", oznaka=" + oznaka + ", kapacitet=" + kapacitet + '}';
    }

    public static boolean sacuvaj(Sto s){
        String query = "INSERT INTO `sto`( `oznaka`, `kapacitet`) VALUES (?,?)";
        Connection con = DB.getKonekcija();
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, s.getOznaka());
            ps.setInt(2, s.getKapacitet());
            
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            Logger.getLogger(Sto.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
    public static boolean izmeni(Sto s){
        String query = "UPDATE `sto` SET `oznaka`=?,`kapacitet`=? WHERE `id`=?";
        try {
            PreparedStatement ps = DB.getKonekcija().prepareStatement(query);
            ps.setString(1, s.getOznaka());
            ps.setInt(2, s.getKapacitet());
            ps.setInt(3, s.getId());
            
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            Logger.getLogger(Sto.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public static boolean izbrisi(int id){
        String query = "DELETE FROM `sto` WHERE `id`='"+id+"'";
        try {
            PreparedStatement ps = DB.getKonekcija().prepareStatement(query);
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            Logger.getLogger(Sto.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
    public static ArrayList<Sto> listaStolova(String podatak){
        ArrayList<Sto> lista = new ArrayList<>();
        Sto s;
        String query = "SELECT * FROM `sto` WHERE CONCAT (`oznaka`, `kapacitet`) LIKE ?"
                     + "ORDER BY `kapacitet`";
        try {
            PreparedStatement ps = DB.getKonekcija().prepareStatement(query);
            ps.setString(1, "%"+podatak+"%");
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                s = new Sto(rs.getInt(1), rs.getString(2), rs.getInt(3));
                lista.add(s);
            }
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(Sto.class.getName()).log(Level.SEVERE, null, ex);
            return null;            
        }
        
    }
}

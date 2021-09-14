
package javaapplication_kafic;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.sql.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Rezervacija {
    private String ime, sto;
    private Date datum;

    public Rezervacija() {
        this.ime = this.sto = "";
        this.datum = null;
    }

    public Rezervacija(String ime, String sto, Date datum) {
        this.ime = ime;
        this.sto = sto;
        this.datum = datum;
    }


    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getSto() {
        return sto;
    }

    public void setSto(String sto) {
        this.sto = sto;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    

    
    
    
    
    public static boolean izbrisi(String ime, Date datum){
        String query = "DELETE FROM `rezervacija` WHERE `ime`='"+ime+"' AND `datum`='"+datum+"'";
        try {
            PreparedStatement ps = DB.getKonekcija().prepareStatement(query);
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            Logger.getLogger(Rezervacija.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public static boolean izbrisiIstekleRezervacije(){
        String query = "DELETE FROM `rezervacija` WHERE `datum` < CURRENT_DATE";
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
       
        try {
            PreparedStatement ps = DB.getKonekcija().prepareStatement(query);
            return ps.executeUpdate() > 0;
            
        } catch (SQLException ex) {
            Logger.getLogger(Rezervacija.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    /*public static boolean rezervisi(Rezervacija r){
        if(!new Rezervacija().proveriIme(r)){
            if(!new Rezervacija().proveriSto(r)){
                String query = "INSERT INTO `rezervacija`(`ime`, `sto`, `datum`) VALUES (?,?,?)";
                try {
                    PreparedStatement ps = DB.getKonekcija().prepareStatement(query);
                    ps.setString(1, r.getIme());
                    ps.setString(2, r.getSto());
                    ps.setDate(3, r.getDatum());
            
                    return ps.executeUpdate()> 0;
                } catch (SQLException ex) {
                    Logger.getLogger(Rezervacija.class.getName()).log(Level.SEVERE, null, ex);
                    return false;
            }
            }else{
                JOptionPane.showMessageDialog(null, "Izabrani sto je zauzet", "Rezervacija", JOptionPane.WARNING_MESSAGE);
                return false;
            }            
        }else{
            JOptionPane.showMessageDialog(null, "Rezervacija sa datim imenom vec postoji", "Rezervacija", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        
    }*/
    
    public static boolean rezervisi(Rezervacija r){
        if(!new Rezervacija().proveriIme(r)){
        String query = "INSERT INTO `rezervacija`(`ime`, `sto`, `datum`) "+
                         "VALUES (?,?,?)";
        try {
            PreparedStatement ps = DB.getKonekcija().prepareStatement(query);
            ps.setString(1, r.getIme());
            ps.setString(2, r.getSto());
            ps.setDate(3, r.getDatum());
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            //Logger.getLogger(Rezervacija.class.getName()).log(Level.SEVERE, null, ex);
             return false;
        }
        }else{
            //JOptionPane.showMessageDialog(null, "Rezervacija sa datim imenom vec postoji", "Rezervacija", JOptionPane.WARNING_MESSAGE);
            return false;
        }
    }         

        
    
    private boolean proveriIme(Rezervacija r){
        String query = "SELECT * FROM `rezervacija` WHERE `ime`=? AND `datum`=?";
        try {
            PreparedStatement ps = DB.getKonekcija().prepareStatement(query);
            ps.setString(1, r.getIme());
           ps.setDate(2, r.getDatum());
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Rezervacija.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return false;
    }
    
    private boolean proveriSto(Rezervacija r){
        String query = "SELECT * FROM `rezervacija` WHERE `sto`=? AND `datum`=?";
        try {
            PreparedStatement ps = DB.getKonekcija().prepareStatement(query);
            ps.setString(1, r.getSto());
            ps.setDate(2, r.getDatum());
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Rezervacija.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return false;
    }
    
    public static ArrayList<Rezervacija> listaRezervacija(Date datum){
        ArrayList<Rezervacija> lista = new ArrayList<>();
        String query = "SELECT * FROM `rezervacija` WHERE `datum`='"+datum+"'";
        try {
            PreparedStatement ps = DB.getKonekcija().prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                lista.add(new Rezervacija(rs.getString(1), rs.getString(2), rs.getDate(3)));
            }
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(Rezervacija.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public static ArrayList<Rezervacija> listaRezervacija(String ime, Date datum){
        ArrayList<Rezervacija> lista = new ArrayList<>();
        String query = "SELECT * FROM `rezervacija` WHERE CONCAT (`ime`) LIKE ? AND `datum`= '"+datum+"'";
        try {
            PreparedStatement ps = DB.getKonekcija().prepareStatement(query);
            ps.setString(1, "%"+ime+"%");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                lista.add(new Rezervacija(rs.getString(1), rs.getString(2), rs.getDate(3)));
            }
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(Rezervacija.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public static ArrayList<Sto> listaSlobodnihStolova(Date datum){
        ArrayList<Sto> lista = new ArrayList<>();
        Sto s;
        String query = "SELECT sto.oznaka, sto.kapacitet\n" +
                       "FROM sto\n" +
                       "WHERE NOT EXISTS (SELECT rezervacija.sto FROM rezervacija\n" +
                       "                  WHERE sto.oznaka = rezervacija.sto\n" +
                       "                  AND rezervacija.datum='"+datum+"')"
                     + "ORDER BY sto.kapacitet";
        try {
            PreparedStatement ps = DB.getKonekcija().prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                s = new Sto(null, rs.getString(1), rs.getInt(2));
                lista.add(s);
            }
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(Sto.class.getName()).log(Level.SEVERE, null, ex);
            return null;            
        }
        
    }
}

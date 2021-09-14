
package javaapplication_kafic;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Admin {
    private String korisnickoIme;
    private String lozinka;

    public Admin(String korisnickoIme, String lozinka) {
        this.korisnickoIme = korisnickoIme;
        this.lozinka = lozinka;
    }

    public String getKorisnickoIme() {
        return korisnickoIme;
    }

    public String getLozinka() {
        return lozinka;
    }
    
    
    public static boolean provera(String korisnicko_ime, String lozinka){
        String duery = "SELECT *FROM `admin`"
                     + "WHERE `korisnicko_ime` = '"+korisnicko_ime+"'"
                     + "AND"
                     + "`lozinka`=PASSWORD('"+lozinka+"')";
        try {
            PreparedStatement ps = DB.getKonekcija().prepareStatement(duery);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                AdminFrame.korisnickoIme = rs.getString(1);
                return true;
            }else{
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public static boolean sacuvaj(Admin a, String staroKorisnickoIme){
        String query = "UPDATE `admin` SET `korisnicko_ime`=?,`lozinka`=PASSWORD(?)"
                     + "WHERE `korisnicko_ime`='"+staroKorisnickoIme+"'";
        try {
            PreparedStatement ps =DB.getKonekcija().prepareStatement(query);
            ps.setString(1, a.getKorisnickoIme());
            ps.setString(2, a.getLozinka());
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}

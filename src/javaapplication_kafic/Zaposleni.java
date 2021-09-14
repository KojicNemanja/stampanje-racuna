
package javaapplication_kafic;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Zaposleni {
    private Integer id;
    private String ime, prezime, korisnickoIme, brojTelefona, adresa, datumRodjenja;

    public Zaposleni() {
        id = null;
        ime = prezime = korisnickoIme = brojTelefona = adresa = datumRodjenja = "";
    }

    public Zaposleni(Integer id, String ime, String prezime, String korisnickoIme, String brojTelefona, String adresa, String datumRodjenja) {
        this.id = id;
        this.ime = ime;
        this.prezime = prezime;
        this.korisnickoIme = korisnickoIme;
        this.brojTelefona = brojTelefona;
        this.adresa = adresa;
        this.datumRodjenja = datumRodjenja;
    }

    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public String getKorisnickoIme() {
        return korisnickoIme;
    }

    public void setKorisnickoIme(String korisnickoIme) {
        this.korisnickoIme = korisnickoIme;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getBrojTelefona() {
        return brojTelefona;
    }

    public void setBrojTelefona(String brojTelefona) {
        this.brojTelefona = brojTelefona;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getDatumRodjenja() {
        return datumRodjenja;
    }

    public void setDatumRodjenja(String datumRodjenja) {
        this.datumRodjenja = datumRodjenja;
    }

    @Override
    public String toString() {
        return "Zaposleni{" + "id=" + id + ", ime=" + ime + ", prezime=" + prezime + ", korisnickoIme=" + korisnickoIme + ", brojTelefona=" + brojTelefona + ", adresa=" + adresa + ", datumRodjenja=" + datumRodjenja + '}';
    }

    
    
    public static boolean sacuvaj(Zaposleni z){
        String query = "INSERT INTO `zaposleni`(`ime`, `prezime`, `korisnicko_ime`, `broj_telefona`, `datum_rodjenja`, `adresa`)"
                     + " VALUES (?,?,?,?,?,?)";
        
        Connection con = DB.getKonekcija();
        try {
            PreparedStatement ps = con.prepareStatement(query);
            
            ps.setString(1, z.getIme());
            ps.setString(2, z.getPrezime());
            ps.setString(3, z.getKorisnickoIme());
            ps.setString(4, z.getBrojTelefona());
            ps.setString(5, z.getDatumRodjenja());
            ps.setString(6, z.getAdresa());
            
            return ps.executeUpdate() > 0;
            
        } catch (SQLException ex) {
           // Logger.getLogger(Zaposleni.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public static ArrayList<Zaposleni> listaZaposlenih(String podatak){
        ArrayList<Zaposleni> lista = new ArrayList<>();
        
        String query ="SELECT * FROM `zaposleni` WHERE CONCAT(`ime`, `prezime`, `broj_telefona`) LIKE ?";
        
        Connection con = DB.getKonekcija();
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, "%"+podatak+"%");
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                lista.add(new Zaposleni(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)));
            }
            return lista;
        } catch (SQLException ex) {
            //Logger.getLogger(Zaposleni.class.getName()).log(Level.SEVERE, null, ex);
            return lista;
        }
    }
    
    public static boolean izmeni(Zaposleni z){
        String query = "UPDATE `zaposleni` SET `ime`=?,`prezime`=?, `korisnicko_ime`=?, `broj_telefona`=?,`datum_rodjenja`=?,`adresa`=? WHERE `id`=?";
        try {
            PreparedStatement ps = DB.getKonekcija().prepareStatement(query);
            ps.setString(1, z.getIme());
            ps.setString(2, z.getPrezime());
            ps.setString(3, z.getKorisnickoIme());
            ps.setString(4, z.getBrojTelefona());
            ps.setString(5, z.getDatumRodjenja());
            ps.setString(6, z.getAdresa());
            ps.setInt(7, z.getId());
            
            return ps.executeUpdate() > 0;
            
        } catch (SQLException ex) {
           // Logger.getLogger(Zaposleni.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public static boolean izbrisi(int id){
        String query = "DELETE FROM `zaposleni` WHERE `id`='"+id+"'";
        try {
            PreparedStatement ps = DB.getKonekcija().prepareStatement(query);
            return ps.executeUpdate() >0;
        } catch (SQLException ex) {
           // Logger.getLogger(Zaposleni.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public static boolean prijaviSe(String korisnickoIme){
        String query = "SELECT * FROM `zaposleni` WHERE `korisnicko_ime`='"+korisnickoIme+"'";
        try {
            PreparedStatement ps = DB.getKonekcija().prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                ZaposleniFrame.jLabel_id1.setText(""+rs.getInt(1));
                return true;
            }
        } catch (SQLException ex) {
           // Logger.getLogger(Zaposleni.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return false;
    }
    
}

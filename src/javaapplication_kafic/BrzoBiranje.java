
package javaapplication_kafic;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class BrzoBiranje {
    private  final int maxBroj;
    private final int x;
    private final int y;
    private final int xRazmak;
    private final int yRazmak;

    public BrzoBiranje() {
        this.maxBroj = 12;
        this.x = 300;
        this.y = 70;
        this.xRazmak = 15;
        this.yRazmak = 10;
    }
    
    public boolean dodaj(int id){
        if(brojac() < maxBroj){
            String query = "INSERT INTO `brzo_biranje`(`proizovd_id`) VALUES (?)";
        try {
            PreparedStatement ps = DB.getKonekcija().prepareStatement(query);
            ps.setInt(1, id);

            return ps.executeUpdate() > 0;

        } catch (SQLException ex) {
            Logger.getLogger(BrzoBiranje.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        }else{
            JOptionPane.showMessageDialog(null, "Popunjen je maksimalan broj proizvoda\nili proizvod vec postoji na listi brzog biranja", "Brzo biranje", JOptionPane.WARNING_MESSAGE);
            return false;
        }

    }

    public boolean izbrisi(int id){
        if(brojac() > 0){
            String query = "DELETE FROM `brzo_biranje` WHERE `proizovd_id`='"+id+"'";
            try {
                PreparedStatement ps = DB.getKonekcija().prepareStatement(query);
                return ps.executeUpdate() > 0;
            } catch (SQLException ex) {
                Logger.getLogger(BrzoBiranje.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        }else{
            return false;
        }
        
    }

    public void popuni(JPanel panel){
        JLabel proizvod;
        String query = "SELECT `proizovd_id`, proizvod.id, proizvod.naziv \n" +
                       "FROM `brzo_biranje` \n" +
                       "INNER JOIN proizvod ON proizvod.id = `proizovd_id`";
        try {
            PreparedStatement ps = DB.getKonekcija().prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            byte kolona = 1;
            byte red = 1;
            int xx = xRazmak;
            int yy = yRazmak;
            while(rs.next()){
                proizvod = new JLabel();
                proizvod.setText(rs.getString(3));
                proizvod.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                proizvod.setOpaque(true);
                proizvod.setCursor(new Cursor(Cursor.HAND_CURSOR));
                proizvod.setPreferredSize(new Dimension(x, y));
                proizvod.setBackground(Color.yellow);
                proizvod.setFont(new Font("Tahoma", Font.BOLD, 14));
                if(kolona == 1 && red == 1){
                    panel.add(proizvod, new org.netbeans.lib.awtextra.AbsoluteConstraints(xx, yy));
                    kolona++;
                }else if( kolona%4 == 0){
                    kolona += 2;
                    red++;
                    xx=this.xRazmak;
                    yy+=this.y+this.yRazmak;

                    panel.add(proizvod, new org.netbeans.lib.awtextra.AbsoluteConstraints(xx, yy));
                }else{
                    xx+=this.x+this.xRazmak;

                    panel.add(proizvod, new org.netbeans.lib.awtextra.AbsoluteConstraints(xx, yy));
                    kolona++;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(BrzoBiranje.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private int brojac(){
        int b=12;
        String query = "SELECT COUNT(*) FROM `brzo_biranje`";
        
        try {
            PreparedStatement ps = DB.getKonekcija().prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                b = rs.getInt("COUNT(*)");
                return b;
            }
            return b;
        } catch (SQLException ex) {
            Logger.getLogger(BrzoBiranje.class.getName()).log(Level.SEVERE, null, ex);
            return 12;
        }

    }

}


package javaapplication_kafic;

import java.awt.Color;
import java.awt.Event;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class ZaposleniFrame extends javax.swing.JFrame {
    public static int id;
     
    public ZaposleniFrame() {
        initComponents();
        prikaz();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jDesktopPane_prikaz = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel_admin = new javax.swing.JLabel();
        jLabel_id1 = new javax.swing.JLabel();
        jLabel_id = new javax.swing.JLabel();
        jLabel_datum = new javax.swing.JLabel();
        jLabel_rezervacija = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel_poruka = new javax.swing.JLabel();
        jPasswordField_korisnickoIme = new javax.swing.JPasswordField();
        jCheckBox_prikaziTekst = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 204, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jDesktopPane_prikazLayout = new javax.swing.GroupLayout(jDesktopPane_prikaz);
        jDesktopPane_prikaz.setLayout(jDesktopPane_prikazLayout);
        jDesktopPane_prikazLayout.setHorizontalGroup(
            jDesktopPane_prikazLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1366, Short.MAX_VALUE)
        );
        jDesktopPane_prikazLayout.setVerticalGroup(
            jDesktopPane_prikazLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );

        jPanel1.add(jDesktopPane_prikaz, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 1366, 590));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/x.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 10, -1, 40));

        jLabel_admin.setBackground(new java.awt.Color(232, 126, 4));
        jLabel_admin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_admin.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_admin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_admin.setText("Admin");
        jLabel_admin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_admin.setOpaque(true);
        jLabel_admin.setPreferredSize(new java.awt.Dimension(150, 40));
        jLabel_admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_adminMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_adminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_adminMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel_adminMousePressed(evt);
            }
        });
        jPanel1.add(jLabel_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel_id1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_id1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_id1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel_id1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_id1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel_id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 180, 20));

        jLabel_id.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_id.setText("ID:");
        jLabel_id.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel_id.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_idMouseClicked(evt);
            }
        });
        jPanel1.add(jLabel_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, -1, -1));

        jLabel_datum.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_datum.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_datum.setPreferredSize(new java.awt.Dimension(250, 30));
        jPanel1.add(jLabel_datum, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, -1, -1));

        jLabel_rezervacija.setBackground(new java.awt.Color(232, 126, 4));
        jLabel_rezervacija.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_rezervacija.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_rezervacija.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_rezervacija.setText("Rezervacija");
        jLabel_rezervacija.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_rezervacija.setOpaque(true);
        jLabel_rezervacija.setPreferredSize(new java.awt.Dimension(150, 40));
        jLabel_rezervacija.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_rezervacijaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_rezervacijaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_rezervacijaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel_rezervacijaMousePressed(evt);
            }
        });
        jPanel1.add(jLabel_rezervacija, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 52)); // NOI18N
        jLabel2.setText("-");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1287, 10, 20, 50));

        jLabel_poruka.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel_poruka.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_poruka.setText("Nesipravno korisinicko ime");
        jPanel1.add(jLabel_poruka, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, 250, 30));

        jPasswordField_korisnickoIme.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPasswordField_korisnickoIme.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField_korisnickoImeKeyPressed(evt);
            }
        });
        jPanel1.add(jPasswordField_korisnickoIme, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, 250, 40));

        jCheckBox_prikaziTekst.setText("Prkaži tekst");
        jCheckBox_prikaziTekst.setContentAreaFilled(false);
        jCheckBox_prikaziTekst.setPreferredSize(new java.awt.Dimension(100, 20));
        jCheckBox_prikaziTekst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_prikaziTekstActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox_prikaziTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 120, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        int odg = JOptionPane.showConfirmDialog(rootPane, "Da li ste sigurni da zelite da napustite aplikaciju ?", "Izlaz iz aplikacije", JOptionPane.YES_NO_OPTION);
        if(odg == 0){
            if(!PorudzbinaJInternalFrame.jTextArea_racun.getText().equals("")){
                ponistiRacun();
            }
            System.exit(0);
        }
        
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel_adminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_adminMouseClicked
        new LoginFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel_adminMouseClicked
    
    Timer timer = new Timer(3000, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                jLabel_poruka.setVisible(false);
            }
        });
      
    private void jLabel_id1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_id1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_id1MouseClicked

    private void jLabel_idMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_idMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_idMouseClicked

    private void jLabel_adminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_adminMouseEntered
        jLabel_admin.setBackground(Color.white);
        jLabel_admin.setForeground(Color.black);
        jLabel_admin.setFont(new Font("Tahoma", Font.BOLD, 18));
    }//GEN-LAST:event_jLabel_adminMouseEntered

    private void jLabel_adminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_adminMouseExited
        jLabel_admin.setBackground(new Color(232,126,4));
        jLabel_admin.setForeground(Color.white);
        jLabel_admin.setFont(new Font("Tahoma", Font.BOLD, 14));
    }//GEN-LAST:event_jLabel_adminMouseExited

    private void jLabel_rezervacijaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_rezervacijaMouseClicked
        new RezervacijaFrame().setVisible(true);
    }//GEN-LAST:event_jLabel_rezervacijaMouseClicked

    private void jLabel_rezervacijaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_rezervacijaMouseEntered
        jLabel_rezervacija.setBackground(Color.white);
        jLabel_rezervacija.setForeground(Color.black);
        jLabel_rezervacija.setFont(new Font("Tahoma", Font.BOLD, 18));
    }//GEN-LAST:event_jLabel_rezervacijaMouseEntered

    private void jLabel_rezervacijaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_rezervacijaMouseExited
        jLabel_rezervacija.setBackground(new Color(232,126,4));
        jLabel_rezervacija.setForeground(Color.white);
        jLabel_rezervacija.setFont(new Font("Tahoma", Font.BOLD, 14));
    }//GEN-LAST:event_jLabel_rezervacijaMouseExited

    private void jLabel_rezervacijaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_rezervacijaMousePressed
        jLabel_rezervacija.setBackground(new Color(34, 167, 240));
    }//GEN-LAST:event_jLabel_rezervacijaMousePressed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel_adminMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_adminMousePressed
        jLabel_admin.setBackground(new Color(34, 167, 240));
    }//GEN-LAST:event_jLabel_adminMousePressed

    private void jPasswordField_korisnickoImeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField_korisnickoImeKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            String korisnickoIme = jPasswordField_korisnickoIme.getText().trim();
            if(Zaposleni.prijaviSe(korisnickoIme)){
            jDesktopPane_prikaz.removeAll();
            jDesktopPane_prikaz.add(new PorudzbinaJInternalFrame()).setVisible(true);
            jPasswordField_korisnickoIme.setText("");
            jCheckBox_prikaziTekst.setSelected(false);
        }else{
            jLabel_poruka.setVisible(true);
            timer.start();
        }  
        }
    }//GEN-LAST:event_jPasswordField_korisnickoImeKeyPressed

    private void jCheckBox_prikaziTekstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_prikaziTekstActionPerformed
        if(jCheckBox_prikaziTekst.isSelected()){
            jPasswordField_korisnickoIme.setEchoChar((char)0);
        }else{
            jPasswordField_korisnickoIme.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox_prikaziTekstActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ZaposleniFrame().setVisible(true);
            }
        });
    }
    
    
    private void prikaz(){
        jPasswordField_korisnickoIme.requestFocus();
        jLabel_datum.setText(new SimpleDateFormat("EEEEE MMMMM yyyy.").format(new Date()));
       // vreme();
        jDesktopPane_prikaz.removeAll();
        jDesktopPane_prikaz.add(new Pocetna()).setVisible(true);
        jLabel_poruka.setVisible(false);
    }
    
    private boolean ponistiRacun(){
        return DB.insertUpdateDelete("DELETE FROM racun");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox_prikaziTekst;
    public static javax.swing.JDesktopPane jDesktopPane_prikaz;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_admin;
    private javax.swing.JLabel jLabel_datum;
    private javax.swing.JLabel jLabel_id;
    public static javax.swing.JLabel jLabel_id1;
    private javax.swing.JLabel jLabel_poruka;
    private javax.swing.JLabel jLabel_rezervacija;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JPasswordField jPasswordField_korisnickoIme;
    // End of variables declaration//GEN-END:variables
}

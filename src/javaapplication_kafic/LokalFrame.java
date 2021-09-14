
package javaapplication_kafic;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class LokalFrame extends javax.swing.JFrame {
    private final int id = 1;
    private boolean lokacija = false;
    public LokalFrame() {
        initComponents();
        jLabel_poruka.setVisible(false);
       // prikaziDetalje();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_naziv = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane_adresa = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();
        jButton_sacuvaj = new javax.swing.JButton();
        jLabel_poruka = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(102, 102, 102));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Lokal");
        jLabel6.setOpaque(true);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 60));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Adresa:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Nziv:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        jTextField_naziv.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(jTextField_naziv, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 320, 30));

        jTextPane_adresa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jScrollPane1.setViewportView(jTextPane_adresa);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 320, 80));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/izadji.png"))); // NOI18N
        jButton1.setText("Izadji");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setPreferredSize(new java.awt.Dimension(130, 35));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, -1, -1));

        jButton_sacuvaj.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_sacuvaj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sacuvaj.png"))); // NOI18N
        jButton_sacuvaj.setText("Sacuvaj");
        jButton_sacuvaj.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_sacuvaj.setPreferredSize(new java.awt.Dimension(130, 35));
        jButton_sacuvaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_sacuvajActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_sacuvaj, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, -1, -1));

        jLabel_poruka.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_poruka.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_poruka.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_poruka.setText("Adresa jos uvek nije dodata");
        jPanel1.add(jLabel_poruka, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 320, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_sacuvajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_sacuvajActionPerformed
        sacuvajPodatke();
    }//GEN-LAST:event_jButton_sacuvajActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        String query = "SELECT * FROM `lokal` WHERE `id`=?";
        try {
            PreparedStatement ps = DB.getKonekcija().prepareStatement(query);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
            jTextField_naziv.setText(rs.getString(2));
            jTextPane_adresa.setText(rs.getString(3));
            lokacija=true;
            }else{
                jLabel_poruka.setVisible(true);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LokalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formComponentShown

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LokalFrame().setVisible(true);
            }
        });
    }
    private void dodajAdresu(){
        String query = "INSERT INTO `lokal`(`id`, `naziv`, `adresa`) VALUES (?,?,?)";
        try {
            PreparedStatement ps = DB.getKonekcija().prepareStatement(query);
            ps.setInt(1, id);
            ps.setString(2, jTextField_naziv.getText());
            ps.setString(3, jTextPane_adresa.getText());
            
            if(ps.executeUpdate() > 0){
                JOptionPane.showMessageDialog(null, "Adresa je uspesno dodata", "Adresa", JOptionPane.INFORMATION_MESSAGE);
                jLabel_poruka.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(null, "Greska pri dodavanja adrese","Adresa", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LokalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void sacuvajPodatke(){
        if(lokacija == true){
        String query = "UPDATE `lokal` SET `naziv`=?, `adresa`=? WHERE `id`=?";
        try {
            PreparedStatement ps = DB.getKonekcija().prepareStatement(query);
            ps.setString(1, jTextField_naziv.getText());
            ps.setString(2, jTextPane_adresa.getText());
            ps.setInt(3, id);
            
            if(ps.executeUpdate() > 0){
                JOptionPane.showMessageDialog(null, "Uspesno sacuvano", "Adresa", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Greska pri cuvanju podataka", "Adresa", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LokalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        }else{
            dodajAdresu();
        }
    }
    
    private void prikaziDetalje(){
        String query = "SELECT * FROM `lokal` WHERE `id`=?";
        try {
            PreparedStatement ps = DB.getKonekcija().prepareStatement(query);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
            jTextField_naziv.setText(rs.getString(2));
            jTextPane_adresa.setText(rs.getString(3));
            }else{
                jLabel_poruka.setVisible(true);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LokalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_sacuvaj;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_poruka;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField_naziv;
    private javax.swing.JTextPane jTextPane_adresa;
    // End of variables declaration//GEN-END:variables
}

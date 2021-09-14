
package javaapplication_kafic;
import java.awt.Color;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class NovaRezervacijaFrame extends javax.swing.JFrame {

    public NovaRezervacijaFrame() {
        initComponents();
        
        jDateChooser_datum.setSelectableDateRange(new java.util.Date(), null);
        jDateChooser_datum.setDate(new java.util.Date());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_sto = new javax.swing.JTextField();
        jTextField_ime = new javax.swing.JTextField();
        jDateChooser_datum = new com.toedter.calendar.JDateChooser();
        jButton_sacuvaj = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton_izaberi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 204, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(480, 370));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Datum:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Ime:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Sto:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jTextField_sto.setEditable(false);
        jTextField_sto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_sto.setPreferredSize(new java.awt.Dimension(250, 30));
        jPanel1.add(jTextField_sto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, -1, -1));

        jTextField_ime.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_ime.setPreferredSize(new java.awt.Dimension(250, 30));
        jPanel1.add(jTextField_ime, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, -1, -1));

        jDateChooser_datum.setDateFormatString("dd/MM/yyyy");
        jDateChooser_datum.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jDateChooser_datum.setMinSelectableDate(new java.util.Date(-62135769506000L));
        jPanel1.add(jDateChooser_datum, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 170, 30));

        jButton_sacuvaj.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_sacuvaj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sacuvaj.png"))); // NOI18N
        jButton_sacuvaj.setText("Sacuvaj");
        jButton_sacuvaj.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_sacuvaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_sacuvajActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_sacuvaj, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 140, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/x.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, -1, -1));

        jButton_izaberi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_izaberi.setText("Izaberi");
        jButton_izaberi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_izaberi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_izaberiActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_izaberi, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_sacuvajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_sacuvajActionPerformed
        if(jTextField_ime.getText().isEmpty() || jTextField_sto.getText().isEmpty() ||
           jDateChooser_datum.getDate() == null){
            JOptionPane.showMessageDialog(rootPane, "Unesite sve podatke", "Rezervacija", JOptionPane.WARNING_MESSAGE);
        }else{ 
        java.util.Date datum = jDateChooser_datum.getDate();
            java.sql.Date datum1 = new java.sql.Date(datum.getTime());
            if(Rezervacija.rezervisi(new Rezervacija(jTextField_ime.getText(), jTextField_sto.getText(), datum1))){
                JOptionPane.showMessageDialog(rootPane, "Uspesno ste rezervisali", "Rezervacija", JOptionPane.INFORMATION_MESSAGE);
                new NovaRezervacijaFrame().setVisible(true);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(rootPane, "Greska pri rezervaciji\nMozda postoji rezervacija sa datim imenom", "Rezervacija", JOptionPane.ERROR_MESSAGE);
            }
            }
        
        /*if(jTextField_ime.getText().isEmpty() || jTextField_sto.getText().isEmpty() ||
           jDateChooser_datum.getDate() == null){
            JOptionPane.showMessageDialog(rootPane, "Unesite sve podatke", "Rezervacija", JOptionPane.WARNING_MESSAGE);
        }else{
            java.util.Date datum = jDateChooser_datum.getDate();
            java.sql.Date datum1 = new java.sql.Date(datum.getTime());
            if(Rezervacija.rezervisi(new Rezervacija(jTextField_ime.getText(), jTextField_sto.getText(), datum1))){
                JOptionPane.showMessageDialog(rootPane, "Uspesno ste rezervisali", "Rezervacija", JOptionPane.INFORMATION_MESSAGE);
                new NovaRezervacijaFrame().setVisible(true);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(rootPane, "Greska pri rezervaciji", "Rezervacija", JOptionPane.ERROR_MESSAGE);
            }
        }
        */
        
        
    }//GEN-LAST:event_jButton_sacuvajActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
      //  new RezervacijaFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jButton_izaberiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_izaberiActionPerformed
        new IzaberiStoFrame().setVisible(true);
    }//GEN-LAST:event_jButton_izaberiActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NovaRezervacijaFrame().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_izaberi;
    private javax.swing.JButton jButton_sacuvaj;
    public static com.toedter.calendar.JDateChooser jDateChooser_datum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField_ime;
    public static javax.swing.JTextField jTextField_sto;
    // End of variables declaration//GEN-END:variables
}

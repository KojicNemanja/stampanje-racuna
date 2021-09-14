
package javaapplication_kafic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DodajZaposleniFrame extends javax.swing.JFrame {

    public DodajZaposleniFrame() {
        initComponents();
        Calendar cal = Calendar.getInstance();
        Calendar cal1 = Calendar.getInstance();
        cal.add(Calendar.YEAR, -18);
        cal1.add(Calendar.YEAR, -35);
        Date max = cal.getTime();
        Date min = cal1.getTime();
        jDateChooser_datumRodjenja.setSelectableDateRange(min, max);
        jDateChooser_datumRodjenja.setDate(max);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField_brojTelefona = new javax.swing.JTextField();
        jTextField_ime = new javax.swing.JTextField();
        jTextField_prezime = new javax.swing.JTextField();
        jDateChooser_datumRodjenja = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane_adresa = new javax.swing.JTextPane();
        jButton_sacuvaj = new javax.swing.JButton();
        jButton_izadji = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField_korisnickoIme = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(600, 550));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Adresa:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Ime:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Prezime:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Broj telefona:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Datum rodjenja:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        jLabel6.setBackground(new java.awt.Color(102, 102, 102));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Novi radnik");
        jLabel6.setOpaque(true);
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 60));

        jTextField_brojTelefona.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(jTextField_brojTelefona, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 330, 30));

        jTextField_ime.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(jTextField_ime, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 330, 30));

        jTextField_prezime.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(jTextField_prezime, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 330, 30));

        jDateChooser_datumRodjenja.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(jDateChooser_datumRodjenja, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 180, 30));

        jTextPane_adresa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jScrollPane1.setViewportView(jTextPane_adresa);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 330, 80));

        jButton_sacuvaj.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_sacuvaj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sacuvaj.png"))); // NOI18N
        jButton_sacuvaj.setText("Sacuvaj");
        jButton_sacuvaj.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_sacuvaj.setPreferredSize(new java.awt.Dimension(130, 35));
        jButton_sacuvaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_sacuvajActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_sacuvaj, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 490, -1, -1));

        jButton_izadji.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_izadji.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/izadji.png"))); // NOI18N
        jButton_izadji.setText("Izadji");
        jButton_izadji.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_izadji.setPreferredSize(new java.awt.Dimension(130, 35));
        jButton_izadji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_izadjiActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_izadji, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 490, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Korisnicko ime:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jTextField_korisnickoIme.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(jTextField_korisnickoIme, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 330, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_izadjiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_izadjiActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton_izadjiActionPerformed

    private void jButton_sacuvajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_sacuvajActionPerformed
        if( jTextField_ime.getText().trim().equals("") || 
            jTextField_ime.getText().trim().equals("") ||
            jTextField_korisnickoIme.getText().trim().equals("") ||
            jTextField_brojTelefona.getText().trim().equals("")  ||
            jDateChooser_datumRodjenja.getDate() == null ||
            jTextPane_adresa.getText().trim().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Postoje prazna polja", "sacuvaj", JOptionPane.WARNING_MESSAGE);
        }else{
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String datumRodjenja = sdf.format(jDateChooser_datumRodjenja.getDate());
            Zaposleni z = new Zaposleni(null, jTextField_ime.getText(), 
                                          jTextField_prezime.getText(),
                                          jTextField_korisnickoIme.getText(),
                                          jTextField_brojTelefona.getText(), 
                                          jTextPane_adresa.getText(), 
                                          datumRodjenja);
            if( Zaposleni.sacuvaj(z) ){
                JOptionPane.showMessageDialog(null, "Zaposleni je uspesno sacuvan", "Novi radnik", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
                new DodajZaposleniFrame().setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "Greska pri cuvanju novog podataka", "Novi radnik", JOptionPane.ERROR_MESSAGE);
            }
        }
       
    }//GEN-LAST:event_jButton_sacuvajActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DodajZaposleniFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_izadji;
    private javax.swing.JButton jButton_sacuvaj;
    private com.toedter.calendar.JDateChooser jDateChooser_datumRodjenja;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField_brojTelefona;
    private javax.swing.JTextField jTextField_ime;
    private javax.swing.JTextField jTextField_korisnickoIme;
    private javax.swing.JTextField jTextField_prezime;
    private javax.swing.JTextPane jTextPane_adresa;
    // End of variables declaration//GEN-END:variables
}

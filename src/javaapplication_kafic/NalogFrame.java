
package javaapplication_kafic;

import javax.swing.JOptionPane;

public class NalogFrame extends javax.swing.JFrame {

    public NalogFrame() {
        initComponents();
        try{
            jTextField_korisnickoIme.setText(AdminFrame.korisnickoIme);
        }catch(Exception e){
            
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_korisnickoIme = new javax.swing.JTextField();
        jPasswordField_novaLozinka = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jPasswordField_lozinka = new javax.swing.JPasswordField();
        jButton_sacuvaj = new javax.swing.JButton();
        jButton_izadji = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Korisnicko ime:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("Nova lozinka:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, 30));

        jTextField_korisnickoIme.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField_korisnickoIme.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_korisnickoImeFocusGained(evt);
            }
        });
        jTextField_korisnickoIme.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_korisnickoImeKeyPressed(evt);
            }
        });
        jPanel2.add(jTextField_korisnickoIme, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 280, 30));

        jPasswordField_novaLozinka.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPasswordField_novaLozinka.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField_novaLozinkaKeyPressed(evt);
            }
        });
        jPanel2.add(jPasswordField_novaLozinka, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 280, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("Ponovi lozinku:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, 30));

        jPasswordField_lozinka.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPasswordField_lozinka.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField_lozinkaKeyPressed(evt);
            }
        });
        jPanel2.add(jPasswordField_lozinka, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 280, 30));

        jButton_sacuvaj.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_sacuvaj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sacuvaj.png"))); // NOI18N
        jButton_sacuvaj.setText("Sacuvaj");
        jButton_sacuvaj.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_sacuvaj.setPreferredSize(new java.awt.Dimension(150, 40));
        jButton_sacuvaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_sacuvajActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_sacuvaj, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, -1, -1));

        jButton_izadji.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_izadji.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/izadji.png"))); // NOI18N
        jButton_izadji.setText("Iadji");
        jButton_izadji.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_izadji.setPreferredSize(new java.awt.Dimension(150, 40));
        jButton_izadji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_izadjiActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_izadji, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, -1, -1));

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Unesi nove podatke");
        jLabel1.setOpaque(true);
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 430));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_korisnickoImeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_korisnickoImeFocusGained

    }//GEN-LAST:event_jTextField_korisnickoImeFocusGained

    private void jTextField_korisnickoImeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_korisnickoImeKeyPressed
        
    }//GEN-LAST:event_jTextField_korisnickoImeKeyPressed

    private void jPasswordField_novaLozinkaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField_novaLozinkaKeyPressed

    }//GEN-LAST:event_jPasswordField_novaLozinkaKeyPressed

    private void jPasswordField_lozinkaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField_lozinkaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField_lozinkaKeyPressed

    private void jButton_izadjiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_izadjiActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton_izadjiActionPerformed

    private void jButton_sacuvajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_sacuvajActionPerformed
        if(!(jTextField_korisnickoIme.getText().isEmpty() ||
                jPasswordField_lozinka.getText().isEmpty() ||
                jPasswordField_novaLozinka.getText().isEmpty())){
            if(jPasswordField_lozinka.getText().equals(jPasswordField_novaLozinka.getText())){
                String staroKorisnickoIme = AdminFrame.korisnickoIme;
                if(Admin.sacuvaj(new Admin(
                        jTextField_korisnickoIme.getText(),
                        jPasswordField_novaLozinka.getText()), staroKorisnickoIme)){
                    AdminFrame.korisnickoIme = jTextField_korisnickoIme.getText();
                    JOptionPane.showMessageDialog(rootPane, "Podaci su uspesno izmenjeni");
                    this.dispose();
                    new NalogFrame().setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Greska prilikom izmene podataka", "Greska", JOptionPane.ERROR_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(rootPane, "Lozinke se ne poklapaju", "Greska", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Postoje prazna polja", "Poruka", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton_sacuvajActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NalogFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NalogFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NalogFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NalogFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NalogFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_izadji;
    private javax.swing.JButton jButton_sacuvaj;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField_lozinka;
    private javax.swing.JPasswordField jPasswordField_novaLozinka;
    private javax.swing.JTextField jTextField_korisnickoIme;
    // End of variables declaration//GEN-END:variables
}

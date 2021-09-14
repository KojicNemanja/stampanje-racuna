
package javaapplication_kafic;

import java.awt.Event;
import javax.swing.Action;
import javax.swing.JOptionPane;

public class LoginFrame extends javax.swing.JFrame {

    public LoginFrame() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_korisnickoIme = new javax.swing.JTextField();
        jPasswordField_lozinka = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jButton_login = new javax.swing.JButton();
        jCheckBox_prikaziLozinku = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 204, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(232, 126, 4));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 36))); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(600, 300));
        jPanel2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel2KeyPressed(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Korisnicko ime:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, -1, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("Lozinka:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, -1, 30));

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
        jPanel2.add(jTextField_korisnickoIme, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 280, 30));

        jPasswordField_lozinka.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPasswordField_lozinka.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField_lozinkaKeyPressed(evt);
            }
        });
        jPanel2.add(jPasswordField_lozinka, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 280, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/korisnik.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 80, -1, -1));

        jButton_login.setBackground(new java.awt.Color(0, 204, 0));
        jButton_login.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jButton_login.setForeground(new java.awt.Color(255, 255, 255));
        jButton_login.setText("Idi");
        jButton_login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_loginActionPerformed(evt);
            }
        });
        jButton_login.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton_loginKeyPressed(evt);
            }
        });
        jPanel2.add(jButton_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 250, 120, 35));

        jCheckBox_prikaziLozinku.setBackground(new java.awt.Color(232, 126, 4));
        jCheckBox_prikaziLozinku.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox_prikaziLozinku.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox_prikaziLozinku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_prikaziLozinkuActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox_prikaziLozinku, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 20, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("Prikazi lozinku");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Admin");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 202, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/x.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 10, -1, -1));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pozadinaLogin.jpg"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_korisnickoImeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_korisnickoImeFocusGained
        
    }//GEN-LAST:event_jTextField_korisnickoImeFocusGained

    private void jButton_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_loginActionPerformed
        if(jTextField_korisnickoIme.getText().trim().equals("") ||
           jPasswordField_lozinka.getText().trim().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Unesite sva polja", "Login", JOptionPane.WARNING_MESSAGE);
        }
        else if(Admin.provera(jTextField_korisnickoIme.getText(), jPasswordField_lozinka.getText())){
            new AdminFrame().setVisible(true);
            this.dispose();

        }else{
            JOptionPane.showMessageDialog(rootPane, "korisnicko ime ili lozinka nisu ispravni", "Login", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton_loginActionPerformed

    private void jCheckBox_prikaziLozinkuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_prikaziLozinkuActionPerformed
        if(jCheckBox_prikaziLozinku.isSelected()){
            jPasswordField_lozinka.setEchoChar((char)0);
        }else{
            jPasswordField_lozinka.setEchoChar('\u25cf');
        }
    }//GEN-LAST:event_jCheckBox_prikaziLozinkuActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.dispose();
        new ZaposleniFrame().setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jPanel2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel2KeyPressed
         
    }//GEN-LAST:event_jPanel2KeyPressed

    private void jTextField_korisnickoImeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_korisnickoImeKeyPressed
         if(evt.getKeyCode() == Event.ENTER){
             jButton_login.doClick();
        } 
    }//GEN-LAST:event_jTextField_korisnickoImeKeyPressed

    private void jPasswordField_lozinkaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField_lozinkaKeyPressed
        
        if(evt.getKeyCode() == Event.ENTER){
            jButton_login.doClick();
        } 
       
    }//GEN-LAST:event_jPasswordField_lozinkaKeyPressed

    private void jButton_loginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton_loginKeyPressed
        if(evt.getKeyCode() == Event.ENTER){
             if(jTextField_korisnickoIme.getText().trim().equals("") ||
           jPasswordField_lozinka.getText().trim().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Unesite sva polja", "Login", JOptionPane.WARNING_MESSAGE);
        }
        else if(jTextField_korisnickoIme.getText().equals("admin") &&
           jPasswordField_lozinka.getText().equals("admin")){
            new AdminFrame().setVisible(true);
            this.dispose();

        }else{
            JOptionPane.showMessageDialog(rootPane, "korisnicko ime ili lozinka nisu ispravni", "Login", JOptionPane.WARNING_MESSAGE);
        }
        } 
    }//GEN-LAST:event_jButton_loginKeyPressed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_login;
    private javax.swing.JCheckBox jCheckBox_prikaziLozinku;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField_lozinka;
    private javax.swing.JTextField jTextField_korisnickoIme;
    // End of variables declaration//GEN-END:variables
}

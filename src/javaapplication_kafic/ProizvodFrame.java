
package javaapplication_kafic;

import javax.swing.JOptionPane;

public class ProizvodFrame extends javax.swing.JFrame {

    public ProizvodFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_naziv = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField_cena = new javax.swing.JTextField();
        jButton_sacuvaj = new javax.swing.JButton();
        jButton_izadji = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 350));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Naziv:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 140, 50, -1));

        jTextField_naziv.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(jTextField_naziv, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 360, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Cena:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        jTextField_cena.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(jTextField_cena, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 220, 30));

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
        jPanel1.add(jButton_sacuvaj, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, -1, -1));

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
        jPanel1.add(jButton_izadji, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, -1, -1));

        jLabel6.setBackground(new java.awt.Color(102, 102, 102));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Novi prizvod");
        jLabel6.setOpaque(true);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_sacuvajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_sacuvajActionPerformed
        if(jTextField_naziv.getText().trim().equals("") || jTextField_cena.getText().trim().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Posotje prazna polja", "Sacuvaj", JOptionPane.WARNING_MESSAGE);
        }else{
            String naziv = jTextField_naziv.getText();
            float cena = 0;
            try{
                cena = Float.parseFloat(jTextField_cena.getText());
            }catch(Exception e){
                JOptionPane.showMessageDialog(rootPane, "Greska u ceni");
            }
        Proizvod p = new Proizvod(null, naziv, cena);
        if(Proizvod.sacuvaj(p)){
            JOptionPane.showMessageDialog(rootPane, "Podaci su uspesno sacuvani","Novi proizvod", JOptionPane.INFORMATION_MESSAGE);
            new ProizvodFrame().setVisible(true);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(rootPane, "Podatak nije sacuvan", "Novi proizvod", JOptionPane.ERROR_MESSAGE);
        }
        }
        
    }//GEN-LAST:event_jButton_sacuvajActionPerformed

    private void jButton_izadjiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_izadjiActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton_izadjiActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProizvodFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_izadji;
    private javax.swing.JButton jButton_sacuvaj;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField_cena;
    private javax.swing.JTextField jTextField_naziv;
    // End of variables declaration//GEN-END:variables
}

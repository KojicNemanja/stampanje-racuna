
package javaapplication_kafic;

import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class StoFrame extends javax.swing.JFrame {

    public StoFrame() {
        initComponents();
        JLabel labela = new JLabel("pivo");
        labela.setPreferredSize(new Dimension(200, 50));
        labela.setLocation(10, 10);
        labela.setText("Pivoooo");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_oznaka = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSpinner_kapacitet = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(102, 102, 102));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Novi sto");
        jLabel6.setOpaque(true);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 60));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Oznaka:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 132, -1, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Kapacitet:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 192, -1, 30));

        jTextField_oznaka.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(jTextField_oznaka, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 210, 30));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/izadji.png"))); // NOI18N
        jButton1.setText("Izadji");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setPreferredSize(new java.awt.Dimension(150, 40));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sacuvaj.png"))); // NOI18N
        jButton2.setText("Sacuvaj");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setPreferredSize(new java.awt.Dimension(150, 40));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        jSpinner_kapacitet.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jSpinner_kapacitet.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(2), Integer.valueOf(2), null, Integer.valueOf(1)));
        jSpinner_kapacitet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jSpinner_kapacitet.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel1.add(jSpinner_kapacitet, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 350));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(jTextField_oznaka.getText().trim().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Unesite oznaku", "Sacuvaj", JOptionPane.WARNING_MESSAGE);
        }else{
            Sto s = new Sto(null, jTextField_oznaka.getText(), Integer.parseInt(jSpinner_kapacitet.getValue().toString()));
            if(Sto.sacuvaj(s)){
                JOptionPane.showMessageDialog(rootPane, "Podaci su uspesno sacuvani", "Novi sto", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
                new StoFrame().setVisible(true);
            }else{
            JOptionPane.showMessageDialog(rootPane, "Greska pri cuvanj novig podatka", "Novi sto", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StoFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinner_kapacitet;
    private javax.swing.JTextField jTextField_oznaka;
    // End of variables declaration//GEN-END:variables
}


package javaapplication_kafic;

import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.JTableHeader;

public class IzaberiStoFrame extends javax.swing.JFrame {

    public IzaberiStoFrame() {
        initComponents();
        popuniTabelu("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_tabela = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton_zatvor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sto", "kapcitet"
            }
        ));
        jTable_tabela.setRowHeight(50);
        jScrollPane1.setViewportView(jTable_tabela);
        if (jTable_tabela.getColumnModel().getColumnCount() > 0) {
            jTable_tabela.getColumnModel().getColumn(0).setPreferredWidth(200);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 380, 520));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(102, 153, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Izaberi");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 90, 30));

        jButton_zatvor.setBackground(new java.awt.Color(255, 51, 51));
        jButton_zatvor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_zatvor.setForeground(new java.awt.Color(255, 255, 255));
        jButton_zatvor.setText("Zatvori");
        jButton_zatvor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_zatvor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_zatvorActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_zatvor, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 560, 90, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_zatvorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_zatvorActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton_zatvorActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
            NovaRezervacijaFrame.jTextField_sto.setText(jTable_tabela.getValueAt(jTable_tabela.getSelectedRow(), 0).toString());
            this.dispose();
        }catch(Exception e){
            this.dispose();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IzaberiStoFrame().setVisible(true);
            }
        });
    }
    
    private void popuniTabelu(String podatak){
        try{
            java.sql.Date datum = new java.sql.Date(NovaRezervacijaFrame.jDateChooser_datum.getDate().getTime());
        
        ArrayList<Sto> lista = Rezervacija.listaSlobodnihStolova(datum);
        if( lista.size()!=0 ){
            String[] kolona = {"Sto", "Kapacitet"};
            Object[][] red = new Object[lista.size()][kolona.length];
            
            for(int i=0; i<lista.size(); i++){
              
                    red[i][0] = lista.get(i).getOznaka();
                    red[i][1] = lista.get(i).getKapacitet();
            }
            
            jTable_tabela.setModel(new Model(red, kolona));
        }
        }catch (Exception e){
            JOptionPane.showMessageDialog(rootPane, "Datum nije ispravan", "rezervacija", JOptionPane.ERROR_MESSAGE);
        }
        izgledTabele();
    }
    
    private void izgledTabele(){
        JTableHeader jth = jTable_tabela.getTableHeader();
        jth.setFont(new Font("Tahoma", Font.BOLD, 15));
        jTable_tabela.getColumnModel().getColumn(0).setPreferredWidth(200);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton_zatvor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_tabela;
    // End of variables declaration//GEN-END:variables
}


package javaapplication_kafic;

import java.awt.Event;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.JTableHeader;

public class StoUpravljajJFrame extends javax.swing.JFrame {

    public StoUpravljajJFrame() {
        initComponents();
        
        popuniTabelu("");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_tabela = new javax.swing.JTable();
        jTextField_pretraga = new javax.swing.JTextField();
        jTextField_oznaka = new javax.swing.JTextField();
        jButton_izmeni = new javax.swing.JButton();
        jButton_izadji = new javax.swing.JButton();
        jButton_izbrisi = new javax.swing.JButton();
        jTextField_id = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSpinner_kapacitet = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 300));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Oznaka", "Kapacitet"
            }
        ));
        jTable_tabela.setRowHeight(50);
        jTable_tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_tabelaMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable_tabelaMouseReleased(evt);
            }
        });
        jTable_tabela.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable_tabelaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable_tabelaKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_tabela);
        if (jTable_tabela.getColumnModel().getColumnCount() > 0) {
            jTable_tabela.getColumnModel().getColumn(1).setPreferredWidth(200);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 500, 370));

        jTextField_pretraga.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jTextField_pretraga.setText("oznaka ili kapacitet");
        jTextField_pretraga.setPreferredSize(new java.awt.Dimension(200, 30));
        jTextField_pretraga.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField_pretragaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTextField_pretragaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField_pretragaMousePressed(evt);
            }
        });
        jTextField_pretraga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_pretragaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_pretragaKeyReleased(evt);
            }
        });
        jPanel1.add(jTextField_pretraga, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 310, -1));

        jTextField_oznaka.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_oznaka.setPreferredSize(new java.awt.Dimension(200, 25));
        jPanel1.add(jTextField_oznaka, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, 280, 30));

        jButton_izmeni.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_izmeni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/izmeni.png"))); // NOI18N
        jButton_izmeni.setText("Izmeni");
        jButton_izmeni.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_izmeni.setPreferredSize(new java.awt.Dimension(150, 40));
        jButton_izmeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_izmeniActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_izmeni, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 320, -1, -1));

        jButton_izadji.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_izadji.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/izadji.png"))); // NOI18N
        jButton_izadji.setText("Izadji");
        jButton_izadji.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_izadji.setPreferredSize(new java.awt.Dimension(150, 40));
        jButton_izadji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_izadjiActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_izadji, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 420, -1, -1));

        jButton_izbrisi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_izbrisi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/izbrisi.png"))); // NOI18N
        jButton_izbrisi.setText("Izbrisi");
        jButton_izbrisi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_izbrisi.setPreferredSize(new java.awt.Dimension(150, 40));
        jButton_izbrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_izbrisiActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_izbrisi, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 370, -1, -1));

        jTextField_id.setEditable(false);
        jTextField_id.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_id.setForeground(new java.awt.Color(255, 51, 51));
        jTextField_id.setPreferredSize(new java.awt.Dimension(200, 25));
        jPanel1.add(jTextField_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 90, 140, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Kapacitet");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 210, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Id:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Oznaka:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 140, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pretraga.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 30, 30));

        jSpinner_kapacitet.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jSpinner_kapacitet.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(2), Integer.valueOf(2), null, Integer.valueOf(1)));
        jSpinner_kapacitet.setPreferredSize(new java.awt.Dimension(130, 30));
        jPanel1.add(jSpinner_kapacitet, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 230, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 470));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_izadjiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_izadjiActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton_izadjiActionPerformed

    private void jTable_tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_tabelaMouseClicked
        prikaziPodatke();
    }//GEN-LAST:event_jTable_tabelaMouseClicked

    private void jTextField_pretragaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_pretragaKeyPressed
        
    }//GEN-LAST:event_jTextField_pretragaKeyPressed

    private void jTextField_pretragaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_pretragaKeyReleased
        popuniTabelu(jTextField_pretraga.getText());
    }//GEN-LAST:event_jTextField_pretragaKeyReleased

    private void jButton_izmeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_izmeniActionPerformed
        if( !jTextField_id.getText().equals("") ){
            if(!jTextField_oznaka.getText().trim().equals("")){
                    try{
                
                        if(Sto.izmeni(new Sto(Integer.valueOf(jTextField_id.getText()),
                            jTextField_oznaka.getText(),
                            Integer.parseInt(jSpinner_kapacitet.getValue().toString())))){
                            JOptionPane.showMessageDialog(rootPane, "Podaci suuspeno izmenjeni", "Izmeni", JOptionPane.INFORMATION_MESSAGE);
                            izbrisiPodatke();
                            popuniTabelu("");
                        }else{
                             JOptionPane.showMessageDialog(rootPane, "Greska pri izmeni podataka", "Izmeni", JOptionPane.ERROR_MESSAGE);
                        }
                   }catch(Exception e){
                
            }
                }else{
                JOptionPane.showMessageDialog(rootPane, "Unesite oznaku", "Izmeni", JOptionPane.WARNING_MESSAGE);
            }
           
        }else{
            JOptionPane.showMessageDialog(rootPane, "Nije selektovan nijedan clan iz tabele", "Izmeni", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton_izmeniActionPerformed

    private void jButton_izbrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_izbrisiActionPerformed
        if( !jTextField_id.getText().equals("") ){
            int odg = JOptionPane.showConfirmDialog(rootPane, "Da li ste sigurni da zelite da izbrisete podatak", "Izbrisi", JOptionPane.YES_NO_OPTION);
            if(odg == 0){
                if(Sto.izbrisi(Integer.parseInt(jTextField_id.getText()))){
                    JOptionPane.showMessageDialog(rootPane, "Podatak je uspesno izbrisan", "Izbrisi", JOptionPane.INFORMATION_MESSAGE);
                    //prikaziPodatke();
                    izbrisiPodatke();
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Greska pri brisanju podatka", "izbrisi", JOptionPane.ERROR_MESSAGE);
                }
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Nije selektovan nijedan clan iz tabele", "Izbrisi", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton_izbrisiActionPerformed

    private void jTextField_pretragaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_pretragaMouseEntered
        
    }//GEN-LAST:event_jTextField_pretragaMouseEntered

    private void jTextField_pretragaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_pretragaMouseExited
        if(jTextField_pretraga.getText().trim().isEmpty()){
            jTextField_pretraga.setText("unesite naziv az pretragu");
            jTextField_pretraga.setFont(new Font("Tahoma", Font.ITALIC, 14));
        }
        
    }//GEN-LAST:event_jTextField_pretragaMouseExited

    private void jTable_tabelaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable_tabelaKeyReleased
        if(jTable_tabela.getSelectedRow() > -1){
            prikaziPodatke();
        }
        
    }//GEN-LAST:event_jTable_tabelaKeyReleased

    private void jTable_tabelaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_tabelaMouseReleased
        prikaziPodatke();
    }//GEN-LAST:event_jTable_tabelaMouseReleased

    private void jTable_tabelaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable_tabelaKeyPressed
        if(evt.getKeyCode() == Event.ESCAPE){
            izbrisiPodatke();
            popuniTabelu("");
        }
    }//GEN-LAST:event_jTable_tabelaKeyPressed

    private void jTextField_pretragaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_pretragaMousePressed
        jTextField_pretraga.setText("");
        jTextField_pretraga.setFont(new Font("Tahoma", Font.PLAIN, 18));
    }//GEN-LAST:event_jTextField_pretragaMousePressed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StoUpravljajJFrame().setVisible(true);
            }
        });
    }
    
    private void popuniTabelu(String podatak){
        ArrayList<Sto> lista = Sto.listaStolova(podatak);
        if( lista.size()!=0 ){
            String[] kolona = {"Id", "Oznaka", "Kapacitet"};
            Object[][] red = new Object[lista.size()][kolona.length];
            
            for(int i=0; i<lista.size(); i++){
              
                    red[i][0] = lista.get(i).getId();
                    red[i][1] = lista.get(i).getOznaka();
                    red[i][2] = lista.get(i).getKapacitet();
            }
            
            Model tabela = new Model(red, kolona);
            jTable_tabela.setModel(tabela);
            izgledTabele();
        }
        
    }
    
    private void izgledTabele(){
        JTableHeader jth = jTable_tabela.getTableHeader();
        jth.getColumnModel().getColumn(1).setPreferredWidth(200);
        jth.setFont(new Font("Tahoma", Font.BOLD, 15));
    }
    
    private void prikaziPodatke(){
        int selektovaniRed = jTable_tabela.getSelectedRow();
        
        jTextField_id.setText(jTable_tabela.getValueAt(selektovaniRed, 0).toString());
        jTextField_oznaka.setText(jTable_tabela.getValueAt(selektovaniRed, 1).toString());
        jSpinner_kapacitet.setValue(Integer.valueOf(jTable_tabela.getValueAt(selektovaniRed, 2).toString()));
    }
    
    private void izbrisiPodatke(){
        jTextField_id.setText("");
        jTextField_oznaka.setText("");
        jSpinner_kapacitet.setValue(2);
        jTable_tabela.getSelectionModel().clearSelection();
        jButton_izadji.requestFocus();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_izadji;
    private javax.swing.JButton jButton_izbrisi;
    private javax.swing.JButton jButton_izmeni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner_kapacitet;
    private javax.swing.JTable jTable_tabela;
    private javax.swing.JTextField jTextField_id;
    private javax.swing.JTextField jTextField_oznaka;
    private javax.swing.JTextField jTextField_pretraga;
    // End of variables declaration//GEN-END:variables
}

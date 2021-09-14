
package javaapplication_kafic;

import java.awt.Event;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.JTableHeader;

public class ProizvodUpravljajFrame extends javax.swing.JFrame {
    private Model tabela=null;

    public ProizvodUpravljajFrame() {
        initComponents();
        
        popuniTabelu("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_naziv = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField_id = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField_pretraga = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jButton_izadji = new javax.swing.JButton();
        jButton_izbrisi = new javax.swing.JButton();
        jButton_izmeni = new javax.swing.JButton();
        jTextField_cena = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_tabela = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Naziv:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 50, -1));

        jTextField_naziv.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(jTextField_naziv, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 360, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Id:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jTextField_id.setEditable(false);
        jTextField_id.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_id.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(jTextField_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 180, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Cena:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jTextField_pretraga.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jTextField_pretraga.setText("unesite naziv za pretragu");
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
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTextField_pretragaMouseReleased(evt);
            }
        });
        jTextField_pretraga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_pretragaKeyReleased(evt);
            }
        });
        jPanel1.add(jTextField_pretraga, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, 350, 30));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 10, 190));

        jButton_izadji.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jButton_izadji.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/izadji.png"))); // NOI18N
        jButton_izadji.setText("Izadji");
        jButton_izadji.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_izadji.setPreferredSize(new java.awt.Dimension(150, 40));
        jButton_izadji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_izadjiActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_izadji, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 150, -1, -1));

        jButton_izbrisi.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jButton_izbrisi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/izbrisi.png"))); // NOI18N
        jButton_izbrisi.setText("Izbrisi");
        jButton_izbrisi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_izbrisi.setPreferredSize(new java.awt.Dimension(150, 40));
        jButton_izbrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_izbrisiActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_izbrisi, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 150, -1, -1));

        jButton_izmeni.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jButton_izmeni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/izmeni.png"))); // NOI18N
        jButton_izmeni.setText("Izmeni");
        jButton_izmeni.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_izmeni.setPreferredSize(new java.awt.Dimension(150, 40));
        jButton_izmeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_izmeniActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_izmeni, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, -1, -1));

        jTextField_cena.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(jTextField_cena, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 230, 30));

        jTable_tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Naziv", "Cena"
            }
        ));
        jTable_tabela.setRowHeight(50);
        jTable_tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_tabelaMouseClicked(evt);
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
        jScrollPane2.setViewportView(jTable_tabela);
        if (jTable_tabela.getColumnModel().getColumnCount() > 0) {
            jTable_tabela.getColumnModel().getColumn(1).setPreferredWidth(300);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 980, 280));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pretraga.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 60, -1, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_izmeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_izmeniActionPerformed
        if( !jTextField_id.getText().equals("") ){
            if( !jTextField_naziv.getText().trim().equals("") && !jTextField_cena.getText().trim().equals("") ){
                try{
                    if(Proizvod.izmeni(new Proizvod(Integer.valueOf(jTextField_id.getText()),
                                                    jTextField_naziv.getText(),
                                                    Float.parseFloat(jTextField_cena.getText())))){
                        JOptionPane.showMessageDialog(rootPane, "Podaci su uspesno izmenjeni", "Izmeni", JOptionPane.INFORMATION_MESSAGE);
                        popuniTabelu("");
                    }else{
                        JOptionPane.showMessageDialog(rootPane, "Greska pri izmeni podataka", "Izmeni", JOptionPane.ERROR_MESSAGE);
                    }
                }catch(Exception e){
                    JOptionPane.showMessageDialog(rootPane, "Podaci nisu ipravni", "Izmeni", JOptionPane.ERROR_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(rootPane, "Posotoje prazna polja", "Izmeni", JOptionPane.WARNING_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Nije selektovan nijedan podatak iz tabele", "Izmeni", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton_izmeniActionPerformed

    private void jButton_izadjiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_izadjiActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton_izadjiActionPerformed

    private void jTable_tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_tabelaMouseClicked
        prikaziPodatke();
    }//GEN-LAST:event_jTable_tabelaMouseClicked

    private void jButton_izbrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_izbrisiActionPerformed
        if( !jTextField_id.getText().equals("") ){
            int odg = JOptionPane.showConfirmDialog(rootPane, "Da li ste sigurni da zelite da izbrisete podatak", "Izbrisi", JOptionPane.YES_NO_OPTION);
            if( odg==0 ){
                if(Proizvod.izbrisi(Integer.parseInt(jTextField_id.getText()))){
                JOptionPane.showMessageDialog(rootPane, "Podatak je uspesno izbrisan", "Izbrisi", JOptionPane.INFORMATION_MESSAGE);
                popuniTabelu("");
            }else{
                JOptionPane.showMessageDialog(rootPane, "Greska pri brisanju podatka", "Izbrisi", JOptionPane.ERROR_MESSAGE);
            }
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Nije selektovan nijedan clan iz tabele", "Izbrisi", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton_izbrisiActionPerformed

    private void jTable_tabelaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable_tabelaKeyPressed
        if(evt.getKeyCode() == Event.ESCAPE){
            izbrisiTekst();
            popuniTabelu("");
            jTextField_pretraga.setText("unesite naziv az pretragu");
            jTextField_pretraga.setFont(new Font("Tahoma", Font.ITALIC, 14));
        }
    }//GEN-LAST:event_jTable_tabelaKeyPressed

    private void jTextField_pretragaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_pretragaKeyReleased
        popuniTabelu(jTextField_pretraga.getText());
    }//GEN-LAST:event_jTextField_pretragaKeyReleased

    private void jTextField_pretragaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_pretragaMouseReleased
        
    }//GEN-LAST:event_jTextField_pretragaMouseReleased

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

    private void jTextField_pretragaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_pretragaMousePressed
        jTextField_pretraga.setText("");
        jTextField_pretraga.setFont(new Font("Tahoma", Font.PLAIN, 18));
    }//GEN-LAST:event_jTextField_pretragaMousePressed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProizvodUpravljajFrame().setVisible(true);
            }
        });
    }
    
    private void popuniTabelu(String podatak){
        ArrayList<Proizvod> lista = Proizvod.listaProizvoda(podatak);
        
        if( lista.size() != 0 ){
            String[] kolona = {"Id", "Naziv", "Cena"};
            Object[][] red = new Object[lista.size()][kolona.length];
            
            for(int i=0; i<lista.size(); i++){
                red[i][0] = lista.get(i).getId();
                red[i][1] = lista.get(i).getNaziv();
                red[i][2] = lista.get(i).getCena();
            }
            
            tabela = new Model(red, kolona);
            jTable_tabela.setModel(tabela);
            izgledTabele();
        }
        
    }
    
    private void izbrisiTekst(){
        jTextField_id.setText("");
        jTextField_naziv.setText("");
        jTextField_cena.setText("");
        jTable_tabela.getSelectionModel().clearSelection();
        jButton_izadji.requestFocus();
    }
    
    private void izgledTabele(){
        JTableHeader jth = jTable_tabela.getTableHeader();
        jth.setFont(new Font("Tahoma", Font.BOLD, 15));
        jth.getColumnModel().getColumn(1).setPreferredWidth(300);
    }
    
    private void prikaziPodatke(){
        int selektovaniRed = jTable_tabela.getSelectedRow();
        jTextField_id.setText(jTable_tabela.getValueAt(selektovaniRed, 0).toString());
        jTextField_naziv.setText(jTable_tabela.getValueAt(selektovaniRed, 1).toString());
        jTextField_cena.setText(jTable_tabela.getValueAt(selektovaniRed, 2).toString());
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable_tabela;
    private javax.swing.JTextField jTextField_cena;
    private javax.swing.JTextField jTextField_id;
    private javax.swing.JTextField jTextField_naziv;
    private javax.swing.JTextField jTextField_pretraga;
    // End of variables declaration//GEN-END:variables
}

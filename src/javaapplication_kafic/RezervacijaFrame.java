
package javaapplication_kafic;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Event;
import java.awt.Font;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class RezervacijaFrame extends javax.swing.JFrame {
    public RezervacijaFrame() {
        initComponents();
        
        jDateChooser_datum.setDate(new Date());
        jDateChooser_datum.setCursor(new Cursor(Cursor.HAND_CURSOR));
        popuniTabelu();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_rezervacije = new javax.swing.JTable();
        jButton_novaRezervacija = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jDateChooser_datum = new com.toedter.calendar.JDateChooser();
        jButton_osvezi = new javax.swing.JButton();
        jButton_izadji = new javax.swing.JButton();
        jButton_izbrisi = new javax.swing.JButton();
        jButton_izbrisiIstekleRezervcije = new javax.swing.JButton();
        jTextField_pretraga = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 670));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_rezervacije.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ime", "Sto"
            }
        ));
        jTable_rezervacije.setRowHeight(50);
        jTable_rezervacije.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable_rezervacijeKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_rezervacije);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 780, 480));

        jButton_novaRezervacija.setBackground(new java.awt.Color(0, 204, 51));
        jButton_novaRezervacija.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_novaRezervacija.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/novaRezervacija.png"))); // NOI18N
        jButton_novaRezervacija.setText(" Nova rezervacija");
        jButton_novaRezervacija.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_novaRezervacija.setPreferredSize(new java.awt.Dimension(200, 40));
        jButton_novaRezervacija.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_novaRezervacijaActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_novaRezervacija, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, 230, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Rezervacije na dan:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, 30));

        jDateChooser_datum.setDateFormatString("dd/MM/yyyy");
        jDateChooser_datum.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jDateChooser_datum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDateChooser_datumMouseClicked(evt);
            }
        });
        jDateChooser_datum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jDateChooser_datumKeyPressed(evt);
            }
        });
        jPanel1.add(jDateChooser_datum, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 170, 30));

        jButton_osvezi.setBackground(new java.awt.Color(102, 153, 255));
        jButton_osvezi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_osvezi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/osvezi.png"))); // NOI18N
        jButton_osvezi.setText("Osvezi");
        jButton_osvezi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_osvezi.setPreferredSize(new java.awt.Dimension(110, 30));
        jButton_osvezi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_osveziActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_osvezi, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, -1, -1));

        jButton_izadji.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_izadji.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/izadji.png"))); // NOI18N
        jButton_izadji.setText(" Izadji");
        jButton_izadji.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_izadji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_izadjiActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_izadji, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 620, 120, 40));

        jButton_izbrisi.setBackground(new java.awt.Color(255, 153, 0));
        jButton_izbrisi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_izbrisi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/izbrisi.png"))); // NOI18N
        jButton_izbrisi.setText(" Izbrisi rezervaciju");
        jButton_izbrisi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_izbrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_izbrisiActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_izbrisi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 620, 230, 40));

        jButton_izbrisiIstekleRezervcije.setBackground(new java.awt.Color(255, 255, 51));
        jButton_izbrisiIstekleRezervcije.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_izbrisiIstekleRezervcije.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/izbrisiIstekleRezervacije.png"))); // NOI18N
        jButton_izbrisiIstekleRezervcije.setText(" Izbrisi istekle rezervacije ");
        jButton_izbrisiIstekleRezervcije.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_izbrisiIstekleRezervcije.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_izbrisiIstekleRezervcijeActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_izbrisiIstekleRezervcije, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 620, 340, 40));

        jTextField_pretraga.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jTextField_pretraga.setText("pretraga");
        jTextField_pretraga.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField_pretragaMouseClicked(evt);
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
        jPanel1.add(jTextField_pretraga, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 230, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pretraga1.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_osveziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_osveziActionPerformed
        try{
            popuniTabelu();
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "Izabrani format datuma nije odgovarajuci","Greska", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton_osveziActionPerformed

    private void jButton_novaRezervacijaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_novaRezervacijaActionPerformed
        new NovaRezervacijaFrame().setVisible(true);
       // this.dispose();
    }//GEN-LAST:event_jButton_novaRezervacijaActionPerformed

    private void jButton_izadjiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_izadjiActionPerformed
        this.dispose();
        ZaposleniFrame.jPasswordField_korisnickoIme.requestFocus();
    }//GEN-LAST:event_jButton_izadjiActionPerformed

    private void jButton_izbrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_izbrisiActionPerformed
        if(jTable_rezervacije.getSelectedRow() > -1){
            int odg = JOptionPane.showConfirmDialog(rootPane, "Da li ste sigurni da zelite da izbrisete rezervaciju", "Izbrisi", JOptionPane.YES_NO_OPTION);
            if(odg == 0){
                Date datum1 = jDateChooser_datum.getDate();
                java.sql.Date datum = new java.sql.Date(datum1.getTime());
                String ime = jTable_rezervacije.getValueAt(jTable_rezervacije.getSelectedRow(), 0).toString();
                if(Rezervacija.izbrisi(ime, datum)){
                    JOptionPane.showMessageDialog(rootPane, "Podatak je uspesno izbrisan");
                    popuniTabelu();
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Greska pri brisanju podatka");
                }
            }
            
        }else{
            JOptionPane.showMessageDialog(rootPane, "Selektujte rezervaciju koju zelite da izbrisete", "Izbrisi", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton_izbrisiActionPerformed

    private void jButton_izbrisiIstekleRezervcijeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_izbrisiIstekleRezervcijeActionPerformed
        int odg = JOptionPane.showConfirmDialog(rootPane, "Istekle rezervacije ce biti izbrisane", "Izbrisi", JOptionPane.YES_NO_OPTION);
        if( odg==0 ){
            if( Rezervacija.izbrisiIstekleRezervacije() ){
            JOptionPane.showMessageDialog(rootPane, "Rezervacije su uspesno izbrisane", "Izbrisi", JOptionPane.INFORMATION_MESSAGE);
            }else{
            JOptionPane.showMessageDialog(rootPane, "Greska pri brisanju rezervacija\nProverite da li postoje istekle rezervacije", "Izbris", JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_jButton_izbrisiIstekleRezervcijeActionPerformed

    private void jTextField_pretragaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_pretragaKeyReleased
        popuniTabelu(jTextField_pretraga.getText());
    }//GEN-LAST:event_jTextField_pretragaKeyReleased

    private void jTextField_pretragaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_pretragaMouseClicked
       
    }//GEN-LAST:event_jTextField_pretragaMouseClicked

    private void jTextField_pretragaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_pretragaMouseExited
        if( jTextField_pretraga.getText().isEmpty() ){
            jTextField_pretraga.setFont(new Font("Tahoma", Font.ITALIC, 14));
            jTextField_pretraga.setText("pretraga");
        }
        
    }//GEN-LAST:event_jTextField_pretragaMouseExited

    private void jTable_rezervacijeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable_rezervacijeKeyPressed
        if(evt.getKeyCode() == Event.ESCAPE){
            jTextField_pretraga.setFont(new Font("Tahoma", Font.ITALIC, 14));
            jTextField_pretraga.setText("pretraga");
            popuniTabelu();
        }
    }//GEN-LAST:event_jTable_rezervacijeKeyPressed

    private void jTextField_pretragaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_pretragaMousePressed
        jTextField_pretraga.setText("");
        jTextField_pretraga.setFont(new Font("Tahoma", Font.PLAIN, 18));
    }//GEN-LAST:event_jTextField_pretragaMousePressed

    private void jTextField_pretragaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_pretragaKeyPressed
        
    }//GEN-LAST:event_jTextField_pretragaKeyPressed

    private void jDateChooser_datumKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDateChooser_datumKeyPressed
        System.out.println("sad");
    }//GEN-LAST:event_jDateChooser_datumKeyPressed

    private void jDateChooser_datumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser_datumMouseClicked
        System.out.println("sad");
    }//GEN-LAST:event_jDateChooser_datumMouseClicked

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RezervacijaFrame().setVisible(true);
            }
        });
    }
    
    private void izgledTabele(){
        JTableHeader jth = jTable_rezervacije.getTableHeader();
        jth.setFont(new Font("Tahoma", Font.BOLD, 15));
    }
    
    private void popuniTabelu(){
        java.util.Date datum1= jDateChooser_datum.getDate();
        java.sql.Date datum = new java.sql.Date(datum1.getTime());
        ArrayList<Rezervacija> lista = Rezervacija.listaRezervacija(datum);
        if(lista != null){
            String[] kolona = {"Ime", "Sto"};
            Object[][] red = new Object[lista.size()][2];
            for(int i=0; i<lista.size(); i++){
                red[i][0] = lista.get(i).getIme();
                red[i][1] = lista.get(i).getSto();
            }
            
            jTable_rezervacije.setModel(new Model(red, kolona));
        }else{
            jTable_rezervacije.setModel(new DefaultTableModel(new Object[]{"Ime", "Datum"}, 0));
        }
        
        izgledTabele();
    }
    
    private void popuniTabelu(String ime){
        java.util.Date datum = jDateChooser_datum.getDate();
        java.sql.Date danas = new java.sql.Date(datum.getTime());
        ArrayList<Rezervacija> lista = Rezervacija.listaRezervacija(ime, danas);
        if(lista != null){
            String[] kolona = {"Ime", "Sto"};
            Object[][] red = new Object[lista.size()][2];
            for(int i=0; i<lista.size(); i++){
                red[i][0] = lista.get(i).getIme();
                red[i][1] = lista.get(i).getSto();
            }
            
            jTable_rezervacije.setModel(new Model(red, kolona));
        }else{
            jTable_rezervacije.setModel(new DefaultTableModel(new Object[]{"Ime", "Datum"}, 0));
        }
        izgledTabele();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_izadji;
    private javax.swing.JButton jButton_izbrisi;
    private javax.swing.JButton jButton_izbrisiIstekleRezervcije;
    private javax.swing.JButton jButton_novaRezervacija;
    private javax.swing.JButton jButton_osvezi;
    private com.toedter.calendar.JDateChooser jDateChooser_datum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_rezervacije;
    private javax.swing.JTextField jTextField_pretraga;
    // End of variables declaration//GEN-END:variables
}

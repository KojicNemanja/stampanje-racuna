
package javaapplication_kafic;

import java.awt.Event;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.JTableHeader;

public class ZaposleniUpravljajFrame extends javax.swing.JFrame {

    public ZaposleniUpravljajFrame() {
        initComponents();
        popuniTabelu("");
        izgledTAbele();
        datuminterval();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField_id = new javax.swing.JTextField();
        jTextField_ime = new javax.swing.JTextField();
        jTextField_prezime = new javax.swing.JTextField();
        jDateChooser_datumRodjenja = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane_adresa = new javax.swing.JTextPane();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_zaposleni = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jTextField_pretraga = new javax.swing.JTextField();
        jButton_izadji = new javax.swing.JButton();
        jButton_izmeni = new javax.swing.JButton();
        jButton_izbrisi = new javax.swing.JButton();
        jTextField_brojTelefona = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField_korisnickoIme = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Adresa:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("ID:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Prezime:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Broj telefona:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Datum rodjenja:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 50, -1, 20));

        jTextField_id.setEditable(false);
        jTextField_id.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_id.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(jTextField_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 230, 30));

        jTextField_ime.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(jTextField_ime, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 330, 30));

        jTextField_prezime.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(jTextField_prezime, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 330, 30));

        jDateChooser_datumRodjenja.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(jDateChooser_datumRodjenja, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 40, 180, 30));

        jTextPane_adresa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jScrollPane1.setViewportView(jTextPane_adresa);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 100, 330, 80));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 10, 210));

        jTable_zaposleni.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Ime", "Prezime", "Korisnicko ime", "Broj telefona", "Adesa", "Datum rodjenja"
            }
        ));
        jTable_zaposleni.setRowHeight(40);
        jTable_zaposleni.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_zaposleniMouseClicked(evt);
            }
        });
        jTable_zaposleni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable_zaposleniKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable_zaposleniKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_zaposleni);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 1220, 280));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Ime:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jTextField_pretraga.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jTextField_pretraga.setText("ime, prezime ili br. telefona");
        jTextField_pretraga.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTextField_pretragaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField_pretragaMousePressed(evt);
            }
        });
        jTextField_pretraga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_pretragaKeyReleased(evt);
            }
        });
        jPanel1.add(jTextField_pretraga, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 250, 310, 30));

        jButton_izadji.setBackground(new java.awt.Color(244, 244, 244));
        jButton_izadji.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jButton_izadji.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/izadji.png"))); // NOI18N
        jButton_izadji.setText("  Izadji");
        jButton_izadji.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_izadji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_izadjiActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_izadji, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 230, 180, 50));

        jButton_izmeni.setBackground(new java.awt.Color(244, 244, 244));
        jButton_izmeni.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jButton_izmeni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/izmeni.png"))); // NOI18N
        jButton_izmeni.setText("  Izmeni");
        jButton_izmeni.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_izmeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_izmeniActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_izmeni, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 90, 180, 50));

        jButton_izbrisi.setBackground(new java.awt.Color(244, 244, 244));
        jButton_izbrisi.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jButton_izbrisi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/izbrisi.png"))); // NOI18N
        jButton_izbrisi.setText("  Izbrisi");
        jButton_izbrisi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_izbrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_izbrisiActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_izbrisi, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 150, 180, 50));

        jTextField_brojTelefona.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(jTextField_brojTelefona, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 330, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Korinicko ime:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jTextField_korisnickoIme.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(jTextField_korisnickoIme, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 330, 30));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 330, 10));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pretraga.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 250, -1, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, 590));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTable_zaposleniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_zaposleniMouseClicked
        prikaziPodatke();
    }//GEN-LAST:event_jTable_zaposleniMouseClicked

    private void jTextField_pretragaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_pretragaKeyReleased
        popuniTabelu(jTextField_pretraga.getText());
    }//GEN-LAST:event_jTextField_pretragaKeyReleased

    private void jButton_izadjiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_izadjiActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton_izadjiActionPerformed

    private void jButton_izmeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_izmeniActionPerformed
        if( !jTextField_id.getText().trim().equals("")){
            int id = Integer.parseInt(jTextField_id.getText());
            String ime = jTextField_ime.getText();
            String prezime = jTextField_prezime.getText();
            String korisnickoIme = jTextField_korisnickoIme.getText();
            String brojTelefona = jTextField_brojTelefona.getText();
            String adresa = jTextPane_adresa.getText();
            String datum = new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser_datumRodjenja.getDate());

            Zaposleni z = new Zaposleni(id, ime, prezime, korisnickoIme, brojTelefona, adresa, datum);
            if(Zaposleni.izmeni(z)){
                JOptionPane.showMessageDialog(rootPane, "Podaci su uspesno izmenjeni", "Izmena", JOptionPane.INFORMATION_MESSAGE);
                popuniTabelu("");
                izbrisiTekst();
            }else{
                JOptionPane.showMessageDialog(rootPane, "Greska pri izmeni posataka", "Izmena", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Nije selektovan nijedan zaposleni", "Izmena", JOptionPane.WARNING_MESSAGE);
        }



    }//GEN-LAST:event_jButton_izmeniActionPerformed

    private void jButton_izbrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_izbrisiActionPerformed
        if( !jTextField_id.getText().equals("")){
            int odg = JOptionPane.showConfirmDialog(rootPane, "Da li ste sigurni da zelite da obrisete podatke zaposelnog?","Izbisi", JOptionPane.YES_NO_OPTION);
            if( odg==0 ){
            if(Zaposleni.izbrisi(Integer.parseInt(jTextField_id.getText()))){
                JOptionPane.showMessageDialog(null, "Podaci su uspesno izbrisani");
                popuniTabelu("");
                izbrisiTekst();
            }else{
                JOptionPane.showMessageDialog(null, "Greska prilikom brisanja podataka", "Izbrisi", JOptionPane.ERROR_MESSAGE);
            }
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Nije selektovan nijedan clan iz tabele", "Izbrisi", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton_izbrisiActionPerformed

    private void jTable_zaposleniKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable_zaposleniKeyPressed
        if(evt.getKeyCode() == Event.ESCAPE){
            izbrisiTekst();
            popuniTabelu("");
            jTextField_pretraga.setText("ime, prezime ili br. telefona");
            jTextField_pretraga.setFont(new Font("Tahoma", Font.ITALIC, 14));
            jButton_izadji.requestFocus();
        }
    }//GEN-LAST:event_jTable_zaposleniKeyPressed

    private void jTextField_pretragaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_pretragaMouseExited
        jTextField_pretraga.setText("ime, prezime ili br. telefona");
        jTextField_pretraga.setFont(new Font("Tahoma", Font.ITALIC, 14));
    }//GEN-LAST:event_jTextField_pretragaMouseExited

    private void jTable_zaposleniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable_zaposleniKeyReleased
        if(jTable_zaposleni.getSelectedRow() > -1){
            prikaziPodatke();
        }
        
    }//GEN-LAST:event_jTable_zaposleniKeyReleased

    private void jTextField_pretragaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_pretragaMousePressed
        jTextField_pretraga.setText("");
        jTextField_pretraga.setFont(new Font("Tahoma", Font.PLAIN, 18));
    }//GEN-LAST:event_jTextField_pretragaMousePressed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ZaposleniUpravljajFrame().setVisible(true);
            }
        });
    }

    private void popuniTabelu(String podatak){
        ArrayList<Zaposleni> lista = Zaposleni.listaZaposlenih(podatak);
        Object red[][] = new Object[lista.size()][7];
        String[] kolona = {"Id", "Ime", "Prezime", "Korisnicko ime", "Broj telefona", "Datum rodjenja", "Adresa"};

        for(int i=0; i<lista.size(); i++){
            red[i][0] = lista.get(i).getId();
            red[i][1] = lista.get(i).getIme();
            red[i][2] = lista.get(i).getPrezime();
            red[i][3] = lista.get(i).getKorisnickoIme();
            red[i][4] = lista.get(i).getBrojTelefona();
            red[i][5] = lista.get(i).getDatumRodjenja();
            red[i][6] = lista.get(i).getAdresa();
        }
        
        Model tabela = new Model(red, kolona);
        jTable_zaposleni.setModel(tabela);
    }
    
    private void izbrisiTekst(){
        jTextField_id.setText("");
        jTextField_ime.setText("");
        jTextField_prezime.setText("");
        jTextField_korisnickoIme.setText("");
        jTextField_brojTelefona.setText("");
        jDateChooser_datumRodjenja.setDate(null);
        jTextPane_adresa.setText("");
        jTable_zaposleni.getSelectionModel().clearSelection();
        jButton_izadji.requestFocus();
    }
    
    private void prikaziPodatke(){
        int selektovaniRed = jTable_zaposleni.getSelectedRow();

        jTextField_id.setText(jTable_zaposleni.getValueAt(selektovaniRed, 0).toString());
        jTextField_ime.setText(jTable_zaposleni.getValueAt(selektovaniRed, 1).toString());
        jTextField_prezime.setText(jTable_zaposleni.getValueAt(selektovaniRed, 2).toString());
        jTextField_korisnickoIme.setText(jTable_zaposleni.getValueAt(selektovaniRed, 3).toString());
        jTextField_brojTelefona.setText(jTable_zaposleni.getValueAt(selektovaniRed, 4).toString());

        try {
            String datum = jTable_zaposleni.getValueAt(selektovaniRed, 6).toString();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            jDateChooser_datumRodjenja.setDate(sdf.parse(datum));
        } catch (ParseException ex) {
            jDateChooser_datumRodjenja.setDate(null);
        }

        jTextPane_adresa.setText(jTable_zaposleni.getValueAt(selektovaniRed, 5).toString());
    }
    
    private void izgledTAbele(){
        JTableHeader jth = jTable_zaposleni.getTableHeader();
        jth.setFont(new Font("Tahoma", Font.BOLD, 15));
        
    }
    
    private void datuminterval(){
        Calendar cal = Calendar.getInstance();
        Calendar cal1 = Calendar.getInstance();
        cal.add(Calendar.YEAR, -18);
        cal1.add(Calendar.YEAR, -35);
        Date max = cal.getTime();
        Date min = cal1.getTime();
        
        jDateChooser_datumRodjenja.setSelectableDateRange(min, max);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_izadji;
    private javax.swing.JButton jButton_izbrisi;
    private javax.swing.JButton jButton_izmeni;
    private com.toedter.calendar.JDateChooser jDateChooser_datumRodjenja;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable_zaposleni;
    private javax.swing.JTextField jTextField_brojTelefona;
    private javax.swing.JTextField jTextField_id;
    private javax.swing.JTextField jTextField_ime;
    private javax.swing.JTextField jTextField_korisnickoIme;
    private javax.swing.JTextField jTextField_pretraga;
    private javax.swing.JTextField jTextField_prezime;
    private javax.swing.JTextPane jTextPane_adresa;
    // End of variables declaration//GEN-END:variables
}

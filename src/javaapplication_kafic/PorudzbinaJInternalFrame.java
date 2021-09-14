
package javaapplication_kafic;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Event;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SpringLayout;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

public class PorudzbinaJInternalFrame extends javax.swing.JInternalFrame {
    private BrzoBiranje brzoBrianje = new BrzoBiranje();
    private String[] kolona = {"Naziv", "Cena"};
    public PorudzbinaJInternalFrame() {
        initComponents();
        this.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
        prikaz();
        stavkeNaRacunu();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem_dodajNaBrzoBiranje = new javax.swing.JMenuItem();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jMenuItem_ukloniSaBrzogBiranja1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jTextField_proizvod = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_proizvodi = new javax.swing.JTable();
        jButton_izadji = new javax.swing.JButton();
        jButton_sacuvaj = new javax.swing.JButton();
        jButton_stampaj = new javax.swing.JButton();
        jPanel_brzoBiranje = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_racun = new javax.swing.JTextArea();
        jButton_noviRacun = new javax.swing.JButton();
        jSpinner_kolicina = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        jMenuItem_dodajNaBrzoBiranje.setText("Dodaj na brzo biranje");
        jMenuItem_dodajNaBrzoBiranje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_dodajNaBrzoBiranjeActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem_dodajNaBrzoBiranje);

        jMenuItem_ukloniSaBrzogBiranja1.setText("Ukloni sa brzog biranja");
        jMenuItem_ukloniSaBrzogBiranja1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_ukloniSaBrzogBiranja1ActionPerformed(evt);
            }
        });
        jPopupMenu2.add(jMenuItem_ukloniSaBrzogBiranja1);

        setPreferredSize(new java.awt.Dimension(1366, 590));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 590));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField_proizvod.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jTextField_proizvod.setText("proizvod");
        jTextField_proizvod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField_proizvodMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTextField_proizvodMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField_proizvodMousePressed(evt);
            }
        });
        jTextField_proizvod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_proizvodKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_proizvodKeyReleased(evt);
            }
        });
        jPanel1.add(jTextField_proizvod, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 330, 40));

        jTable_proizvodi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable_proizvodi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Naziv", "Cena"
            }
        ));
        jTable_proizvodi.setRowHeight(50);
        jTable_proizvodi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_proizvodiMouseClicked(evt);
            }
        });
        jTable_proizvodi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable_proizvodiKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_proizvodi);
        if (jTable_proizvodi.getColumnModel().getColumnCount() > 0) {
            jTable_proizvodi.getColumnModel().getColumn(0).setPreferredWidth(200);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 560, 170));

        jButton_izadji.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_izadji.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/izadji.png"))); // NOI18N
        jButton_izadji.setText(" Izadji");
        jButton_izadji.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_izadji.setPreferredSize(new java.awt.Dimension(110, 40));
        jButton_izadji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_izadjiActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_izadji, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 200, 130, -1));

        jButton_sacuvaj.setBackground(new java.awt.Color(102, 255, 102));
        jButton_sacuvaj.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_sacuvaj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sacuvajProiavod.png"))); // NOI18N
        jButton_sacuvaj.setText(" Sacuvaj");
        jButton_sacuvaj.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_sacuvaj.setPreferredSize(new java.awt.Dimension(150, 50));
        jButton_sacuvaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_sacuvajActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_sacuvaj, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, 180, -1));

        jButton_stampaj.setBackground(new java.awt.Color(0, 204, 255));
        jButton_stampaj.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_stampaj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/stampaj.png"))); // NOI18N
        jButton_stampaj.setText(" Stampaj");
        jButton_stampaj.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_stampaj.setPreferredSize(new java.awt.Dimension(150, 50));
        jButton_stampaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_stampajActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_stampaj, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 80, 180, -1));

        jPanel_brzoBiranje.setBackground(new java.awt.Color(232, 126, 4));
        jPanel_brzoBiranje.setPreferredSize(new java.awt.Dimension(960, 330));
        jPanel_brzoBiranje.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel_brzoBiranje, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 960, 330));

        jTextArea_racun.setEditable(false);
        jTextArea_racun.setColumns(20);
        jTextArea_racun.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jTextArea_racun.setRows(5);
        jTextArea_racun.setTabSize(7);
        jTextArea_racun.setToolTipText("");
        jScrollPane2.setViewportView(jTextArea_racun);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(986, 0, 380, 580));

        jButton_noviRacun.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_noviRacun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/noviRacun.png"))); // NOI18N
        jButton_noviRacun.setText(" Novi racun");
        jButton_noviRacun.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_noviRacun.setPreferredSize(new java.awt.Dimension(130, 40));
        jButton_noviRacun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_noviRacunActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_noviRacun, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 200, 150, 40));

        jSpinner_kolicina.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jSpinner_kolicina.setModel(new javax.swing.SpinnerNumberModel(1, 1, 50, 1));
        jSpinner_kolicina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jSpinner_kolicina, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 80, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pretraga.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("kol:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 22, -1, 40));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 160, 360, 10));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_izadjiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_izadjiActionPerformed
        if(!jTextArea_racun.getText().equals("")){
            ponistiRacun();
        }
        
        ZaposleniFrame.jDesktopPane_prikaz.removeAll();
        ZaposleniFrame.jDesktopPane_prikaz.add(new Pocetna()).setVisible(true);
        ZaposleniFrame.jPasswordField_korisnickoIme.setText("");
        ZaposleniFrame.jLabel_id1.setText("");
        ZaposleniFrame.jPasswordField_korisnickoIme.requestFocus();
        
    }//GEN-LAST:event_jButton_izadjiActionPerformed
    
    
    private void jButton_sacuvajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_sacuvajActionPerformed
        if(jTable_proizvodi.getSelectedRowCount() > 0){
        try{
            int red = jTable_proizvodi.getSelectedRow();
            String proizvod = jTable_proizvodi.getValueAt(red, 0).toString();
            float cena = Float.parseFloat(jTable_proizvodi.getValueAt(red, 1).toString());
            int kolicina = Integer.parseInt(jSpinner_kolicina.getValue().toString());
            float iznos = kolicina * cena;
            String query = "INSERT INTO `racun`(`naziv`, `kolicina`, `cena`, `ukupno`) "
                    + "VALUES ('"+proizvod+"', '"+kolicina+"', '"+cena+"', '"+iznos+"')";
            if(DB.insertUpdateDelete(query)){
                stavkeNaRacunu();
                }else{
                    JOptionPane.showMessageDialog(null, "Greska", "Poruka", JOptionPane.ERROR_MESSAGE);
                }
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "Neki od podataka nisu isparvni");
        }   
        izbrisiTekst();
        }else{
            JOptionPane.showMessageDialog(rootPane, "Selektujte proizvod","Sacuvaj", JOptionPane.WARNING_MESSAGE);
        }
        
       
    }//GEN-LAST:event_jButton_sacuvajActionPerformed

    private void jTextField_proizvodKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_proizvodKeyReleased
        if( !jTextField_proizvod.getText().trim().equals("")){
            popuniTabelu(jTextField_proizvod.getText());
        }else{
            jTable_proizvodi.setModel(new DefaultTableModel(new Object[]{"Naziv", "Cena"}, 0));
        }
        izgledTabele();
    }//GEN-LAST:event_jTextField_proizvodKeyReleased

    private void jButton_stampajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_stampajActionPerformed
        if(!jTextArea_racun.getText().equals("")){
            stampaj();
            if(ponistiRacun()){
                jTextArea_racun.setText("");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Nema proizvoda za štampanje", "Poruka", JOptionPane.WARNING_MESSAGE);
        }
        
        
    }//GEN-LAST:event_jButton_stampajActionPerformed

    private void jTable_proizvodiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_proizvodiMouseClicked
        if(evt.getModifiers() == MouseEvent.BUTTON3_MASK){
            jPopupMenu1.show(jTable_proizvodi, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jTable_proizvodiMouseClicked

    private void jButton_noviRacunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_noviRacunActionPerformed
        if(!jTextArea_racun.getText().equals("")){
            if(ponistiRacun()){
                JOptionPane.showMessageDialog(null, "Račun je izbrisan", "Poruka", JOptionPane.INFORMATION_MESSAGE);
                jTextArea_racun.setText("");
            }
        }
        
    }//GEN-LAST:event_jButton_noviRacunActionPerformed

    private void jTextField_proizvodMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_proizvodMouseEntered
       
    }//GEN-LAST:event_jTextField_proizvodMouseEntered

    private void jTextField_proizvodMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_proizvodMousePressed
        jTextField_proizvod.setText("");
        jTextField_proizvod.setFont(new Font("Tahoma", Font.PLAIN, 18));
    }//GEN-LAST:event_jTextField_proizvodMousePressed

    private void jTextField_proizvodMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_proizvodMouseExited
        if(jTextField_proizvod.getText().isEmpty()){
            jTextField_proizvod.setText("proizvod");
            jTextField_proizvod.setFont(new Font("Tahoma", Font.ITALIC, 14));
        }
        
    }//GEN-LAST:event_jTextField_proizvodMouseExited

    private void jTable_proizvodiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable_proizvodiKeyPressed
        if(evt.getKeyCode() == Event.ESCAPE){
            izbrisiTekst();
        }
    }//GEN-LAST:event_jTable_proizvodiKeyPressed

    private void jTextField_proizvodKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_proizvodKeyPressed
        if(evt.getKeyCode() == Event.ESCAPE){
            izbrisiTekst();
        }
    }//GEN-LAST:event_jTextField_proizvodKeyPressed

    private void jMenuItem_dodajNaBrzoBiranjeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_dodajNaBrzoBiranjeActionPerformed
        if(brzoBrianje.dodaj(new Proizvod().ID(jTable_proizvodi.getValueAt(jTable_proizvodi.getSelectedRow(), 0).toString()))){
                    ZaposleniFrame.jDesktopPane_prikaz.removeAll();
                    ZaposleniFrame.jDesktopPane_prikaz.add(new PorudzbinaJInternalFrame()).setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Greska pri dodavanju proizvoda", "Poruka", JOptionPane.ERROR_MESSAGE);
                }
    }//GEN-LAST:event_jMenuItem_dodajNaBrzoBiranjeActionPerformed

    private void jMenuItem_ukloniSaBrzogBiranja1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_ukloniSaBrzogBiranja1ActionPerformed
         if(brzoBrianje.izbrisi(new Proizvod().ID(jTable_proizvodi.getValueAt(jTable_proizvodi.getSelectedRow(), 0).toString()))){
                    ZaposleniFrame.jDesktopPane_prikaz.removeAll();
                    ZaposleniFrame.jDesktopPane_prikaz.add(new PorudzbinaJInternalFrame()).setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Greska pri uklanjanju proizvoda", "Poruka", JOptionPane.ERROR_MESSAGE);
                   // jComboBox_operacija.setSelectedItem(null);
                }
    }//GEN-LAST:event_jMenuItem_ukloniSaBrzogBiranja1ActionPerformed

    private void izbrisiTekst(){
       jSpinner_kolicina.setValue(1);
       jTable_proizvodi.setModel(new DefaultTableModel(new Object[]{"Naziv", "Cena"}, 0));
       izgledTabele();
       jTextField_proizvod.setText("proizvod");
       jTextField_proizvod.setFont(new Font("Tahoma", Font.ITALIC, 14));
    }
    
    private void popuniBrzoBiranje(){
        brzoBrianje.popuni(jPanel_brzoBiranje);
    }
    
    private void brzoBiranje(){
        
        Component[] komponente = jPanel_brzoBiranje.getComponents();
        
        for(Component k : komponente){
            if(k instanceof JLabel){
                JLabel proizvod = (JLabel)k;
                proizvod.addMouseListener(new MouseListener() {

                    @Override
                    public void mouseClicked(MouseEvent e) {
                        popuniTabelu(proizvod.getText());
                        jTable_proizvodi.setRowSelectionInterval(0, 0);
                       /* Object[][] podatak = podaciOProizovdu(proizvod.getText());
                        jTable_proizvodi.setModel(new DefaultTableModel(podatak, new Object[]{"Naziv", "Cena"}));
                        izgledTabele();*/
                        if(e.getModifiers() == MouseEvent.BUTTON3_MASK){
                            jPopupMenu2.show(proizvod, e.getX(), e.getY());
                        }
                    }

                    @Override
                    public void mousePressed(MouseEvent e) {
                        
                    }

                    @Override
                    public void mouseReleased(MouseEvent e) {
                    }

                    @Override
                    public void mouseEntered(MouseEvent e) {
                        proizvod.setBackground(Color.GREEN);
                        proizvod.setForeground(Color.white);
                        proizvod.setFont(new Font("Tahoma", Font.BOLD, 18));
                    }

                    @Override
                    public void mouseExited(MouseEvent e) {
                        proizvod.setBackground(Color.yellow);
                        proizvod.setForeground(Color.black);
                        proizvod.setFont(new Font("Tahoma", Font.BOLD, 14));
                    }
                });
            }
        }
    }
    
    /*private Object[][] podaciOProizovdu(String naziv){
        Object[][] podatak = new Object[1][2];
        podatak[0][0] = "";
        podatak[0][1] = "";
        String query = "SELECT * FROM `proizvod` WHERE `naziv`=?";
        try {
            PreparedStatement ps = DB.getKonekcija().prepareStatement(query);
            ps.setString(1, naziv);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                podatak[0][0] = rs.getString(2);
                podatak[0][1] = rs.getFloat(3);
            }
            return podatak;
        } catch (SQLException ex) {
            Logger.getLogger(PorudzbinaJInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
            return podatak;
        }
    }*/
    
    private void izgledTabele(){
        JTableHeader jth = jTable_proizvodi.getTableHeader();
        jth.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));
        jTable_proizvodi.getColumnModel().getColumn(0).setPreferredWidth(200);
    }
    
    private void prikaz(){
        popuniBrzoBiranje();
        izgledTabele();
        brzoBiranje();
    }
    
    private void popuniTabelu(String podatak){
        ArrayList<Proizvod> lista = Proizvod.listaProizvoda(podatak);
        if(lista.size() > 0){
            Object[][] red = new Object[lista.size()][kolona.length];
            
            for(int i=0; i<lista.size(); i++){
                red[i][0] = lista.get(i).getNaziv();
                red[i][1] = lista.get(i).getCena();
            }
            jTable_proizvodi.setModel(new Model(red, kolona));
            izgledTabele();
        }
        
        
    }
    
    public void stampaj(){
        try {
                Connection con = DB.getKonekcija();
                JasperDesign jd = JRXmlLoader.load("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\JavaApplication_Projekat\\src\\javaapplication_kafic\\racun.jrxml");
                
                HashMap hm = new HashMap();
                hm.put("datumIVreme", new SimpleDateFormat("yyyy.MM.dd - HH:mm").format(new Date()));
                JasperReport jr = JasperCompileManager.compileReport(jd);
                JasperPrint jp = JasperFillManager.fillReport(jr, hm, con);
               
                
                JasperViewer.viewReport(jp, false); // false oznacava da kas se zatvori izvestaj, program ostaje u radu
        } catch (JRException ex) {
            Logger.getLogger(PorudzbinaJInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private boolean ponistiRacun(){
        return DB.insertUpdateDelete("DELETE FROM racun");
    }
    
    private void dodajProizovd(String naziv, int kolicina, float cena, float iznos){
        jTextArea_racun.setText(jTextArea_racun.getText()+
                          "\n"+naziv+"\n"+kolicina+"x\t"+cena+"\t"+iznos+"");
    }
    
    private void stavkeNaRacunu(){
        jTextArea_racun.setText("");
        String guery = "Select * FROM racun";
        ResultSet rs = DB.RS(guery);
        try {
            while(rs.next()){
                jTextArea_racun.setText(jTextArea_racun.getText()+
                          "\n"+rs.getString(1)+"\n"+rs.getInt(2)+"x\t"+rs.getFloat(3)+"\t"+rs.getFloat(4)+"");
            }
        } catch (SQLException ex) {
            Logger.getLogger(PorudzbinaJInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private float zaUplatu(){
        String query = "SELECT SUM(ukupno) FROM racun";
        ResultSet rs = DB.RS(query);
        try {
            if(rs.next()){
                return rs.getFloat(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PorudzbinaJInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_izadji;
    private javax.swing.JButton jButton_noviRacun;
    private javax.swing.JButton jButton_sacuvaj;
    private javax.swing.JButton jButton_stampaj;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem_dodajNaBrzoBiranje;
    private javax.swing.JMenuItem jMenuItem_ukloniSaBrzogBiranja1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_brzoBiranje;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSpinner jSpinner_kolicina;
    private javax.swing.JTable jTable_proizvodi;
    public static javax.swing.JTextArea jTextArea_racun;
    private javax.swing.JTextField jTextField_proizvod;
    // End of variables declaration//GEN-END:variables
}

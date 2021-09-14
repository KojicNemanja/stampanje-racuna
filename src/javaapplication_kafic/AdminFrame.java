
package javaapplication_kafic;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JMenu;
import javax.swing.JOptionPane;

public class AdminFrame extends javax.swing.JFrame {
        public static String korisnickoIme = null;
    public AdminFrame() {
        initComponents();
        prikaz();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu_zaposleni = new javax.swing.JMenu();
        jMenuItem_dodaj = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem_upravljaj = new javax.swing.JMenuItem();
        jMenu_raspored = new javax.swing.JMenu();
        jMenuItem_dodajSto = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu_odjaviSe = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 204, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 718));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pozadinaAdmin.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -2, -1, -1));

        jMenu_zaposleni.setBackground(new java.awt.Color(204, 255, 204));
        jMenu_zaposleni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/zaposleni.png"))); // NOI18N
        jMenu_zaposleni.setText("Zaposleni");
        jMenu_zaposleni.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu_zaposleni.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jMenu_zaposleni.setOpaque(true);
        jMenu_zaposleni.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenu_zaposleniMouseEntered(evt);
            }
        });

        jMenuItem_dodaj.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem_dodaj.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jMenuItem_dodaj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dodaj.png"))); // NOI18N
        jMenuItem_dodaj.setText("Dodaj");
        jMenuItem_dodaj.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem_dodaj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem_dodajMouseClicked(evt);
            }
        });
        jMenuItem_dodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_dodajActionPerformed(evt);
            }
        });
        jMenu_zaposleni.add(jMenuItem_dodaj);
        jMenu_zaposleni.add(jSeparator1);

        jMenuItem_upravljaj.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem_upravljaj.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jMenuItem_upravljaj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/izmeniIzbrisi.png"))); // NOI18N
        jMenuItem_upravljaj.setText("Izmeni / Izbrisi");
        jMenuItem_upravljaj.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem_upravljaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_upravljajActionPerformed(evt);
            }
        });
        jMenu_zaposleni.add(jMenuItem_upravljaj);

        jMenuBar1.add(jMenu_zaposleni);

        jMenu_raspored.setBackground(new java.awt.Color(204, 255, 204));
        jMenu_raspored.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/raspored.png"))); // NOI18N
        jMenu_raspored.setText("Raspored");
        jMenu_raspored.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu_raspored.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jMenu_raspored.setOpaque(true);

        jMenuItem_dodajSto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem_dodajSto.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jMenuItem_dodajSto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dodaj.png"))); // NOI18N
        jMenuItem_dodajSto.setText("Dodaj ");
        jMenuItem_dodajSto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem_dodajSto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_dodajStoActionPerformed(evt);
            }
        });
        jMenu_raspored.add(jMenuItem_dodajSto);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem4.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/izmeniIzbrisi.png"))); // NOI18N
        jMenuItem4.setText("Izmeni / Izbrisi");
        jMenuItem4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu_raspored.add(jMenuItem4);

        jMenuBar1.add(jMenu_raspored);

        jMenu3.setBackground(new java.awt.Color(204, 255, 204));
        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/proizvod.png"))); // NOI18N
        jMenu3.setText("Proizvod");
        jMenu3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu3.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jMenu3.setOpaque(true);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dodaj.png"))); // NOI18N
        jMenuItem5.setText("Dodaj ");
        jMenuItem5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem6.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/izmeniIzbrisi.png"))); // NOI18N
        jMenuItem6.setText("Izmeni / Izbrisi");
        jMenuItem6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuBar1.add(jMenu3);

        jMenu1.setBackground(new java.awt.Color(204, 255, 204));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lokal.png"))); // NOI18N
        jMenu1.setText("Lokal");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jMenu1.setOpaque(true);
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/detalji.png"))); // NOI18N
        jMenuItem1.setText("Detalji");
        jMenuItem1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu_odjaviSe.setBackground(new java.awt.Color(255, 153, 153));
        jMenu_odjaviSe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nalog.png"))); // NOI18N
        jMenu_odjaviSe.setText("Nalog");
        jMenu_odjaviSe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu_odjaviSe.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jMenu_odjaviSe.setOpaque(true);
        jMenu_odjaviSe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu_odjaviSeMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jMenu_odjaviSeMouseExited(evt);
            }
        });

        jMenuItem3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/podesavanja.png"))); // NOI18N
        jMenuItem3.setText("Podesavanja");
        jMenuItem3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu_odjaviSe.add(jMenuItem3);

        jMenuItem2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/odjaviSe.png"))); // NOI18N
        jMenuItem2.setText("Odjavi se");
        jMenuItem2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem2MouseClicked(evt);
            }
        });
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu_odjaviSe.add(jMenuItem2);

        jMenuBar1.add(jMenu_odjaviSe);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem_dodajMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem_dodajMouseClicked
        
    }//GEN-LAST:event_jMenuItem_dodajMouseClicked

    private void jMenu_odjaviSeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu_odjaviSeMouseClicked
        
    }//GEN-LAST:event_jMenu_odjaviSeMouseClicked

    private void jMenuItem_dodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_dodajActionPerformed
        new DodajZaposleniFrame().setVisible(true);
    }//GEN-LAST:event_jMenuItem_dodajActionPerformed

    private void jMenuItem_upravljajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_upravljajActionPerformed
        new ZaposleniUpravljajFrame().setVisible(true);
    }//GEN-LAST:event_jMenuItem_upravljajActionPerformed

    private void jMenuItem_dodajStoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_dodajStoActionPerformed
        new StoFrame().setVisible(true);
    }//GEN-LAST:event_jMenuItem_dodajStoActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        new StoUpravljajJFrame().setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        new ProizvodFrame().setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new LokalFrame().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        new ProizvodUpravljajFrame().setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenu_zaposleniMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu_zaposleniMouseEntered
        
    }//GEN-LAST:event_jMenu_zaposleniMouseEntered

    private void jMenu_odjaviSeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu_odjaviSeMouseExited
        
    }//GEN-LAST:event_jMenu_odjaviSeMouseExited

    private void jMenuItem2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2MouseClicked

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        int odg = JOptionPane.showConfirmDialog(rootPane, "Da li ste sigurni da zelite da se odjavite", "Odajava", JOptionPane.YES_NO_OPTION);
        if(odg == 0){
            new ZaposleniFrame().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        new NalogFrame().setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminFrame().setVisible(true);
            }
        });
    }
    
    private void prikaz(){
        Component[] com = jMenuBar1.getComponents();
        
        for(Component c : com){
            if(c instanceof JMenu){
                JMenu jm = (JMenu)c;
                jm.addMouseListener(new MouseListener() {

                    @Override
                    public void mouseClicked(MouseEvent e) {
                    }

                    @Override
                    public void mousePressed(MouseEvent e) {
                    }

                    @Override
                    public void mouseReleased(MouseEvent e) {
                    }

                    @Override
                    public void mouseEntered(MouseEvent e) {
                        jm.setBackground(Color.yellow);
                        jm.setOpaque(true);
                    }

                    @Override
                    public void mouseExited(MouseEvent e) {
                        jm.setBackground(new Color(204,255,204));
                        if(jm == jMenu_odjaviSe){
                            jMenu_odjaviSe.setBackground(new Color(255,153,153));
                        }
                    }
                });
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem_dodaj;
    private javax.swing.JMenuItem jMenuItem_dodajSto;
    private javax.swing.JMenuItem jMenuItem_upravljaj;
    private javax.swing.JMenu jMenu_odjaviSe;
    private javax.swing.JMenu jMenu_raspored;
    private javax.swing.JMenu jMenu_zaposleni;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}

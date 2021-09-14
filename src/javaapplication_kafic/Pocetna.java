
package javaapplication_kafic;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javafx.animation.Animation;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.Timer;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class Pocetna extends javax.swing.JInternalFrame {
    public Pocetna() {
        initComponents();
        
        this.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
        vreme();
      //  efekat();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_vreme = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setPreferredSize(new java.awt.Dimension(1366, 590));

        jLabel_vreme.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel_vreme.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_vreme.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_vreme, javax.swing.GroupLayout.DEFAULT_SIZE, 1350, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(jLabel_vreme, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(302, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vreme(){
        Timer timer = new Timer(1000, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                jLabel_vreme.setText(sdf.format(new Date()));
            }
        });
        timer.start();
    }
    
    private void efekat(){
        
        jLabel_vreme.setLocation(-220, 200);
        Timer timer = new Timer(200, new ActionListener() {
            int i=-220;
            @Override
            public void actionPerformed(ActionEvent e) {
                i+=10;
               // jLabel_vreme.setText(sdf.format(new Date()));
                jLabel_vreme.setLocation(i, 150);
                if(i==1370){
                    i=-220;
                }
            }
        });
        timer.start();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel_vreme;
    // End of variables declaration//GEN-END:variables
}

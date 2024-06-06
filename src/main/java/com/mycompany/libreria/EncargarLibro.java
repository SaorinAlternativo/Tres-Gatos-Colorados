/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.libreria;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class EncargarLibro extends javax.swing.JFrame {
    

    public EncargarLibro() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(this);
        this.setSize(680, 480);
    }

    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        títuloLibro = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        autorLibro = new javax.swing.JTextField();
        btnHecho = new javax.swing.JButton();
        comboBoxGénero = new javax.swing.JComboBox<>();
        btnAltas = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Script MT Bold", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("X");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 40, 30));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Encargos de libros");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 300, 60));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Género:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 150, 40));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre del libro:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 200, 40));
        jPanel1.add(títuloLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 280, -1));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Autor/a del libro:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 200, 40));
        jPanel1.add(autorLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 280, -1));

        btnHecho.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        btnHecho.setText("Confirmar");
        btnHecho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHechoActionPerformed(evt);
            }
        });
        jPanel1.add(btnHecho, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 120, 40));

        comboBoxGénero.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 14)); // NOI18N
        comboBoxGénero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona:", "Fantasía", "Ciencia ficción", "Clásico", "Romance", "Misterio" }));
        jPanel1.add(comboBoxGénero, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, -1, -1));

        btnAltas.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        btnAltas.setText("Dar de alta encargos");
        btnAltas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltasActionPerformed(evt);
            }
        });
        jPanel1.add(btnAltas, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 190, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/libreríaMadrid.jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 480));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHechoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHechoActionPerformed
        boolean b = false;
        if(verificar()) {
            try {
                b = new Conexiones().SiExiste(títuloLibro.getText());
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(EncargarLibro.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (b) {
                JOptionPane.showMessageDialog(null,"Ese libro ya está encargado","Error",JOptionPane.INFORMATION_MESSAGE);
            }
            else {  
            Libreria lib = new Libreria();
            lib.setTítulo(títuloLibro.getText());
            lib.setAutor(autorLibro.getText());
            lib.setGénero(comboBoxGénero.getSelectedItem().toString());
                       
            try {
                new Conexiones().RegistroNuevo(lib);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(EncargarLibro.class.getName()).log(Level.SEVERE, null, ex);
            }
            limpiar();
            }
            
        }
    }//GEN-LAST:event_btnHechoActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void btnAltasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAltasActionPerformed
   
    void limpiar () {
        títuloLibro.setText("");
        autorLibro.setText("");
        comboBoxGénero.setSelectedIndex(0);
    }
    
    boolean verificar() {
        if(títuloLibro.getText().isEmpty() || autorLibro.getText().isEmpty()
                || comboBoxGénero.getSelectedIndex()<1) {
            JOptionPane.showMessageDialog(null,"Debes llenar todos los datos","Error",JOptionPane.WARNING_MESSAGE);
            return false;
        } else 
            
            return true; 
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EncargarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EncargarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EncargarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EncargarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EncargarLibro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField autorLibro;
    private javax.swing.JButton btnAltas;
    private javax.swing.JButton btnHecho;
    private javax.swing.JComboBox<String> comboBoxGénero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField títuloLibro;
    // End of variables declaration//GEN-END:variables
}

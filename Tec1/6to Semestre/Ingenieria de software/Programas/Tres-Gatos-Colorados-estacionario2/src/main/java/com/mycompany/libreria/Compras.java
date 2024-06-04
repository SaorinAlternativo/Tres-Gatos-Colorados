/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.libreria;

import java.awt.Image;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author lilia
 */
public class Compras extends javax.swing.JFrame {
    String nombreImagen="";

    /**
     * Creates new form Compras
     */
    public Compras() {
        initComponents();
        llenarTabla();
        this.setLocationRelativeTo(this);
        this.setResizable(true);
        this.setSize(720,650);

        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cod = new javax.swing.JLabel();
        precio1 = new javax.swing.JLabel();
        dinero = new javax.swing.JLabel();
        cambio = new javax.swing.JLabel();
        btnTotal = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        fotoLibro = new javax.swing.JLabel();
        Cambio = new javax.swing.JTextField();
        nombrelibro = new javax.swing.JTextField();
        Precio = new javax.swing.JTextField();
        Cantidad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaLibros = new javax.swing.JTable();
        Titulo = new javax.swing.JLabel();
        ISBN = new javax.swing.JTextField();
        btnConfirmar = new javax.swing.JButton();
        cantidad = new javax.swing.JLabel();
        dineroIngresado = new javax.swing.JTextField();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 153, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Script MT Bold", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, 40, 30));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 36)); // NOI18N
        jLabel1.setText("Confirmación de compra");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 270, 40));

        cod.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        cod.setText("ISBN:");
        jPanel1.add(cod, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 60, 20));

        precio1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        precio1.setText("Precio:");
        jPanel1.add(precio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        dinero.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        dinero.setText("Dinero ingresado:");
        jPanel1.add(dinero, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        cambio.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        cambio.setText("Cambio:");
        jPanel1.add(cambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        btnTotal.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        btnTotal.setText("Total");
        btnTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalActionPerformed(evt);
            }
        });
        jPanel1.add(btnTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 100, 40));

        btnCancelar.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, -1, 40));

        fotoLibro.setOpaque(true);
        jPanel1.add(fotoLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, 200, 220));

        Cambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CambioActionPerformed(evt);
            }
        });
        jPanel1.add(Cambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 170, -1));
        jPanel1.add(nombrelibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 220, -1));
        jPanel1.add(Precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 210, -1));
        jPanel1.add(Cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 190, -1));

        tablaLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaLibros.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tablaLibros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaLibrosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaLibros);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 590, 270));

        Titulo.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        Titulo.setText("Título:");
        jPanel1.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 60, 20));
        jPanel1.add(ISBN, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, 210, -1));

        btnConfirmar.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        jPanel1.add(btnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 110, 40));

        cantidad.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        cantidad.setText("Cantidad:");
        jPanel1.add(cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));
        jPanel1.add(dineroIngresado, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 180, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Libros.jpg"))); // NOI18N
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 0, 730, 640));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalActionPerformed
        double total, precioLibro, dineroIng;
        int cant;
        precioLibro=Double.parseDouble(Precio.getText());
        cant=Integer.parseInt(Cantidad.getText());
                if (cant<=0) {
        JOptionPane.showMessageDialog(null,"No puedes tener menos de un libro","Error",JOptionPane.WARNING_MESSAGE); 
                }
                else {            
        dineroIng=Double.parseDouble(dineroIngresado.getText());
        if (dineroIng>=precioLibro) {
        total=dineroIng-(precioLibro*cant);
        Cambio.setText(String.valueOf(total));
        }
        else {
         JOptionPane.showMessageDialog(null,"No puedes ingresar una cantidad menor al precio del libro","Error",JOptionPane.WARNING_MESSAGE); 
                }
        
                }
    }//GEN-LAST:event_btnTotalActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void tablaLibrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaLibrosMouseClicked
        ImageIcon img=null;
        if(evt.getButton()==1) {
            int fila=tablaLibros.getSelectedRow();
            ISBN.setText(tablaLibros.getValueAt(fila,0).toString());
            nombrelibro.setText(tablaLibros.getValueAt(fila, 1).toString());
            Precio.setText(tablaLibros.getValueAt(fila, 2).toString());
            Cantidad.setText(tablaLibros.getValueAt(fila,3).toString());
            nombreImagen=tablaLibros.getValueAt(fila,4).toString();
//            tablaLibros.removeColumn(tablaLibros.getColumnModel().getColumn(4));
               
            // Obtener imagen de la BD //
            String isbn=ISBN.getText();
            try {
                img = new Conexiones().obtenerImagen(isbn);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Error","Error",JOptionPane.ERROR_MESSAGE);
            } catch (IOException ex) {
                Logger.getLogger(Compras.class.getName()).log(Level.SEVERE, null, ex);
            }
            Icon icono = new ImageIcon(img.getImage().getScaledInstance(fotoLibro.getHeight(), fotoLibro.getWidth(), Image.SCALE_DEFAULT));
            if(img!=null) {
                fotoLibro.setIcon(icono);
                       
        }
    }
    }//GEN-LAST:event_tablaLibrosMouseClicked

    private void CambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CambioActionPerformed

        
    }//GEN-LAST:event_CambioActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
       if (verificar()) {
        Libreria lib = new Libreria();
            lib.setCantidad(Integer.parseInt(Cantidad.getText()));
            lib.setIsbn(ISBN.getText());
            new Conexiones().ActualizarRegistro(lib);
            limpiar();
            llenarTabla();
     }
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
       this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    void llenarTabla() {
        Conexiones tbl = new Conexiones();
        tbl.mostrarTabla(tablaLibros);
    }
    
    void limpiar() {
         nombrelibro.setText("");
         Precio.setText("");
         Cantidad.setText("");
         Cambio.setText("");
         fotoLibro.setIcon(null);
    }
    
    boolean verificar() {
        if(nombrelibro.getText().isEmpty() || Precio.getText().isEmpty()
                || Cantidad.getText().isEmpty() || Cambio.getText().isEmpty() ||
                fotoLibro.getIcon()==null) {
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
            java.util.logging.Logger.getLogger(Compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Compras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Cambio;
    private javax.swing.JTextField Cantidad;
    private javax.swing.JTextField ISBN;
    private javax.swing.JTextField Precio;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnTotal;
    private javax.swing.JLabel cambio;
    private javax.swing.JLabel cantidad;
    private javax.swing.JLabel cod;
    private javax.swing.JLabel dinero;
    private javax.swing.JTextField dineroIngresado;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel fotoLibro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombrelibro;
    private javax.swing.JLabel precio1;
    private javax.swing.JTable tablaLibros;
    // End of variables declaration//GEN-END:variables
}
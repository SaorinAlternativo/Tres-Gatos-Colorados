/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.libreria;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author lilia
 */
public class Altas extends javax.swing.JFrame {

    /**
     * Creates new form Altas
     */
    public Altas() {
        initComponents();
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
        Titulo2 = new javax.swing.JLabel();
        Nombre = new javax.swing.JLabel();
        labelISBN = new javax.swing.JLabel();
        labelAutor = new javax.swing.JLabel();
        labelPrecio = new javax.swing.JLabel();
        labelGénero = new javax.swing.JLabel();
        labelCantidad = new javax.swing.JLabel();
        labelCantidadEx = new javax.swing.JLabel();
        imagenLibro = new javax.swing.JLabel();
        cargarImg = new javax.swing.JButton();
        Título = new javax.swing.JTextField();
        ISBN = new javax.swing.JTextField();
        Autor = new javax.swing.JTextField();
        Precio = new javax.swing.JTextField();
        Género = new javax.swing.JTextField();
        Cantidad = new javax.swing.JTextField();
        CantidadEnExistencia = new javax.swing.JTextField();
        btnDarDeAlta = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo2.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 30)); // NOI18N
        Titulo2.setForeground(new java.awt.Color(255, 255, 255));
        Titulo2.setText("Título:");
        jPanel1.add(Titulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 70, 20));

        Nombre.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 48)); // NOI18N
        Nombre.setForeground(new java.awt.Color(255, 255, 255));
        Nombre.setText("Altas de encargos");
        jPanel1.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 290, -1));

        labelISBN.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 30)); // NOI18N
        labelISBN.setForeground(new java.awt.Color(255, 255, 255));
        labelISBN.setText("ISBN:");
        jPanel1.add(labelISBN, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 60, 40));

        labelAutor.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 30)); // NOI18N
        labelAutor.setForeground(new java.awt.Color(255, 255, 255));
        labelAutor.setText("Autor:");
        jPanel1.add(labelAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 60, 30));

        labelPrecio.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 30)); // NOI18N
        labelPrecio.setForeground(new java.awt.Color(255, 255, 255));
        labelPrecio.setText("Precio:");
        jPanel1.add(labelPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 70, 40));

        labelGénero.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 30)); // NOI18N
        labelGénero.setForeground(new java.awt.Color(255, 255, 255));
        labelGénero.setText("Género:");
        jPanel1.add(labelGénero, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 80, 30));

        labelCantidad.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 30)); // NOI18N
        labelCantidad.setForeground(new java.awt.Color(255, 255, 255));
        labelCantidad.setText("Cantidad:");
        jPanel1.add(labelCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 90, 40));

        labelCantidadEx.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 30)); // NOI18N
        labelCantidadEx.setForeground(new java.awt.Color(255, 255, 255));
        labelCantidadEx.setText("Cantidad en existencia:");
        jPanel1.add(labelCantidadEx, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 230, 40));

        imagenLibro.setOpaque(true);
        jPanel1.add(imagenLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 180, 200));

        cargarImg.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        cargarImg.setText("Cargar imagen");
        cargarImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarImgActionPerformed(evt);
            }
        });
        jPanel1.add(cargarImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, -1, -1));
        jPanel1.add(Título, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 250, -1));
        jPanel1.add(ISBN, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 250, -1));

        Autor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AutorActionPerformed(evt);
            }
        });
        jPanel1.add(Autor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 250, -1));
        jPanel1.add(Precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 100, -1));
        jPanel1.add(Género, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 200, -1));
        jPanel1.add(Cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 200, -1));
        jPanel1.add(CantidadEnExistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 200, -1));

        btnDarDeAlta.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        btnDarDeAlta.setText("Añadir");
        jPanel1.add(btnDarDeAlta, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 140, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/biblioteca.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 500));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AutorActionPerformed

    private void cargarImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarImgActionPerformed
//FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG & GIF Images","jpg","gif");
//        JFileChooser FC = new JFileChooser();
//        FC.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
//        FC.setDialogTitle("Abrir archivo");
//        File ruta = new File("C:\\Users\\lilia\\OneDrive\\Documentos\\Tecnológico\\Sexto semestre\\Libreria\\src\\main\\resources\\imagenes");
//        FC.setCurrentDirectory(ruta);
//        int resultado= FC.showOpenDialog(this);
//        if (resultado!= JFileChooser.CANCEL_OPTION) {
//            File nombreArchivo = FC.getSelectedFile();
//            String nombreImagen = String.valueOf(nombreArchivo);
//            Image foto = getToolkit().getImage(nombreImagen);
//            foto=foto.getScaledInstance(imagenLibro.getWidth(),imagenLibro.getHeight(), Image.SCALE_DEFAULT);
//            imagenLibro.setIcon(new ImageIcon(foto));        // TODO add your handling code here:
//        }
    }//GEN-LAST:event_cargarImgActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Altas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Altas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Altas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Altas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Altas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Autor;
    private javax.swing.JTextField Cantidad;
    private javax.swing.JTextField CantidadEnExistencia;
    private javax.swing.JTextField Género;
    private javax.swing.JTextField ISBN;
    private javax.swing.JLabel Nombre;
    private javax.swing.JTextField Precio;
    private javax.swing.JLabel Titulo2;
    private javax.swing.JTextField Título;
    private javax.swing.JButton btnDarDeAlta;
    private javax.swing.JButton cargarImg;
    private javax.swing.JLabel imagenLibro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelAutor;
    private javax.swing.JLabel labelCantidad;
    private javax.swing.JLabel labelCantidadEx;
    private javax.swing.JLabel labelGénero;
    private javax.swing.JLabel labelISBN;
    private javax.swing.JLabel labelPrecio;
    // End of variables declaration//GEN-END:variables
}

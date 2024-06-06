/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.libreria;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class PrincipalLibro extends javax.swing.JFrame {
    private boolean mouseInside = false;
    private boolean mouseInside1 = false;
    private boolean mouseInside2 = false;
    private boolean mouseInside3 = false;
    private boolean mouseInside4 = false;
    private boolean mouseInside5 = false;
    private boolean mouseInside6 = false;
    AjustarImg ajustar = new AjustarImg();
Compras com = new Compras();   
Catálogo cat = new Catálogo(); 
EncargarLibro Enlib = new EncargarLibro();
PreOrdenar pre = new PreOrdenar();
Devoluciones dev = new Devoluciones();

    public PrincipalLibro() {
        initComponents();
        jTextArea1.setVisible(false);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
       ajustar.AjustarImagen(jLabel7, "source", "login.png");
       ajustar.AjustarImagen(jLabel10, "source", "hexagono.png");
      ajustar.AjustarImagen(jLabel11, "source", "hexagono.png");
       ajustar.AjustarImagen(jLabel13, "source", "hexagono.png");
      ajustar.AjustarImagen(jLabel15, "source", "hexagono.png");
      ajustar.AjustarImagen(jLabel12, "source", "hexagono.png");
       ajustar.AjustarImagen(jLabel17, "source", "hexagono.png");
       
    }
    class jpanelGra extends JPanel {
        
        protected void paintComponent (Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        int w = getWidth();
        int h =getHeight();
        Color color1 = new Color(51, 51, 51);
        Color color2 = new Color(93, 93, 93);
        GradientPaint gp = new GradientPaint (0,0,color1,80,h,color2);
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, w, h);
            }
    }
    
    class jbuttonGradient1 extends JButton {
        
        protected void paintComponent (Graphics g){
            if(mouseInside){
        Graphics2D g2d = (Graphics2D) g;
        int w = getWidth();
        int h =getHeight();
        Color color1 = new Color(76,219,179);
        Color color2 = new Color(0xFFFFFF);
        GradientPaint gp = new GradientPaint (0,0,color1,80,h,color2);
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, w, h);
            }
        }
    }
    
    class jbuttonGradient2 extends JButton {
        
        protected void paintComponent (Graphics g){
            if(mouseInside1){
        Graphics2D g2d = (Graphics2D) g;
        int w = getWidth();
        int h =getHeight();
        Color color1 = new Color(76,219,179);
        Color color2 = new Color(0xFFFFFF);
        GradientPaint gp = new GradientPaint (0,0,color1,80,h,color2);
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, w, h);
            }
        }
    }
    
    class jbuttonGradient3 extends JButton {
        
        protected void paintComponent (Graphics g){
            if(mouseInside2){
        Graphics2D g2d = (Graphics2D) g;
        int w = getWidth();
        int h =getHeight();
        Color color1 = new Color(76,219,179);
        Color color2 = new Color(0xFFFFFF);
        GradientPaint gp = new GradientPaint (0,0,color1,80,h,color2);
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, w, h);
            }
        }
    }
    
    class jbuttonGradient4 extends JButton {
        
        protected void paintComponent (Graphics g){
            if(mouseInside3){
        Graphics2D g2d = (Graphics2D) g;
        int w = getWidth();
        int h =getHeight();
        Color color1 = new Color(76,219,179);
        Color color2 = new Color(0xFFFFFF);
        GradientPaint gp = new GradientPaint (0,0,color1,80,h,color2);
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, w, h);
            }
        }
    }
    
    class jbuttonGradient5 extends JButton {
        
        protected void paintComponent (Graphics g){
            if(mouseInside4){
        Graphics2D g2d = (Graphics2D) g;
        int w = getWidth();
        int h =getHeight();
        Color color1 = new Color(76,219,179);
        Color color2 = new Color(0xFFFFFF);
        GradientPaint gp = new GradientPaint (0,0,color1,80,h,color2);
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, w, h);
            }
        }
    }
    
    class jbuttonGradient6 extends JButton {
        
        protected void paintComponent (Graphics g){
            if(mouseInside5){
        Graphics2D g2d = (Graphics2D) g;
        int w = getWidth();
        int h =getHeight();
        Color color1 = new Color(76,219,179);
        Color color2 = new Color(0xFFFFFF);
        GradientPaint gp = new GradientPaint (0,0,color1,80,h,color2);
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, w, h);
            }
        }
    }
    
     class jbuttonGradient7 extends JButton {
        
        protected void paintComponent (Graphics g){
            if(mouseInside6){
        Graphics2D g2d = (Graphics2D) g;
        int w = getWidth();
        int h =getHeight();
        Color color1 = new Color(76,219,179);
        Color color2 = new Color(0xFFFFFF);
        GradientPaint gp = new GradientPaint (0,0,color1,80,h,color2);
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, w, h);
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new jpanelGra();
        jPanel2 = new javax.swing.JPanel();
        Comprar = new javax.swing.JLabel();
        Catalogo = new javax.swing.JLabel();
        EncargarL = new javax.swing.JLabel();
        PreOr = new javax.swing.JLabel();
        Devo = new javax.swing.JLabel();
        Web = new javax.swing.JLabel();
        jButton1 = new jbuttonGradient1();
        jButton2 = new jbuttonGradient2();
        jButton3 = new jbuttonGradient3();
        jButton4 = new jbuttonGradient4();
        jButton6 = new jbuttonGradient6();
        jButton8 = new javax.swing.JButton();
        jButton7 = new jbuttonGradient7();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Help = new javax.swing.JLabel();
        Devoluciones = new javax.swing.JLabel();
        PreOrdenar = new javax.swing.JLabel();
        Catálogo = new javax.swing.JLabel();
        Comprar1 = new javax.swing.JLabel();
        Encargar = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(10, 12, 16));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Comprar.setForeground(new java.awt.Color(255, 255, 255));
        Comprar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Comprar.setText("Comprar libro");
        Comprar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Comprar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ComprarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ComprarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ComprarMouseExited(evt);
            }
        });
        jPanel2.add(Comprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 130, 40));

        Catalogo.setForeground(new java.awt.Color(255, 255, 255));
        Catalogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Catalogo.setText("Catalogo libros");
        Catalogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Catalogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CatalogoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CatalogoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CatalogoMouseExited(evt);
            }
        });
        jPanel2.add(Catalogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 130, 40));

        EncargarL.setForeground(new java.awt.Color(255, 255, 255));
        EncargarL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EncargarL.setText("Encargar libro");
        EncargarL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EncargarL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EncargarLMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EncargarLMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EncargarLMouseExited(evt);
            }
        });
        jPanel2.add(EncargarL, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 130, 40));

        PreOr.setForeground(new java.awt.Color(255, 255, 255));
        PreOr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PreOr.setText("Pre-Ordenar");
        PreOr.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PreOr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PreOrMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PreOrMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PreOrMouseExited(evt);
            }
        });
        jPanel2.add(PreOr, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 130, 40));

        Devo.setForeground(new java.awt.Color(255, 255, 255));
        Devo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Devo.setText("Devoluciones");
        Devo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Devo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DevoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DevoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DevoMouseExited(evt);
            }
        });
        jPanel2.add(Devo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 130, 40));

        Web.setForeground(new java.awt.Color(255, 255, 255));
        Web.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Web.setText("Acceder a web");
        Web.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Web.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WebMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                WebMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                WebMouseExited(evt);
            }
        });
        jPanel2.add(Web, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 130, 40));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 130, 40));

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 130, 40));

        jButton3.setBackground(new java.awt.Color(51, 51, 51));
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 130, 40));

        jButton4.setBackground(new java.awt.Color(51, 51, 51));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton4MouseExited(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 130, 40));

        jButton6.setBackground(new java.awt.Color(51, 51, 51));
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton6MouseExited(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 130, 40));

        jButton8.setBackground(new java.awt.Color(76, 219, 179));
        jButton8.setText("Salir");
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton8MouseExited(evt);
            }
        });
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 700, 130, 40));

        jButton7.setBackground(new java.awt.Color(51, 51, 51));
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton7MouseExited(evt);
            }
        });
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 130, 40));

        jLabel7.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 120, 100));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("User");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 40, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 800));

        Help.setFont(new java.awt.Font("Perpetua", 1, 48)); // NOI18N
        Help.setForeground(new java.awt.Color(255, 255, 255));
        Help.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Help.setText("?");
        Help.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Help.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HelpMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HelpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HelpMouseExited(evt);
            }
        });
        jPanel1.add(Help, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 380, 150, 150));

        Devoluciones.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        Devoluciones.setForeground(new java.awt.Color(255, 255, 255));
        Devoluciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Devoluciones.setText("Devoluciones");
        Devoluciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Devoluciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DevolucionesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DevolucionesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DevolucionesMouseExited(evt);
            }
        });
        jPanel1.add(Devoluciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 380, 150, 150));

        PreOrdenar.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        PreOrdenar.setForeground(new java.awt.Color(255, 255, 255));
        PreOrdenar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PreOrdenar.setText("Pre-Ordenar");
        PreOrdenar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PreOrdenar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PreOrdenarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PreOrdenarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PreOrdenarMouseExited(evt);
            }
        });
        jPanel1.add(PreOrdenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 380, 150, 150));

        Catálogo.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        Catálogo.setForeground(new java.awt.Color(255, 255, 255));
        Catálogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Catálogo.setText("Catálogo");
        Catálogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Catálogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CatálogoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CatálogoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CatálogoMouseExited(evt);
            }
        });
        jPanel1.add(Catálogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 270, 150, 150));

        Comprar1.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        Comprar1.setForeground(new java.awt.Color(255, 255, 255));
        Comprar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Comprar1.setText("Comprar");
        Comprar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Comprar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Comprar1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Comprar1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Comprar1MouseExited(evt);
            }
        });
        jPanel1.add(Comprar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 270, 150, 150));

        Encargar.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        Encargar.setForeground(new java.awt.Color(255, 255, 255));
        Encargar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Encargar.setText("Encargar");
        Encargar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Encargar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EncargarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EncargarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EncargarMouseExited(evt);
            }
        });
        jPanel1.add(Encargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 270, 150, 150));

        jLabel10.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 380, 150, 150));

        jLabel11.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 270, 150, 150));

        jLabel12.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 270, 150, 150));

        jLabel13.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 380, 150, 150));

        jLabel15.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 270, 150, 150));

        jLabel17.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 380, 150, 150));

        jScrollPane1.setEnabled(false);

        jTextArea1.setBackground(new java.awt.Color(10, 12, 16));
        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jTextArea1.setEnabled(false);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 550, 450, 240));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
       mouseInside = true;
       repaint();
       Comprar.setForeground(Color.BLACK);
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
         mouseInside = false;
       Comprar.setForeground(Color.WHITE);
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        mouseInside1 = false;
       Catalogo.setForeground(Color.WHITE);
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        mouseInside2 = false;
       EncargarL.setForeground(Color.WHITE);
    }//GEN-LAST:event_jButton3MouseExited

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited
        mouseInside3 = false;
       PreOr.setForeground(Color.WHITE);
    }//GEN-LAST:event_jButton4MouseExited

    private void jButton6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseExited
        mouseInside5 = false;
       Devo.setForeground(Color.WHITE);
    }//GEN-LAST:event_jButton6MouseExited

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
       mouseInside1 = true;
       repaint();
       Catalogo.setForeground(Color.BLACK);
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        mouseInside2 = true;
       repaint();
       EncargarL.setForeground(Color.BLACK);
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
       mouseInside3 = true;
       repaint();
       PreOr.setForeground(Color.BLACK);
    }//GEN-LAST:event_jButton4MouseEntered

    private void jButton6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseEntered
       mouseInside5 = true;
       repaint();
       Devo.setForeground(Color.BLACK);
    }//GEN-LAST:event_jButton6MouseEntered

    private void jButton8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8MouseEntered

    private void jButton8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8MouseExited

    private void Comprar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Comprar1MouseEntered
      ajustar.AjustarImagen(jLabel11, "source", "hexagono1.png");
    }//GEN-LAST:event_Comprar1MouseEntered

    private void Comprar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Comprar1MouseExited
       ajustar.AjustarImagen(jLabel11, "source", "hexagono.png");
    }//GEN-LAST:event_Comprar1MouseExited

    private void CatálogoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CatálogoMouseEntered
       ajustar.AjustarImagen(jLabel12, "source", "hexagono1.png");
    }//GEN-LAST:event_CatálogoMouseEntered

    private void CatálogoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CatálogoMouseExited
       ajustar.AjustarImagen(jLabel12, "source", "hexagono.png");
    }//GEN-LAST:event_CatálogoMouseExited

    private void EncargarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EncargarMouseEntered
       ajustar.AjustarImagen(jLabel15, "source", "hexagono1.png");
    }//GEN-LAST:event_EncargarMouseEntered

    private void EncargarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EncargarMouseExited
       ajustar.AjustarImagen(jLabel15, "source", "hexagono.png");
    }//GEN-LAST:event_EncargarMouseExited

    private void DevolucionesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DevolucionesMouseEntered
        ajustar.AjustarImagen(jLabel17, "source", "hexagono1.png");
    }//GEN-LAST:event_DevolucionesMouseEntered

    private void DevolucionesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DevolucionesMouseExited
        ajustar.AjustarImagen(jLabel17, "source", "hexagono.png");
    }//GEN-LAST:event_DevolucionesMouseExited

    private void PreOrdenarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PreOrdenarMouseEntered
        ajustar.AjustarImagen(jLabel13, "source", "hexagono1.png");
    }//GEN-LAST:event_PreOrdenarMouseEntered

    private void PreOrdenarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PreOrdenarMouseExited
        ajustar.AjustarImagen(jLabel13, "source", "hexagono.png");
    }//GEN-LAST:event_PreOrdenarMouseExited

    private void HelpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HelpMouseEntered
       ajustar.AjustarImagen(jLabel10, "source", "hexagono1.png");
    }//GEN-LAST:event_HelpMouseEntered

    private void HelpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HelpMouseExited
        ajustar.AjustarImagen(jLabel10, "source", "hexagono.png");
    }//GEN-LAST:event_HelpMouseExited

    private void Comprar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Comprar1MouseClicked
        com.setVisible(true);
    }//GEN-LAST:event_Comprar1MouseClicked

    private void ComprarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComprarMouseClicked
       com.setVisible(true);
    }//GEN-LAST:event_ComprarMouseClicked

    private void CatálogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CatálogoMouseClicked
        cat.setVisible(true);
    }//GEN-LAST:event_CatálogoMouseClicked

    private void CatalogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CatalogoMouseClicked
        cat.setVisible(true);
    }//GEN-LAST:event_CatalogoMouseClicked

    private void EncargarLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EncargarLMouseClicked
        Enlib.setVisible(true);
    }//GEN-LAST:event_EncargarLMouseClicked

    private void EncargarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EncargarMouseClicked
        Enlib.setVisible(true);
    }//GEN-LAST:event_EncargarMouseClicked

    private void PreOrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PreOrMouseClicked
        pre.setVisible(true);
    }//GEN-LAST:event_PreOrMouseClicked

    private void PreOrdenarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PreOrdenarMouseClicked
       pre.setVisible(true);
    }//GEN-LAST:event_PreOrdenarMouseClicked

    private void DevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DevoMouseClicked
        dev.setVisible(true);
    }//GEN-LAST:event_DevoMouseClicked

    private void DevolucionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DevolucionesMouseClicked
        dev.setVisible(true);
    }//GEN-LAST:event_DevolucionesMouseClicked

    private void HelpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HelpMouseClicked
       jTextArea1.setVisible(true);
       jTextArea1.setText("En la pantalla principal de nuestro sistema, encontrarás una serie de botones\n y hexágonos interactivos. "
               + "Cada uno de estos elementos está diseñado para guiarte\n a diferentes secciones donde podrás ingresar los datos solicitados.\n"
               + "Observa la disposición de botones y hexágonos en la pantalla. Cada uno tiene\n un ícono o etiqueta que indica su función o la "
               + "sección a la que te llevará.\n Haz clic en cualquier botón o hexágono para ser redirigido  a una nueva\n pantalla específica "
               + "donde podrás  ingresar los datos requeridos para esa sección.");
    }//GEN-LAST:event_HelpMouseClicked

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       this.dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void ComprarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComprarMouseEntered
       mouseInside = true;
       repaint();
       Comprar.setForeground(Color.BLACK);
    }//GEN-LAST:event_ComprarMouseEntered

    private void CatalogoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CatalogoMouseEntered
        mouseInside1 = true;
       repaint();
       Catalogo.setForeground(Color.BLACK);
    }//GEN-LAST:event_CatalogoMouseEntered

    private void EncargarLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EncargarLMouseEntered
       mouseInside2 = true;
       repaint();
       EncargarL.setForeground(Color.BLACK);
    }//GEN-LAST:event_EncargarLMouseEntered

    private void PreOrMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PreOrMouseEntered
        mouseInside3 = true;
       repaint();
       PreOr.setForeground(Color.BLACK);
    }//GEN-LAST:event_PreOrMouseEntered

    private void DevoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DevoMouseEntered
       mouseInside5 = true;
       repaint();
       Devo.setForeground(Color.BLACK);
    }//GEN-LAST:event_DevoMouseEntered

    private void ComprarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComprarMouseExited
      mouseInside = false;
       Comprar.setForeground(Color.WHITE);
    }//GEN-LAST:event_ComprarMouseExited

    private void CatalogoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CatalogoMouseExited
       mouseInside1 = false;
       Catalogo.setForeground(Color.WHITE);
    }//GEN-LAST:event_CatalogoMouseExited

    private void EncargarLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EncargarLMouseExited
        mouseInside2 = false;
       EncargarL.setForeground(Color.WHITE);
    }//GEN-LAST:event_EncargarLMouseExited

    private void PreOrMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PreOrMouseExited
        mouseInside3 = false;
       PreOr.setForeground(Color.WHITE);
    }//GEN-LAST:event_PreOrMouseExited

    private void DevoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DevoMouseExited
       mouseInside5 = false;
       Devo.setForeground(Color.WHITE);
    }//GEN-LAST:event_DevoMouseExited

    private void jButton7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7MouseEntered

    private void jButton7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7MouseExited

    private void WebMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WebMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_WebMouseClicked

    private void WebMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WebMouseEntered
        mouseInside6 = true;
       repaint();
       Web.setForeground(Color.BLACK);
    }//GEN-LAST:event_WebMouseEntered

    private void WebMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WebMouseExited
        mouseInside6 = false;
       Web.setForeground(Color.WHITE);
    }//GEN-LAST:event_WebMouseExited

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
            java.util.logging.Logger.getLogger(PrincipalLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalLibro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Catalogo;
    private javax.swing.JLabel Catálogo;
    private javax.swing.JLabel Comprar;
    private javax.swing.JLabel Comprar1;
    private javax.swing.JLabel Devo;
    private javax.swing.JLabel Devoluciones;
    private javax.swing.JLabel Encargar;
    private javax.swing.JLabel EncargarL;
    private javax.swing.JLabel Help;
    private javax.swing.JLabel PreOr;
    private javax.swing.JLabel PreOrdenar;
    private javax.swing.JLabel Web;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}

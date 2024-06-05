/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.libreria;


/**
 *
 * @author lilia
 */
public class Catálogo extends javax.swing.JFrame {
    AjustarImg ajustar = new AjustarImg();
    Compras comprar;

    public Catálogo() {
        initComponents();
        this.setLocationRelativeTo(this);
        //Ciencia ficción
       ajustar.AjustarImagen(HailMary, "imagenes", "ProyectoHailMary.jpg");
       ajustar.AjustarImagen(Dune, "imagenes", "Dune.jpg");
       ajustar.AjustarImagen(Ender, "imagenes", "ElJuegoDeEnder.jpg");
       ajustar.AjustarImagen(Amanecer, "imagenes", "AmanecerRojo.jpg");
       ajustar.AjustarImagen(ElProblema, "imagenes", "3Cuerpos.jpg");
       ajustar.AjustarImagen(Fahrenheit, "imagenes", "Fahrenheit.jpg");
       ajustar.AjustarImagen(LaGuerra, "imagenes", "LaGuerraDeLosMundos.jpg");
       ajustar.AjustarImagen(YoRobot, "imagenes", "YoRobot.jpg");
       //Fantasía
       ajustar.AjustarImagen(ElImperio, "imagenes", "ElImperioFinal.jpg");
       ajustar.AjustarImagen(HP, "imagenes", "HP.jpg");
       ajustar.AjustarImagen(ENDV, "imagenes", "ElNombreDelViento.jpg");
       ajustar.AjustarImagen(GOT, "imagenes", "JuegoDeTronos.jpg");
       ajustar.AjustarImagen(PJ, "imagenes", "PJ.jpg");
       ajustar.AjustarImagen(LaRueda, "imagenes", "RuedaDelTiempo.jpg");
       ajustar.AjustarImagen(RobinHobb, "imagenes", "RobinHobb.jpg");
       ajustar.AjustarImagen(TLOR, "imagenes", "ElSeñorDeLosAnillos.jpg");
       //Misterio
       ajustar.AjustarImagen(Agatha, "imagenes", "Agatha.jpg");
       ajustar.AjustarImagen(JoelDicker, "imagenes", "LaVerdadSobreElCasoDeHarryQuebert.jpg");
       ajustar.AjustarImagen(LSDV, "imagenes", "LaSombraDelViento.jpg");
       ajustar.AjustarImagen(LaPaciente, "imagenes", "LaPacienteSilenciosa.jpg");
       ajustar.AjustarImagen(ECDV, "imagenes", "ElCódigoDaVinci.jpg");
       ajustar.AjustarImagen(EstudioEnEscarlata, "imagenes", "EstudioEnEscarlata.jpg");
       ajustar.AjustarImagen(Rebeca, "imagenes", "Rebeca.jpg");
       ajustar.AjustarImagen(Perdida, "imagenes", "Perdida.jpg");
       //Romance
       ajustar.AjustarImagen(OyP, "imagenes", "OrgulloYPrejuicio.jpg");
       ajustar.AjustarImagen(YoAntesDeTi, "imagenes", "YoAntesDeTi.jpg");
       ajustar.AjustarImagen(NosotrosEnLaLuna, "imagenes", "NosotrosEnLaLuna.jpg");
       ajustar.AjustarImagen(LaHipotesis, "imagenes", "LaHipotesis.jpg");
       ajustar.AjustarImagen(ATLCDLQME, "imagenes", "ATLCDLQME.jpg");
       ajustar.AjustarImagen(EvelynHugo, "imagenes", "Los7Maridos.jpg");
       ajustar.AjustarImagen(Maurice, "imagenes", "Maurice.jpg");
       ajustar.AjustarImagen(DiarioDeUnaPasión, "imagenes", "DiarioDeUnaPasión.jpg");
       //Clásicos
       ajustar.AjustarImagen(Orwell, "imagenes", "1984.jpg");
       ajustar.AjustarImagen(ElRetrato, "imagenes", "ElRetratoDeDorian.jpg");
       ajustar.AjustarImagen(AnnaK, "imagenes", "AnnaKarenina.jpg");
       ajustar.AjustarImagen(Rayuela, "imagenes", "Rayuela.jpg");
       ajustar.AjustarImagen(CienAños, "imagenes", "CienAñosDeSoledad.jpg");
       ajustar.AjustarImagen(Frankenstein, "imagenes", "Frankenstein.jpg");
       ajustar.AjustarImagen(ElFantasma, "imagenes", "ElFantasma.jpg");
       ajustar.AjustarImagen(ElGranGatsby, "imagenes","ElGranGatsby.jpg");
       

        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Amanecer = new javax.swing.JLabel();
        YoRobot = new javax.swing.JLabel();
        Dune = new javax.swing.JLabel();
        Ender = new javax.swing.JLabel();
        HailMary = new javax.swing.JLabel();
        TLOR = new javax.swing.JLabel();
        Fahrenheit = new javax.swing.JLabel();
        LaGuerra = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        ElProblema = new javax.swing.JLabel();
        ElImperio = new javax.swing.JLabel();
        HP = new javax.swing.JLabel();
        ENDV = new javax.swing.JLabel();
        GOT = new javax.swing.JLabel();
        PJ = new javax.swing.JLabel();
        LaHipotesis = new javax.swing.JLabel();
        RobinHobb = new javax.swing.JLabel();
        LaRueda = new javax.swing.JLabel();
        Agatha = new javax.swing.JLabel();
        Perdida = new javax.swing.JLabel();
        DiarioDeUnaPasión = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        JoelDicker = new javax.swing.JLabel();
        LSDV = new javax.swing.JLabel();
        LaPaciente = new javax.swing.JLabel();
        ECDV = new javax.swing.JLabel();
        EstudioEnEscarlata = new javax.swing.JLabel();
        Rebeca = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        YoAntesDeTi = new javax.swing.JLabel();
        NosotrosEnLaLuna = new javax.swing.JLabel();
        OyP = new javax.swing.JLabel();
        ElGranGatsby = new javax.swing.JLabel();
        EvelynHugo = new javax.swing.JLabel();
        Maurice = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        ATLCDLQME = new javax.swing.JLabel();
        Orwell = new javax.swing.JLabel();
        ElRetrato = new javax.swing.JLabel();
        AnnaK = new javax.swing.JLabel();
        Rayuela = new javax.swing.JLabel();
        CienAños = new javax.swing.JLabel();
        Frankenstein = new javax.swing.JLabel();
        ElFantasma = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jPanel1.setMinimumSize(new java.awt.Dimension(2000, 2800));
        jPanel1.setPreferredSize(new java.awt.Dimension(2000, 2700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(153, 255, 153));
        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jLabel2.setText("CLÁSICOS");
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2130, 1600, 50));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 36)); // NOI18N
        jLabel1.setText("Tres gatos colorados");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 230, -1));

        Amanecer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/AmanecerRojo.jpg"))); // NOI18N
        Amanecer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AmanecerMouseClicked(evt);
            }
        });
        jPanel1.add(Amanecer, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 140, 200, 180));

        YoRobot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/YoRobot.jpg"))); // NOI18N
        YoRobot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                YoRobotMouseClicked(evt);
            }
        });
        jPanel1.add(YoRobot, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 360, 200, 180));

        Dune.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Dune.jpg"))); // NOI18N
        Dune.setOpaque(true);
        Dune.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DuneMouseClicked(evt);
            }
        });
        jPanel1.add(Dune, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, 200, 180));

        Ender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ElJuegoDeEnder.jpg"))); // NOI18N
        Ender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EnderMouseClicked(evt);
            }
        });
        jPanel1.add(Ender, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 140, 200, 180));

        HailMary.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ProyectoHailMary.jpg"))); // NOI18N
        HailMary.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HailMaryMouseClicked(evt);
            }
        });
        jPanel1.add(HailMary, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 200, 180));

        TLOR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ElSeñorDeLosAnillos.jpg"))); // NOI18N
        TLOR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TLORMouseClicked(evt);
            }
        });
        jPanel1.add(TLOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 880, 200, 180));

        Fahrenheit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fahrenheit.jpg"))); // NOI18N
        Fahrenheit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FahrenheitMouseClicked(evt);
            }
        });
        jPanel1.add(Fahrenheit, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, 200, 180));

        LaGuerra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LaGuerraDeLosMundos.jpg"))); // NOI18N
        LaGuerra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LaGuerraMouseClicked(evt);
            }
        });
        jPanel1.add(LaGuerra, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 360, 200, 180));

        jLabel11.setBackground(new java.awt.Color(0, 102, 255));
        jLabel11.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jLabel11.setText("CIENCIA FICCIÓN");
        jLabel11.setOpaque(true);
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1600, 50));

        ElProblema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/3Cuerpos.jpg"))); // NOI18N
        ElProblema.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ElProblemaMouseClicked(evt);
            }
        });
        jPanel1.add(ElProblema, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 200, 180));

        ElImperio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ElImperioFinal.jpg"))); // NOI18N
        ElImperio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ElImperioMouseClicked(evt);
            }
        });
        jPanel1.add(ElImperio, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 660, 200, 180));

        HP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/HP.jpg"))); // NOI18N
        HP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HPMouseClicked(evt);
            }
        });
        jPanel1.add(HP, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 660, 200, 180));

        ENDV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ElNombreDelViento.jpg"))); // NOI18N
        ENDV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ENDVMouseClicked(evt);
            }
        });
        jPanel1.add(ENDV, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 660, 200, 180));

        GOT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/JuegoDeTronos.jpg"))); // NOI18N
        GOT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GOTMouseClicked(evt);
            }
        });
        jPanel1.add(GOT, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 660, 200, 180));

        PJ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PJ.jpg"))); // NOI18N
        PJ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PJMouseClicked(evt);
            }
        });
        jPanel1.add(PJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 880, 200, 180));

        LaHipotesis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LaHipotesis.jpg"))); // NOI18N
        LaHipotesis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LaHipotesisMouseEntered(evt);
            }
        });
        jPanel1.add(LaHipotesis, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 1670, 200, 180));

        RobinHobb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/RobinHobb.jpg"))); // NOI18N
        RobinHobb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RobinHobbMouseClicked(evt);
            }
        });
        jPanel1.add(RobinHobb, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 880, 200, 180));

        LaRueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/RuedaDelTiempo.jpg"))); // NOI18N
        LaRueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LaRuedaMouseClicked(evt);
            }
        });
        jPanel1.add(LaRueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 880, 200, 180));

        Agatha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Agatha.jpg"))); // NOI18N
        Agatha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AgathaMouseClicked(evt);
            }
        });
        jPanel1.add(Agatha, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 1160, 200, 180));

        Perdida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Perdida.jpg"))); // NOI18N
        Perdida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PerdidaMouseClicked(evt);
            }
        });
        jPanel1.add(Perdida, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 1380, 200, 180));

        DiarioDeUnaPasión.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/DiarioDeUnaPasión.jpg"))); // NOI18N
        DiarioDeUnaPasión.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DiarioDeUnaPasiónMouseClicked(evt);
            }
        });
        jPanel1.add(DiarioDeUnaPasión, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 1890, 200, 180));

        jLabel24.setBackground(new java.awt.Color(204, 0, 0));
        jLabel24.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jLabel24.setText("FANTASÍA");
        jLabel24.setOpaque(true);
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 1600, 50));

        JoelDicker.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LaVerdadSobreElCasoDeHarryQuebert.jpg"))); // NOI18N
        JoelDicker.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JoelDickerMouseClicked(evt);
            }
        });
        jPanel1.add(JoelDicker, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 1160, 200, 180));

        LSDV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LaSombraDelViento.jpg"))); // NOI18N
        LSDV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LSDVMouseClicked(evt);
            }
        });
        jPanel1.add(LSDV, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 1160, 200, 180));

        LaPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LaPacienteSilenciosa.jpg"))); // NOI18N
        LaPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LaPacienteMouseClicked(evt);
            }
        });
        jPanel1.add(LaPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 1160, 200, 180));

        ECDV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ElCódigoDaVinci.jpg"))); // NOI18N
        ECDV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ECDVMouseClicked(evt);
            }
        });
        jPanel1.add(ECDV, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 1380, 200, 180));

        EstudioEnEscarlata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/EstudioEnEscarlata.jpg"))); // NOI18N
        EstudioEnEscarlata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EstudioEnEscarlataMouseClicked(evt);
            }
        });
        jPanel1.add(EstudioEnEscarlata, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 1380, 200, 180));

        Rebeca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Rebeca.jpg"))); // NOI18N
        Rebeca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RebecaMouseClicked(evt);
            }
        });
        jPanel1.add(Rebeca, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 1380, 200, 180));

        jLabel7.setBackground(new java.awt.Color(102, 0, 102));
        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jLabel7.setText("MISTERIO");
        jLabel7.setOpaque(true);
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1090, 1600, 50));

        YoAntesDeTi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/YoAntesDeTi.jpg"))); // NOI18N
        YoAntesDeTi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                YoAntesDeTiMouseClicked(evt);
            }
        });
        jPanel1.add(YoAntesDeTi, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 1670, 200, 180));

        NosotrosEnLaLuna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/NosotrosEnLaLuna.jpg"))); // NOI18N
        NosotrosEnLaLuna.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NosotrosEnLaLunaMouseClicked(evt);
            }
        });
        jPanel1.add(NosotrosEnLaLuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 1670, 200, 180));

        OyP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/OrgulloYPrejuicio.jpg"))); // NOI18N
        OyP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OyPMouseClicked(evt);
            }
        });
        jPanel1.add(OyP, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 1670, 200, 180));

        ElGranGatsby.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ElGranGatsby.jpg"))); // NOI18N
        ElGranGatsby.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ElGranGatsbyMouseClicked(evt);
            }
        });
        jPanel1.add(ElGranGatsby, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 2420, 200, 180));

        EvelynHugo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Los7Maridos.jpg"))); // NOI18N
        EvelynHugo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EvelynHugoMouseClicked(evt);
            }
        });
        jPanel1.add(EvelynHugo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 1890, 200, 180));

        Maurice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Maurice.jpg"))); // NOI18N
        Maurice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MauriceMouseClicked(evt);
            }
        });
        jPanel1.add(Maurice, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 1890, 200, 180));

        jLabel37.setBackground(new java.awt.Color(255, 153, 204));
        jLabel37.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jLabel37.setText("ROMANCE");
        jLabel37.setOpaque(true);
        jPanel1.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1600, 1600, 50));

        ATLCDLQME.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ATLCDLQME.jpg"))); // NOI18N
        ATLCDLQME.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ATLCDLQMEMouseClicked(evt);
            }
        });
        jPanel1.add(ATLCDLQME, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 1890, 200, 180));

        Orwell.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1984.jpg"))); // NOI18N
        Orwell.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OrwellMouseClicked(evt);
            }
        });
        jPanel1.add(Orwell, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 2200, 200, 180));

        ElRetrato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ElRetratoDeDorian.jpg"))); // NOI18N
        ElRetrato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ElRetratoMouseClicked(evt);
            }
        });
        jPanel1.add(ElRetrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 2200, 200, 180));

        AnnaK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/AnnaKarenina.jpg"))); // NOI18N
        AnnaK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AnnaKMouseClicked(evt);
            }
        });
        jPanel1.add(AnnaK, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 2200, 200, 180));

        Rayuela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Rayuela.jpg"))); // NOI18N
        Rayuela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RayuelaMouseClicked(evt);
            }
        });
        jPanel1.add(Rayuela, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 2200, 200, 180));

        CienAños.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/CienAñosDeSoledad.jpg"))); // NOI18N
        CienAños.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CienAñosMouseClicked(evt);
            }
        });
        jPanel1.add(CienAños, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 2420, 200, 180));

        Frankenstein.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Frankenstein.jpg"))); // NOI18N
        Frankenstein.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FrankensteinMouseClicked(evt);
            }
        });
        jPanel1.add(Frankenstein, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 2420, 200, 180));

        ElFantasma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ElFantasma.jpg"))); // NOI18N
        ElFantasma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ElFantasmaMouseClicked(evt);
            }
        });
        jPanel1.add(ElFantasma, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 2420, 200, 180));

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Script MT Bold", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("X");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1510, 0, 30, 30));

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HailMaryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HailMaryMouseClicked
        comprar = new Compras();
        comprar.setVisible(true);
    }//GEN-LAST:event_HailMaryMouseClicked

    private void DuneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DuneMouseClicked
        comprar = new Compras();
        comprar.setVisible(true);
    }//GEN-LAST:event_DuneMouseClicked

    private void EnderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EnderMouseClicked
        comprar = new Compras();
        comprar.setVisible(true);
    }//GEN-LAST:event_EnderMouseClicked

    private void AmanecerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AmanecerMouseClicked
        comprar = new Compras();
        comprar.setVisible(true);
    }//GEN-LAST:event_AmanecerMouseClicked

    private void ElProblemaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ElProblemaMouseClicked
        comprar = new Compras();
        comprar.setVisible(true);
    }//GEN-LAST:event_ElProblemaMouseClicked

    private void FahrenheitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FahrenheitMouseClicked
        comprar = new Compras();
        comprar.setVisible(true);
    }//GEN-LAST:event_FahrenheitMouseClicked

    private void LaGuerraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LaGuerraMouseClicked
        comprar = new Compras();
        comprar.setVisible(true);
    }//GEN-LAST:event_LaGuerraMouseClicked

    private void YoRobotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_YoRobotMouseClicked
        comprar = new Compras();
        comprar.setVisible(true);
    }//GEN-LAST:event_YoRobotMouseClicked

    private void ElImperioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ElImperioMouseClicked
        comprar = new Compras();
        comprar.setVisible(true);
    }//GEN-LAST:event_ElImperioMouseClicked

    private void HPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HPMouseClicked
        comprar = new Compras();
        comprar.setVisible(true);
    }//GEN-LAST:event_HPMouseClicked

    private void ENDVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ENDVMouseClicked
        comprar = new Compras();
        comprar.setVisible(true);
    }//GEN-LAST:event_ENDVMouseClicked

    private void GOTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GOTMouseClicked
        comprar = new Compras();
        comprar.setVisible(true);
    }//GEN-LAST:event_GOTMouseClicked

    private void PJMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PJMouseClicked
        comprar = new Compras();
        comprar.setVisible(true);
    }//GEN-LAST:event_PJMouseClicked

    private void LaRuedaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LaRuedaMouseClicked
        comprar = new Compras();
        comprar.setVisible(true);
    }//GEN-LAST:event_LaRuedaMouseClicked

    private void RobinHobbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RobinHobbMouseClicked
        comprar = new Compras();
        comprar.setVisible(true);
    }//GEN-LAST:event_RobinHobbMouseClicked

    private void TLORMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TLORMouseClicked
        comprar = new Compras();
        comprar.setVisible(true);
    }//GEN-LAST:event_TLORMouseClicked

    private void AgathaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgathaMouseClicked
        comprar = new Compras();
        comprar.setVisible(true);
    }//GEN-LAST:event_AgathaMouseClicked

    private void JoelDickerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JoelDickerMouseClicked
        comprar = new Compras();
        comprar.setVisible(true);
    }//GEN-LAST:event_JoelDickerMouseClicked

    private void LSDVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LSDVMouseClicked
        comprar = new Compras();
        comprar.setVisible(true);
    }//GEN-LAST:event_LSDVMouseClicked

    private void LaPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LaPacienteMouseClicked
        comprar = new Compras();
        comprar.setVisible(true);
    }//GEN-LAST:event_LaPacienteMouseClicked

    private void ECDVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ECDVMouseClicked
        comprar = new Compras();
        comprar.setVisible(true);
    }//GEN-LAST:event_ECDVMouseClicked

    private void EstudioEnEscarlataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EstudioEnEscarlataMouseClicked
        comprar = new Compras();
        comprar.setVisible(true);
    }//GEN-LAST:event_EstudioEnEscarlataMouseClicked

    private void RebecaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RebecaMouseClicked
        comprar = new Compras();
        comprar.setVisible(true);
    }//GEN-LAST:event_RebecaMouseClicked

    private void PerdidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PerdidaMouseClicked
        comprar = new Compras();
        comprar.setVisible(true);
    }//GEN-LAST:event_PerdidaMouseClicked

    private void OyPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OyPMouseClicked
        comprar = new Compras();
        comprar.setVisible(true);
    }//GEN-LAST:event_OyPMouseClicked

    private void YoAntesDeTiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_YoAntesDeTiMouseClicked
        comprar = new Compras();
        comprar.setVisible(true);
    }//GEN-LAST:event_YoAntesDeTiMouseClicked

    private void NosotrosEnLaLunaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NosotrosEnLaLunaMouseClicked
        comprar = new Compras();
        comprar.setVisible(true);
    }//GEN-LAST:event_NosotrosEnLaLunaMouseClicked

    private void LaHipotesisMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LaHipotesisMouseEntered
        comprar = new Compras();
        comprar.setVisible(true);
    }//GEN-LAST:event_LaHipotesisMouseEntered

    private void ATLCDLQMEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ATLCDLQMEMouseClicked
        comprar = new Compras();
        comprar.setVisible(true);
    }//GEN-LAST:event_ATLCDLQMEMouseClicked

    private void EvelynHugoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EvelynHugoMouseClicked
        comprar = new Compras();
        comprar.setVisible(true);
    }//GEN-LAST:event_EvelynHugoMouseClicked

    private void MauriceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MauriceMouseClicked
        comprar = new Compras();
        comprar.setVisible(true);
    }//GEN-LAST:event_MauriceMouseClicked

    private void DiarioDeUnaPasiónMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DiarioDeUnaPasiónMouseClicked
        comprar = new Compras();
        comprar.setVisible(true);
    }//GEN-LAST:event_DiarioDeUnaPasiónMouseClicked

    private void OrwellMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrwellMouseClicked
        comprar = new Compras();
        comprar.setVisible(true);
    }//GEN-LAST:event_OrwellMouseClicked

    private void ElRetratoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ElRetratoMouseClicked
        comprar = new Compras();
        comprar.setVisible(true);
    }//GEN-LAST:event_ElRetratoMouseClicked

    private void AnnaKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AnnaKMouseClicked
        comprar = new Compras();
        comprar.setVisible(true);
    }//GEN-LAST:event_AnnaKMouseClicked

    private void RayuelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RayuelaMouseClicked
        comprar = new Compras();
        comprar.setVisible(true);
    }//GEN-LAST:event_RayuelaMouseClicked

    private void CienAñosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CienAñosMouseClicked
        comprar = new Compras();
        comprar.setVisible(true);
    }//GEN-LAST:event_CienAñosMouseClicked

    private void FrankensteinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FrankensteinMouseClicked
        comprar = new Compras();
        comprar.setVisible(true);
    }//GEN-LAST:event_FrankensteinMouseClicked

    private void ElFantasmaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ElFantasmaMouseClicked
        comprar = new Compras();
        comprar.setVisible(true);
    }//GEN-LAST:event_ElFantasmaMouseClicked

    private void ElGranGatsbyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ElGranGatsbyMouseClicked
        comprar = new Compras();
        comprar.setVisible(true);
    }//GEN-LAST:event_ElGranGatsbyMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

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
            java.util.logging.Logger.getLogger(Catálogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Catálogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Catálogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Catálogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Catálogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ATLCDLQME;
    private javax.swing.JLabel Agatha;
    private javax.swing.JLabel Amanecer;
    private javax.swing.JLabel AnnaK;
    private javax.swing.JLabel CienAños;
    private javax.swing.JLabel DiarioDeUnaPasión;
    private javax.swing.JLabel Dune;
    private javax.swing.JLabel ECDV;
    private javax.swing.JLabel ENDV;
    private javax.swing.JLabel ElFantasma;
    private javax.swing.JLabel ElGranGatsby;
    private javax.swing.JLabel ElImperio;
    private javax.swing.JLabel ElProblema;
    private javax.swing.JLabel ElRetrato;
    private javax.swing.JLabel Ender;
    private javax.swing.JLabel EstudioEnEscarlata;
    private javax.swing.JLabel EvelynHugo;
    private javax.swing.JLabel Fahrenheit;
    private javax.swing.JLabel Frankenstein;
    private javax.swing.JLabel GOT;
    private javax.swing.JLabel HP;
    private javax.swing.JLabel HailMary;
    private javax.swing.JLabel JoelDicker;
    private javax.swing.JLabel LSDV;
    private javax.swing.JLabel LaGuerra;
    private javax.swing.JLabel LaHipotesis;
    private javax.swing.JLabel LaPaciente;
    private javax.swing.JLabel LaRueda;
    private javax.swing.JLabel Maurice;
    private javax.swing.JLabel NosotrosEnLaLuna;
    private javax.swing.JLabel Orwell;
    private javax.swing.JLabel OyP;
    private javax.swing.JLabel PJ;
    private javax.swing.JLabel Perdida;
    private javax.swing.JLabel Rayuela;
    private javax.swing.JLabel Rebeca;
    private javax.swing.JLabel RobinHobb;
    private javax.swing.JLabel TLOR;
    private javax.swing.JLabel YoAntesDeTi;
    private javax.swing.JLabel YoRobot;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

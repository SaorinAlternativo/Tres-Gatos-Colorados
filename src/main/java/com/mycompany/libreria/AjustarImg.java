/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libreria;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author lilia
 */
public class AjustarImg {
        public void AjustarImagen(JLabel etiqueta, String ruta, String nombre) {
        ImageIcon img= new ImageIcon(getClass().getResource("/"+ruta+"/"+nombre));
        Icon ícono = new ImageIcon(img.getImage().getScaledInstance(etiqueta.getWidth(), etiqueta.getHeight(), Image.SCALE_DEFAULT));
        etiqueta.setIcon(ícono);
        }
    
}

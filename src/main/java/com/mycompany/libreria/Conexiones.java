/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libreria;

import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lilia
 */
public class Conexiones {
    private Statement sentenciaSQL;
    BDConexion con;
    
    public void ActualizarRegistro (Libreria lib) {
                String sql="UPDATE libros SET cantidad=? WHERE código=?";
                 try {
                     con= new BDConexion();
                     PreparedStatement pst= con.Conectarse().prepareStatement(sql);
                      pst.setInt(6, lib.getCantidad());
                      int n=pst.executeUpdate();
                      if(n>0) {
                        JOptionPane.showMessageDialog(null, "Transacción realizada","Confirmación",JOptionPane.INFORMATION_MESSAGE);
                        con.CerrarConexion();
                      }
                 } catch (ClassNotFoundException | SQLException e) {
                        JOptionPane.showMessageDialog(null, "Error "+e);   
                 }
            }
    
    public boolean SiExiste(int codigo) throws ClassNotFoundException, SQLException {
            con = new BDConexion();
            PreparedStatement ps = con.Conectarse().prepareStatement("Select 1 from libros where isbn= ?;");
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            return rs.next();  
        }
    
    public ImageIcon obtenerImagen(String isbn) throws SQLException, IOException {
            InputStream is = null;
            ImageIcon img = null;        
            String sql="SELECT imagen FROM libros WHERE isbn="+isbn;
            try {
                con = new BDConexion();
               sentenciaSQL = con.Conectarse().createStatement();
            ResultSet rs = sentenciaSQL.executeQuery(sql);
            
            if (rs.next()) {
                is=rs.getBinaryStream(1);
                BufferedImage bi = ImageIO.read(is);
                img=new ImageIcon(bi);
            }
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Error","Error",JOptionPane.ERROR_MESSAGE);
       
        }
        con.CerrarConexion();
        sentenciaSQL.close();
        return img;
    }
    
     public JTable mostrarTabla(JTable tablaLibros) {
                try {
                    String sql;
                    con= new BDConexion();
                    sentenciaSQL=con.Conectarse().createStatement();
                    sql="SELECT isbn, título, precio, imagen FROM libros";
                    ResultSet rs = sentenciaSQL.executeQuery(sql);
                    ResultSetMetaData rsm = rs.getMetaData();
                    int col = rsm.getColumnCount();
                    DefaultTableModel modelo = new DefaultTableModel();
                    for(int i=1; i<=col; i++) {
                        modelo.addColumn(rsm.getColumnLabel(i)); //Agrega el encabezado a la tabla s
                    }
                    while(rs.next()) {
                        String[] fila = new String[col];
                        for (int j=0; j<col; j++) {
                            fila[j]=rs.getString(j+1);
                        }
                        modelo.addRow(fila);
                    }
                    tablaLibros.setModel(modelo);
                    rs.close();
                    con.CerrarConexion();
                    
                } catch (Exception e) {
                   JOptionPane.showMessageDialog(null,"Error","Error",JOptionPane.INFORMATION_MESSAGE);
                }
                return tablaLibros;
            }
    
}

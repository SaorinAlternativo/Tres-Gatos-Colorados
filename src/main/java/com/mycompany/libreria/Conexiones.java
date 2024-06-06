/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libreria;

import java.awt.HeadlessException;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Date;
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
    Connection conectar;
    
    public void ActualizarRegistro (Libreria lib) {
                String sql="UPDATE libros SET Cantidad=?, CantidadEnExistencia=? WHERE isbn=?";
                 try {
                     con= new BDConexion();
                     PreparedStatement pst= con.Conectarse().prepareStatement(sql);
                      pst.setInt(1, lib.getCantidad());
                      pst.setInt(2, lib.getCantidadEnExistencia());
                      pst.setString(3, lib.getIsbn());
                      
                      int n=pst.executeUpdate();
                      if(n>0) {
                        JOptionPane.showMessageDialog(null, "Transacción realizada","Confirmación",JOptionPane.INFORMATION_MESSAGE);
                        con.CerrarConexion();
                      }
                 } catch (ClassNotFoundException | SQLException e) {
                        JOptionPane.showMessageDialog(null, "Error "+e);   
                 }
            }
    
    public boolean SiExiste(String título) throws ClassNotFoundException, SQLException {
            con = new BDConexion();
            PreparedStatement ps = con.Conectarse().prepareStatement("Select 1 from encargos where título= ?;");
            ps.setString(1, título);
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
                    sql="SELECT isbn, título, precio, cantidad, CantidadEnExistencia FROM libros";
                    //Original: sql="SELECT isbn, título, precio, cantidad, imagen FROM libros";
                    
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
     
      public void RegistroNuevo(Libreria lib) throws FileNotFoundException {
        String insertar="INSERT INTO encargos (título,autor,género) VALUES(?,?,?)";
        try {
            con = new BDConexion();
            PreparedStatement pst = con.Conectarse().prepareStatement(insertar);
            pst.setString(1,lib.getTítulo());
            pst.setString(2,lib.getAutor());
            pst.setString(3,lib.getGénero());
            int n=pst.executeUpdate();
            if (n>0) {
                JOptionPane.showMessageDialog(null, "Registro guardado","Confirmación",JOptionPane.INFORMATION_MESSAGE);
            }
            con.CerrarConexion();
            
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            
        }
    }
      
      public void PreOrdenar (Libreria lib) throws FileNotFoundException {
        String insertar="INSERT INTO preventas (Nombre_del_cliente,título,autor,género,Fecha_de_salida) VALUES(?,?,?,?,?)";
        try {
            con = new BDConexion();
            PreparedStatement pst = con.Conectarse().prepareStatement(insertar);
            pst.setString(1,lib.getNombre_del_cliente());
            pst.setString(2,lib.getTítulo());
            pst.setString(3,lib.getAutor());
            pst.setString(4,lib.getGénero());
            pst.setString(5,lib.getFecha_de_salida());
            int n=pst.executeUpdate();
            if (n>0) {
                JOptionPane.showMessageDialog(null, "Registro guardado","Confirmación",JOptionPane.INFORMATION_MESSAGE);
            }
            con.CerrarConexion();
            
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            
        }
    }
      public boolean ExisteOrden(String Nombre_del_cliente) throws ClassNotFoundException, SQLException {
            con = new BDConexion();
            PreparedStatement ps = con.Conectarse().prepareStatement("Select 1 from preventas where Nombre_del_cliente= ?;");
            ps.setString(1,Nombre_del_cliente);
            ResultSet rs = ps.executeQuery();
            return rs.next();  
        }
      
      public JTable BuscarLibro(String Nombre, JTable Tabla){
        try {
            String sql;
            con = new BDConexion();
            sentenciaSQL = con.Conectarse().createStatement();
            if(Nombre.equals("")){
            sql="SELECT isbn, título, precio, cantidad, CantidadEnExistencia FROM libros";
            }
            else{
                sql="SELECT isbn, título, precio, cantidad, CantidadEnExistencia FROM libros where isbn like'%"+Nombre+"%' OR título like'%"+Nombre+"%' "
                        + "OR autor like'%"+Nombre+"%' OR cantidad like'%"+Nombre+"%' "
                        + "OR precio like'%"+Nombre+"%' OR género like'%"+Nombre+"%' ";
            }
            ResultSet rs= sentenciaSQL.executeQuery(sql);
            ResultSetMetaData rsm=rs.getMetaData();
            int col=rsm.getColumnCount();
            DefaultTableModel modelo = new DefaultTableModel();{
        }
            for(int i=1;i<=col;i++){
                modelo.addColumn(rsm.getColumnLabel(i));
            }
            while(rs.next()){
                String[] fila = new String[col];
                for(int j=0;j<col;j++){
                    fila[j]=rs.getString(j+1);
                }
                modelo.addRow(fila);
            }
            Tabla.setModel(modelo);
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error...", "Error",JOptionPane.INFORMATION_MESSAGE);
        }
        return Tabla;
    }
      
       public void Devoluciones (Libreria lib) throws FileNotFoundException {
        String insertar="INSERT INTO devoluciones (isbn,titulo,autor) VALUES(?,?,?)";
        try {
            con = new BDConexion();
            PreparedStatement pst = con.Conectarse().prepareStatement(insertar);
            pst.setString(1,lib.getIsbn());
            pst.setString(2,lib.getTítulo());
            pst.setString(3,lib.getAutor());
            int n=pst.executeUpdate();
            if (n>0) {
                JOptionPane.showMessageDialog(null, "Devolución guardada","Confirmación",JOptionPane.INFORMATION_MESSAGE);
            }
            con.CerrarConexion();
            
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            
        }
       }
            
              public void RegistroVenta(Libreria lib) throws FileNotFoundException {
        String insertar="INSERT INTO ventas (isbn,título,precio,cantidad,Número_de_venta) VALUES(?,?,?,?,?)";      
        try {
            con = new BDConexion();
            PreparedStatement pst = con.Conectarse().prepareStatement(insertar);
            pst.setString(1,lib.getIsbn());
            pst.setString(2,lib.getTítulo());
            pst.setFloat(3,lib.getPrecio());
            pst.setInt(4,lib.getCantidad());
            pst.setInt(5,lib.getNúmero_de_venta());
            int n=pst.executeUpdate();
            if (n>0) {
                JOptionPane.showMessageDialog(null, "Registro guardado","Confirmación",JOptionPane.INFORMATION_MESSAGE);
            }
            con.CerrarConexion();
            
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            
        }
    }
}

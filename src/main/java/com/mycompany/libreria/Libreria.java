/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.libreria;

import java.util.Date;


public class Libreria {
private String título;
private String isbn;
private String autor;
private float precio;
private String género;
private int Cantidad;
private String imagen;
private String Nombre_del_cliente;
private String Número_de_cliente;
private String Fecha_de_salida;
private int CantidadEnExistencia;
private int Número_de_venta;

    public int getNúmero_de_venta() {
        return Número_de_venta;
    }

    public void setNúmero_de_venta(int Número_de_venta) {
        this.Número_de_venta = Número_de_venta;
    }

    public int getCantidadEnExistencia() {
        return CantidadEnExistencia;
    }

    public void setCantidadEnExistencia(int CantidadEnExistencia) {
        this.CantidadEnExistencia = CantidadEnExistencia;
    }

    public String getFecha_de_salida() {
        return Fecha_de_salida;
    }

    public void setFecha_de_salida(String Fecha_de_salida) {
        this.Fecha_de_salida = Fecha_de_salida;
    }



    public String getNombre_del_cliente() {
        return Nombre_del_cliente;
    }

    public void setNombre_del_cliente(String Nombre_del_cliente) {
        this.Nombre_del_cliente = Nombre_del_cliente;
    }

    public String getNúmero_de_cliente() {
        return Número_de_cliente;
    }

    public void setNúmero_de_cliente(String Número_de_cliente) {
        this.Número_de_cliente = Número_de_cliente;
    }


    public Libreria(String título, String isbn, String autor, float precio, String género, int Cantidad, int CantidadEnExistencia, String imagen, String Número_de_cliente, 
            String Nombre_del_cliente, String Fecha_de_salida, int Número_de_venta) {
        this.título = título;
        this.isbn = isbn;
        this.autor = autor;
        this.precio = precio;
        this.género = género;
        this.Cantidad = Cantidad;
        this.CantidadEnExistencia = CantidadEnExistencia;
        this.imagen = imagen;
        this.Número_de_cliente = Número_de_cliente;
        this.Nombre_del_cliente = Nombre_del_cliente;
        this.Fecha_de_salida = Fecha_de_salida;
    }
    
    public Libreria() {
        
    }

    public String getTítulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getGénero() {
        return género;
    }

    public void setGénero(String género) {
        this.género = género;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        this.Cantidad = cantidad;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
    

   
}

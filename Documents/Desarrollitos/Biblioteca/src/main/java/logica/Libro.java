package logica;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Libro {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idBook;
    private int ISBN;
    private String titulo;
    private String autor;
    private String genero;
    private Double precio;
    @ManyToOne
    @JoinColumn(name="idbook")
    private Venta book;

    public Libro() {
    }

    public Libro(int idBook, int ISBN, String titulo, String autor, String genero, Double precio, Venta book) {
        this.idBook = idBook;
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.precio = precio;
        this.book = book;
    }

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Venta getBook() {
        return book;
    }

    public void setBook(Venta book) {
        this.book = book;
    }
    
    
}

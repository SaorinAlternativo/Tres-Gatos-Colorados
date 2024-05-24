package logica;

public class libro {
    private String titulo;
    private Double isbn;
    private String autor;
    private int precio;
    private String genero;
    private int cantidad;

    public libro() {
    }

    public libro(String titulo, Double isbn, String autor, int precio, String genero, int cantidad) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.precio = precio;
        this.genero = genero;
        this.cantidad = cantidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Double getIsbn() {
        return isbn;
    }

    public void setIsbn(Double isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
    
    
}

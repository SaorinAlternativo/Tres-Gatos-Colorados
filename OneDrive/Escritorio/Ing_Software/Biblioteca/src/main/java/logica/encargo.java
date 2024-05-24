package logica;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class encargo extends libro {
    private int id_encargo;
    private String nombreEncargo;
    
    @ManyToOne
    @JoinColumn(name="id_encargo")
    private cliente encarg;

    public encargo() {
    }

    public encargo(int id_encargo, String nombreEncargo, String titulo, Double isbn, String autor, int precio, String genero, int cantidad) {
        super(titulo, isbn, autor, precio, genero, cantidad);
        this.id_encargo = id_encargo;
        this.nombreEncargo = nombreEncargo;
    }

    public int getId_encargo() {
        return id_encargo;
    }

    public void setId_encargo(int id_encargo) {
        this.id_encargo = id_encargo;
    }

    public String getNombreEncargo() {
        return nombreEncargo;
    }

    public void setNombreEncargo(String nombreEncargo) {
        this.nombreEncargo = nombreEncargo;
    }

    

    
    
    
    
}

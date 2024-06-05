package logica;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Encargo{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idEncargo;
    private String fechaEncargo;
    private boolean estreno;
    @ManyToOne
    @JoinColumn(name="id_encargo")
    private Cliente Fleet;

    public Encargo() {
    }

    public Encargo(int idEncargo, String fechaEncargo, boolean estreno, Cliente Fleet) {
        this.idEncargo = idEncargo;
        this.fechaEncargo = fechaEncargo;
        this.estreno = estreno;
        this.Fleet = Fleet;
    }

    
    public int getIdEncargo() {
        return idEncargo;
    }

    public void setIdEncargo(int idEncargo) {
        this.idEncargo = idEncargo;
    }

    public String getFechaEncargo() {
        return fechaEncargo;
    }

    public void setFechaEncargo(String fechaEncargo) {
        this.fechaEncargo = fechaEncargo;
    }

    public boolean isEstreno() {
        return estreno;
    }

    public void setEstreno(boolean estreno) {
        this.estreno = estreno;
    }
    
    
    
    
}

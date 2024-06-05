package logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Escritos implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
   private int idEscritos; 
   private String URL;
   private String estado;
   
   @ManyToOne
   @JoinColumn(name="id_escrito")
   private Curriculum write;

    public Escritos() {
    }

    public Escritos(int idEscritos, String URL, String estado) {
        this.idEscritos = idEscritos;
        this.URL = URL;
        this.estado = estado;
    }

    public int getIdEscritos() {
        return idEscritos;
    }

    public void setIdEscritos(int idEscritos) {
        this.idEscritos = idEscritos;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
   
   

}

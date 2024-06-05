package logica;



import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Curriculum implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idCurriculum;
    @OneToMany (mappedBy="write")
    private List<Escritos> listaEscritos;

    public Curriculum() {
    }

    public Curriculum(int idCurriculum, List<Escritos> listaEscritos) {
        this.idCurriculum = idCurriculum;
        this.listaEscritos = listaEscritos;
    }

    public int getIdCurriculum() {
        return idCurriculum;
    }

    public void setIdCurriculum(int idCurriculum) {
        this.idCurriculum = idCurriculum;
    }

    public List<Escritos> getListaEscritos() {
        return listaEscritos;
    }

    public void setListaEscritos(List<Escritos> listaEscritos) {
        this.listaEscritos = listaEscritos;
    }
    
    
}

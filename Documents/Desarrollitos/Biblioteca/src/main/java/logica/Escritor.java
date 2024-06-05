package logica;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Escritor{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idEscritor;
    private String correo;
    private String contrasenia;
    @OneToOne
    private Curriculum curriculum;

    public Escritor() {
    }

    public Escritor(int idEscritor, String correo, String contrasenia, Curriculum curriculum) {
        this.idEscritor = idEscritor;
        this.correo = correo;
        this.contrasenia = contrasenia;
        this.curriculum = curriculum;
    }

    public int getIdEscritor() {
        return idEscritor;
    }

    public void setIdEscritor(int idEscritor) {
        this.idEscritor = idEscritor;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public Curriculum getCurriculum() {
        return curriculum;
    }

    public void setCurriculum(Curriculum curriculum) {
        this.curriculum = curriculum;
    }
    
    
}


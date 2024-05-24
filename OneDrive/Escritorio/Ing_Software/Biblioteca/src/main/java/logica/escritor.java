package logica;

import javax.persistence.Entity;

@Entity
public class escritor extends persona {
   // private int id_escritor;
    private boolean escritoExiste;
    private String curriculum; 
    public escritor() {
    }
    

    /*public int getId_escritor() {
        return id_escritor;
    }

    public void setId_escritor(int id_escritor) {
        this.id_escritor = id_escritor;
    }*/

    public escritor(boolean escritoExiste, String curriculum, String dni, String nombre, String apellido, String correo) {
        super(dni, nombre, apellido, correo);
        this.escritoExiste = escritoExiste;
        this.curriculum = curriculum;
    }

    public boolean isEscritoExiste() {
        return escritoExiste;
    }

    public void setEscritoExiste(boolean escritoExiste) {
        this.escritoExiste = escritoExiste;
    }

    public String getCurriculum() {
        return curriculum;
    }

    public void setCurriculum(String curriculum) {
        this.curriculum = curriculum;
    }
    
     
    
    
}

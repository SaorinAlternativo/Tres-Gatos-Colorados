package logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tarjeta implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idTarjeta;
    private String NumTarjeta;
    private String NombreTarjeta;
    private String FechaVencimiento;
    private String CVV;

    public Tarjeta() {
    }

    public Tarjeta(int idTarjeta, String NumTarjeta, String NombreTarjeta, String FechaVencimiento, String CVV) {
        this.idTarjeta = idTarjeta;
        this.NumTarjeta = NumTarjeta;
        this.NombreTarjeta = NombreTarjeta;
        this.FechaVencimiento = FechaVencimiento;
        this.CVV = CVV;
    }

    public int getIdTarjeta() {
        return idTarjeta;
    }

    public void setIdTarjeta(int idTarjeta) {
        this.idTarjeta = idTarjeta;
    }

    public String getNumTarjeta() {
        return NumTarjeta;
    }

    public void setNumTarjeta(String NumTarjeta) {
        this.NumTarjeta = NumTarjeta;
    }

    

    public String getNombreTarjeta() {
        return NombreTarjeta;
    }

    public void setNombreTarjeta(String NombreTarjeta) {
        this.NombreTarjeta = NombreTarjeta;
    }

    public String getFechaVencimiento() {
        return FechaVencimiento;
    }

    public void setFechaVencimiento(String FechaVencimiento) {
        this.FechaVencimiento = FechaVencimiento;
    }

    public String getCVV() {
        return CVV;
    }

    public void setCVV(String CVV) {
        this.CVV = CVV;
    }
    
    
}

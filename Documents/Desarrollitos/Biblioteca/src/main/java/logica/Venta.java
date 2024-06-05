package logica;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Venta implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idVenta;
    @OneToMany (mappedBy="id_venta")                                                                                                                                                                                                                                                                                                                                                        
    private List<Libro> listaLibros;  
    private int cantidad;
    private Double monto;
    @ManyToOne
    @JoinColumn(name="id_Venta")
    private Cliente Sell;

    public Venta() {
    }

    public Venta(int idVenta, List<Libro> listaLibros, int cantidad, Double monto) {
        this.idVenta = idVenta;
        this.listaLibros = listaLibros;
        this.cantidad = cantidad;
        this.monto = monto;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public List<Libro> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(List<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }
    
    
    
    
    
    
}

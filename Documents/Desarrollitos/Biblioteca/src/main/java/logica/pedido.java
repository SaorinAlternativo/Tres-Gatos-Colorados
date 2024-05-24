package logica;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class pedido {
    private int id_pedido;
    private String nombrePedido;
    private String fechaLlegada;
    
    @ManyToOne
    @JoinColumn(name="id_pedido")
    private cliente pedi;

    public pedido(int id_pedido, String nombrePedido, String fechaLlegada) {
        this.id_pedido = id_pedido;
        this.nombrePedido = nombrePedido;
        this.fechaLlegada = fechaLlegada;
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public String getNombrePedido() {
        return nombrePedido;
    }

    public void setNombrePedido(String nombrePedido) {
        this.nombrePedido = nombrePedido;
    }

    public String getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(String fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }
    
    
    
}

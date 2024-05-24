package logica;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class cliente extends persona{
    //private int id_cliente;
    @OneToMany (mappedBy="encarg")
    private List<encargo> listaEncargos;
    @OneToMany (mappedBy = "pedi")
    private List<pedido> listaPedidos;

    public cliente() {
    }

    public cliente(List<encargo> listaEncargos, List<pedido> listaPedidos, String dni, String nombre, String apellido, String correo) {
        super(dni, nombre, apellido, correo);
        this.listaEncargos = listaEncargos;
        this.listaPedidos = listaPedidos;
    }

    

    /*public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }
*/
    public List<encargo> getListaEncargos() {
        return listaEncargos;
    }

    public void setListaEncargos(List<encargo> listaEncargos) {
        this.listaEncargos = listaEncargos;
    }

    public List<pedido> getListaPedidos() {
        return listaPedidos;
    }

    public void setListaPedidos(List<pedido> listaPedidos) {
        this.listaPedidos = listaPedidos;
    }

    
    
    
    
    
}

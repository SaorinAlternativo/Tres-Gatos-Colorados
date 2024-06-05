package logica;


import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Cliente{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idCliente;
    private String correo;
    private String contrasenia;
    @OneToMany (mappedBy="Fleet")
    private List<Encargo> listaEncargos;
    @OneToMany (mappedBy="Sell")
    private List<Venta> listaVentas;
    @OneToOne
    private Tarjeta tarjeta = new Tarjeta();

    public Cliente() {
    }

    public Cliente(int idCliente, String correo, String contrasenia, List<Encargo> listaEncargos, List<Venta> listaVentas) {
        this.idCliente = idCliente;
        this.correo = correo;
        this.contrasenia = contrasenia;
        this.listaEncargos = listaEncargos;
        this.listaVentas = listaVentas;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
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

    public List<Encargo> getListaEncargos() {
        return listaEncargos;
    }

    public void setListaEncargos(List<Encargo> listaEncargos) {
        this.listaEncargos = listaEncargos;
    }

    public List<Venta> getListaVentas() {
        return listaVentas;
    }

    public void setListaVentas(List<Venta> listaVentas) {
        this.listaVentas = listaVentas;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }
     
    
        
}

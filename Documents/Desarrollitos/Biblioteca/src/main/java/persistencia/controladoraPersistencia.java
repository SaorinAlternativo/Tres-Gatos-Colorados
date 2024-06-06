package persistencia;

import logica.Tarjeta;



public class controladoraPersistencia {
    
    ClienteJpaController clienteJPA = new ClienteJpaController();
    CurriculumJpaController curriculumJPA = new CurriculumJpaController();
    EncargoJpaController encargoJPA = new EncargoJpaController();
    EscritorJpaController escritorJPA = new EscritorJpaController();
    EscritosJpaController escritoJPA = new EscritosJpaController();
    LibroJpaController libroJPA = new LibroJpaController();
    TarjetaJpaController tarjetaJPA = new TarjetaJpaController();
    VentaJpaController ventaJPA = new VentaJpaController();

    public controladoraPersistencia() {
    }
    
    

    public void crearTarjeta(Tarjeta card) {
        tarjetaJPA.create(card);
    }
    
    
    


}

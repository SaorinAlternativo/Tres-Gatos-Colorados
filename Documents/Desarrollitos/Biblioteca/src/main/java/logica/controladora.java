package logica;

import persistencia.controladoraPersistencia;

public class controladora {
    
    controladoraPersistencia controlPersis = new controladoraPersistencia();
    public void crearTarjeta(int id,int NumTarjeta, String NombreTarjeta,String fechaVencimiento, String cvv){
        Tarjeta card = new Tarjeta(id, NumTarjeta, NombreTarjeta, fechaVencimiento, cvv);
        controlPersis.crearTarjeta(card);
    }

    }
    

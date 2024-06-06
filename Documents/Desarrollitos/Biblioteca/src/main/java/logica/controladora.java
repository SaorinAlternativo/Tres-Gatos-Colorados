package logica;

import persistencia.controladoraPersistencia;

public class controladora {
    
    controladoraPersistencia controlPersis = new controladoraPersistencia();
    public void crearTarjeta(String NumTarjeta, String NombreTarjeta,String fechaVencimiento, String cvv){
        Tarjeta card = new Tarjeta();
        card.setNumTarjeta(NumTarjeta);
        card.setNombreTarjeta(NombreTarjeta);
        card.setFechaVencimiento(fechaVencimiento);
        card.setCVV(cvv);
        controlPersis.crearTarjeta(card);
    }

    }
    

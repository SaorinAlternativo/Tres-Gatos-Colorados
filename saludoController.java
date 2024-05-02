package com.GatoColorado.Prueba.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apisaludos")
public class saludoController {
    @GetMapping("/hola")
    public String holamundo(){
        return "Hola Mundo!";
    }
    @GetMapping("/holanombre/{nombre}/{edad}")
    public String holamundonombre(@PathVariable String nombre, @PathVariable int edad){
        return "Hola mundo" + nombre + " tu edad es:" + edad;
    }
    
}

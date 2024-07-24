package com.orgamez.acesoriasSchorty.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorRest {

    @GetMapping("/")
    public String saludar(){
        return "Mamasota estoy triunfando, estoy haciendo mi primera página web con JSB";
    }

    @GetMapping("/vista")
    public String presentar(){
        return "Hola a todos, me llamo Schorty Rekathre :)";
    }
}

package com.name.carregistry.controller;

import com.name.carregistry.service.CarRegistryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/")
public class CarRegistryController {

    @Autowired
    public CarRegistryService carRegistryService;

    @GetMapping("/cars")
    public ResponseEntity<String> acceso() {
        log.info("Ha accedido a la aplicación");
        // Retornar un mensaje de acceso exitoso
        return ResponseEntity.ok("Acceso a la aplicación exitoso");
    }

    @GetMapping("/datos")
    public ResponseEntity<String> datos() {
        // Ejecutar métodos del servicio
        carRegistryService.mostrarSubitulo();
        carRegistryService.mostrarDatos();
        // Retornar respuesta exitosa
        return ResponseEntity.ok("Datos mostrados con éxito");
    }
}
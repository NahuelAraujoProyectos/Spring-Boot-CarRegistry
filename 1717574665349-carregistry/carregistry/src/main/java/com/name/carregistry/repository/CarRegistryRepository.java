package com.name.carregistry.repository;

import com.name.carregistry.model.Vehiculo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Repository
@Slf4j
public class CarRegistryRepository {

    // Inicialización correcta del objeto Vehiculo usando el patrón Builder
    Vehiculo vehiculo = Vehiculo.builder()
            .marca("Honda")
            .modelo("Civic")
            .anio(2020)
            .build();

    public void mostrarDatos() {
        log.info("Datos: {}", vehiculo.toString());
    }
}
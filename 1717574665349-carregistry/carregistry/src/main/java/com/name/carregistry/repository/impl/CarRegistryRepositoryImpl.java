package com.name.carregistry.repository.impl;

import com.name.carregistry.model.Vehiculo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Repository
@Slf4j
public class CarRegistryRepositoryImpl implements com.name.carregistry.repository.CarRegistryRepository {

    private Vehiculo vehiculo = new Vehiculo("Toyota","Corolla",2000);

    public void mostrarDatos(){
        log.info("Datos: {}", vehiculo.toString());
    }
}

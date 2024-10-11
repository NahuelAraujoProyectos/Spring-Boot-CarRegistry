package com.name.carregistry.service.impl;

import com.name.carregistry.repository.CarRegistryRepository;
import com.name.carregistry.repository.impl.CarRegistryRepositoryImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CarRegistryServiceImpl implements CarRegistryRepository {
    @Autowired
    public CarRegistryRepositoryImpl carRegistryRepository;

    @Value("${spring.property.text}")
    public String subtitulo;

    public void mostrarSubitulo(){
        log.info(subtitulo);
    }

    public void mostrarDatos(){
        carRegistryRepository.mostrarDatos();
    }
}

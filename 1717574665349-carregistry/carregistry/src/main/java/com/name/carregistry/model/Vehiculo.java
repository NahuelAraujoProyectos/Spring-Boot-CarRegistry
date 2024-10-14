package com.name.carregistry.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.Builder;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Vehiculo {
    private String marca;
    private String modelo;
    private int anio;
}

package com.example.vuelos.dtos;

import java.time.LocalDate;

// DTO de salida para exponer datos del vuelo
public record VueloResponseDTO(
        Integer id,
        String nombreVuelo,
        String empresa,
        String lugarSalida,
        String lugarLlegada,
        LocalDate fechaSalida,
        LocalDate fechaLlegada,
        long duracionDias
) {}


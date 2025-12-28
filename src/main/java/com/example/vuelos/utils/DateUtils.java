package com.example.vuelos.utils;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

// Clase utilitaria para operaciones con fechas
public class DateUtils {

    // Calcula la duración en días entre dos fechas
    public static long calcularDuracionDias(LocalDate inicio, LocalDate fin) {
        return ChronoUnit.DAYS.between(inicio, fin);
    }
}

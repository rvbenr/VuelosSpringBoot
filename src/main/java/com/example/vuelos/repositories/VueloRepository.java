package com.example.vuelos.repositories;

import com.example.vuelos.models.Vuelo;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// Repositorio que simula una base de datos en memoria
@Repository
public class VueloRepository {

    // Lista que almacena los vuelos
    private final List<Vuelo> vuelos = new ArrayList<>();

    // Se cargan datos de ejemplo al iniciar la aplicación
    public VueloRepository() {

        vuelos.add(new Vuelo(1, "IB-100", "Iberia",
                "Madrid", "Buenos Aires",
                LocalDate.of(2025, 3, 10),
                LocalDate.of(2025, 3, 11)));

        vuelos.add(new Vuelo(2, "TK-200", "Turkish Airlines",
                "Estambul", "New York",
                LocalDate.of(2025, 4, 5),
                LocalDate.of(2025, 4, 6)));

        vuelos.add(new Vuelo(3, "EK-300", "Emirates",
                "Dubai", "Sydney",
                LocalDate.of(2025, 5, 1),
                LocalDate.of(2025, 5, 3)));

        vuelos.add(new Vuelo(4, "LH-400", "Lufthansa",
                "Frankfurt", "Tokyo",
                LocalDate.of(2025, 6, 15),
                LocalDate.of(2025, 6, 16)));

        vuelos.add(new Vuelo(5, "AF-500", "Air France",
                "Paris", "Toronto",
                LocalDate.of(2025, 7, 20),
                LocalDate.of(2025, 7, 21)));

        vuelos.add(new Vuelo(6, "AA-600", "American Airlines",
                "Miami", "Los Angeles",
                LocalDate.of(2025, 8, 10),
                LocalDate.of(2025, 8, 10)));

        vuelos.add(new Vuelo(7, "BA-700", "British Airways",
                "London", "Cape Town",
                LocalDate.of(2025, 9, 5),
                LocalDate.of(2025, 9, 6)));

        vuelos.add(new Vuelo(8, "QR-800", "Qatar Airways",
                "Doha", "Bangkok",
                LocalDate.of(2025, 10, 1),
                LocalDate.of(2025, 10, 2)));

        vuelos.add(new Vuelo(9, "AZ-900", "ITA Airways",
                "Rome", "Sao Paulo",
                LocalDate.of(2025, 11, 12),
                LocalDate.of(2025, 11, 13)));

        vuelos.add(new Vuelo(10, "KL-1000", "KLM",
                "Amsterdam", "Mexico City",
                LocalDate.of(2025, 12, 3),
                LocalDate.of(2025, 12, 4)));
    }
    // Devuelve todos los vuelos
    public List<Vuelo> findAll() {
        return vuelos;
    }

    // Busca un vuelo por su ID
    public Vuelo findById(int id) {
        return vuelos.stream()
                .filter(v -> v.getId() == id)
                .findFirst()
                .orElse(null);
    }

    // Guarda un nuevo vuelo
    public void save(Vuelo vuelo) {
        vuelos.add(vuelo);
    }

    // Elimina un vuelo por ID
    public void delete(int id) {
        vuelos.removeIf(v -> v.getId() == id);
    }

    public void deleteById(int id) {
        vuelos.removeIf(v -> v.getId() == id);
    }

    public Vuelo guardar(Vuelo vuelo) {
        vuelos.add(vuelo);
        return vuelo;
    }


}



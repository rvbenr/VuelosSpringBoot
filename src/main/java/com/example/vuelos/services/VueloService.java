package com.example.vuelos.services;

import com.example.vuelos.dtos.VueloResponseDTO;
import com.example.vuelos.models.Vuelo;
import com.example.vuelos.repositories.VueloRepository;
import com.example.vuelos.utils.DateUtils;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// Servicio que contiene la lógica de negocio
@Service
public class VueloService {

    private final VueloRepository vueloRepository;

    // Inyección del repositorio
    public VueloService(VueloRepository repository) {
        this.vueloRepository = repository;
    }

    // Obtiene vuelos con filtros opcionales
    public List<VueloResponseDTO> obtenerVuelos(
            String empresa,
            String lugarLlegada,
            LocalDate fechaSalida
    ) {
        return vueloRepository.findAll().stream()
                .filter(v -> empresa == null || v.getEmpresa().equalsIgnoreCase(empresa))
                .filter(v -> lugarLlegada == null || v.getLugarLlegada().equalsIgnoreCase(lugarLlegada))
                .filter(v -> fechaSalida == null || v.getFechaSalida().equals(fechaSalida))
                .sorted(Comparator.comparing(Vuelo::getFechaSalida))
                .map(this::toDTO)
                .collect(Collectors.toList());
    }

    public Vuelo getById(int id) {
        return vueloRepository.findById(id);
    }


    // Convierte el modelo Vuelo en DTO
    private VueloResponseDTO toDTO(Vuelo vuelo) {
        return new VueloResponseDTO(
                vuelo.getId(),
                vuelo.getNombreVuelo(),
                vuelo.getEmpresa(),
                vuelo.getLugarSalida(),
                vuelo.getLugarLlegada(),
                vuelo.getFechaSalida(),
                vuelo.getFechaLlegada(),
                DateUtils.calcularDuracionDias(
                        vuelo.getFechaSalida(),
                        vuelo.getFechaLlegada()
                )
        );
    }
}


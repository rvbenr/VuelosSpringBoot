package com.example.vuelos.controllers;

import com.example.vuelos.dtos.VueloResponseDTO;
import com.example.vuelos.services.VueloService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

// Controlador REST que expone la API de vuelos
@RestController
@RequestMapping("/vuelos")
public class VueloController {

    private final VueloService service;

    // Inyección del servicio
    public VueloController(VueloService service) {
        this.service = service;
    }

    // Endpoint GET para obtener vuelos con filtros opcionales
    @GetMapping
    public List<VueloResponseDTO> getVuelos(
            @RequestParam(required = false) String empresa,
            @RequestParam(required = false) String lugarLlegada,
            @RequestParam(required = false)
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
            LocalDate fechaSalida
    ) {
        return service.obtenerVuelos(empresa, lugarLlegada, fechaSalida);
    }
}


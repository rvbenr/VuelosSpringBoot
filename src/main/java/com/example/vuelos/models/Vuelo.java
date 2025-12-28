package com.example.vuelos.models;

import java.time.LocalDate;

// Clase de dominio que representa un Vuelo
public class Vuelo {

    // Identificador único del vuelo
    private int id;

    // Código o nombre del vuelo
    private String nombreVuelo;

    // Aerolínea
    private String empresa;

    // Ciudad de salida
    private String lugarSalida;

    // Ciudad de llegada
    private String lugarLlegada;

    // Fecha de salida
    private LocalDate fechaSalida;

    // Fecha de llegada
    private LocalDate fechaLlegada;

    // Constructor vacío requerido por Jackson
    public Vuelo() {}

    // Constructor completo
    public Vuelo(int id, String nombreVuelo, String empresa,
                 String lugarSalida, String lugarLlegada,
                 LocalDate fechaSalida, LocalDate fechaLlegada) {
        this.id = id;
        this.nombreVuelo = nombreVuelo;
        this.empresa = empresa;
        this.lugarSalida = lugarSalida;
        this.lugarLlegada = lugarLlegada;
        this.fechaSalida = fechaSalida;
        this.fechaLlegada = fechaLlegada;
    }

    // Getters y setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombreVuelo() { return nombreVuelo; }
    public void setNombreVuelo(String nombreVuelo) { this.nombreVuelo = nombreVuelo; }

    public String getEmpresa() { return empresa; }
    public void setEmpresa(String empresa) { this.empresa = empresa; }

    public String getLugarSalida() { return lugarSalida; }
    public void setLugarSalida(String lugarSalida) { this.lugarSalida = lugarSalida; }

    public String getLugarLlegada() { return lugarLlegada; }
    public void setLugarLlegada(String lugarLlegada) { this.lugarLlegada = lugarLlegada; }

    public LocalDate getFechaSalida() { return fechaSalida; }
    public void setFechaSalida(LocalDate fechaSalida) { this.fechaSalida = fechaSalida; }

    public LocalDate getFechaLlegada() { return fechaLlegada; }
    public void setFechaLlegada(LocalDate fechaLlegada) { this.fechaLlegada = fechaLlegada; }
}


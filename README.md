# VuelosSpringBoot
# CRUD de Vuelos – Spring Boot

## Descripción
Este proyecto es una **API REST desarrollada con Spring Boot** que implementa un CRUD completo para gestionar vuelos.  
La aplicación **no utiliza base de datos**, sino una lista en memoria, con el objetivo de practicar la estructura de un proyecto Spring, el diseño de APIs REST y el manejo de fechas con `LocalDate`.



## Tecnologías utilizadas
- Java 21 (JDK 21)
- Spring Boot
- Maven
- API REST
- Postman (para pruebas)



## Estructura del proyecto
El proyecto está organizado siguiendo buenas prácticas:
com.example.vuelos
    controllers → Endpoints REST
    services → Lógica de negocio y filtros
    repositories → Gestión de datos en memoria
    models → Entidad Vuelo
    dtos → Objetos de transferencia de datos
    utils → Utilidades (manejo de fechas)



## Funcionalidades
- Obtener todos los vuelos ordenados por fecha de salida
- Filtrar vuelos por:
  - Aerolínea
  - Lugar de llegada
  - Fecha de salida
- Cálculo automático de la duración del vuelo en días
- Datos de ejemplo cargados al iniciar la aplicación (10 vuelos)



## Endpoints principales

- `GET /vuelos` → Devuelve todos los vuelos  
- `GET /vuelos?empresa=Iberia` → Filtra por aerolínea  
- `GET /vuelos?lugarLlegada=Tokyo` → Filtra por destino  
- `GET /vuelos?fechaSalida=2025-06-15` → Filtra por fecha  



## Ejecución
1. Ejecutar la clase `VuelosApplication`
2. Acceder a la API en: http://localhost:8080/vuelos



## Notas
- No se utiliza persistencia en base de datos
- Las respuestas se devuelven en formato JSON

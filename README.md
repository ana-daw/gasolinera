Thought for 1 second### Gasolinera API

## Descripción

Este proyecto Spring Boot implementa una API RESTful para gestionar un sistema de gasolinera. La API proporciona endpoints para administrar tanques de combustible, surtidores, productos y operaciones de suministro.

## Tecnologías

- Java 17
- Spring Boot
- Spring Data JPA
- API RESTful
- Maven


## Endpoints de la API

### Tanques

| Método | Endpoint | Descripción | Ejemplo de Cuerpo de Petición
|-----|-----|-----|-----
| GET | `/api/tanques` | Listar todos los tanques | -
| GET | `/api/tanques/{id}` | Obtener tanque por ID | -
| POST | `/api/tanques` | Crear un nuevo tanque | `json { "codigo": "21tfikadsng", "capacidad": 4000, "nivelActual": 0, "producto": { "id": 2 } }`
| DELETE | `/api/tanques/{id}` | Eliminar un tanque | -


### Surtidores

| Método | Endpoint | Descripción | Ejemplo de Cuerpo de Petición
|-----|-----|-----|-----
| GET | `/api/surtidores` | Listar todos los surtidores | -
| GET | `/api/surtidores/{id}` | Obtener surtidor por ID | -
| POST | `/api/surtidores` | Crear un nuevo surtidor | `json { "numero": 2, "activo": false }`
| DELETE | `/api/surtidores/{id}` | Eliminar un surtidor | -


### Productos

| Método | Endpoint | Descripción | Ejemplo de Cuerpo de Petición
|-----|-----|-----|-----
| GET | `/api/productos` | Listar todos los productos | -
| GET | `/api/productos/{id}` | Obtener producto por ID | -
| POST | `/api/productos` | Crear un nuevo producto | `json { "tipo": "Gasoleo B", "precio": 1.02 }`
| DELETE | `/api/productos/{id}` | Eliminar un producto | -


### Suministros

| Método | Endpoint | Descripción | Ejemplo de Cuerpo de Petición
|-----|-----|-----|-----
| GET | `/api/suministros` | Listar todos los suministros | -
| GET | `/api/suministros/{id}` | Obtener suministro por ID | -
| POST | `/api/suministros` | Crear un nuevo suministro | `json { "surtidor": { "id": 1 }, "producto": { "id": 1 }, "fecha": "2025-03-22T12:45:00", "volumen": 32 }`
| DELETE | `/api/suministros/{id}` | Eliminar un suministro | -


## Configuración e Instalación

1. Clonar el repositorio

```shellscript
git clone https://github.com/tuusuario/gasolinera-api.git
```


2. Navegar al directorio del proyecto

```shellscript
cd gasolinera-api
```


3. Construir el proyecto

```shellscript
mvn clean install
```


4. Ejecutar la aplicación

```shellscript
mvn spring-boot:run
```




## Uso

La API estará disponible en `http://localhost:8080`

Puedes utilizar herramientas como Postman para interactuar con los endpoints de la API como se muestra en la sección de endpoints.

## Licencia

[MIT](https://choosealicense.com/licenses/mit/)

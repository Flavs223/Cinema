# Cinema
## Sistema de gestión de cine – Java Core

Proyecto desarrollado en Java que modela el funcionamiento básico de un cine:

- Registro de clientes.
- Control de capacidad por sala.
- Cálculo de precios según el tipo de sala.
- Gestión de asientos.

El presente proyecto fue diseñado siguiendo principios de Programación Orientada a Objetos (POO),
con la intención de servir como base para una futura migración a **Spring Boot** (backend)
y una **UI Web** con **React**.

---

## Funciones principales

- Registro de clientes.
- Validación de capacidad por sala.
- Manejo de diferentes tipos de salas:
  - Sala Normal
  - Sala 4DX
  - Sala VIP (asiento reclinable o cama)
- Cálculo automático del total a pagar.
- Uso de **enum** para estados del registro y tipos de asiento.
- Separación entre lógica de negocio y capa de presentación (UI).

---

## Conceptos aplicados

- Programación Orientada a Objetos (POO)
  - Abstracción
  - Encapsulamiento
  - Herencia
  - Polimorfismo
- Clases abstractas
- **Enums** para estados y configuraciones fijas
- Early return para validaciones
- Inmutabilidad mediante el uso de `final`
- Diseño orientado a escalabilidad (preparado para API REST)

---

## Estructura del proyecto

El proyecto está desarrollado en Java utilizando **Swing** para la interfaz gráfica.
La estructura actual se organiza de la siguiente manera:
``` md
src/
├── Source Packages/
│ ├── peliculas_final/
│ │ ├── Alta_Clientes.java # Interfaz gráfica (Swing)
│ │ ├── Cine_service_registro.java # Lógica de negocio y validaciones
│ │ ├── Cliente.java # Modelo de cliente
│ │ ├── Sala.java # Clase abstracta de sala
│ │ ├── SalaNormal.java # Implementación sala normal
│ │ ├── Sala4DX.java # Implementación sala 4DX
│ │ ├── SalaVIP.java # Implementación sala VIP
│ │ ├── EstadoRegistro.java # Estados del registro (enum)
│ │ ├── TipoAsiento.java # Tipos de asiento VIP (enum)
│ │ └── Lentes_size.java # Tamaños de lentes 4DX (enum)
│ └── imgs/ # Recursos gráficos de la UI
│ ├── vip.png
│ ├── 4dx.png
│ └── normal.png
└── resources/ # Recursos adicionales
```

---

## Flujo básico del sistema

1. El cliente selecciona:
   - Película
   - Sala
   - Cantidad de boletos
   - (En VIP) tipo de asiento
   - (En 4DX) tamaño de lentes
2. El servicio valida:
   - Datos completos
   - Disponibilidad de asientos
   - Capacidad de la sala
3. Se registra la compra o se devuelve un estado de error.

---

## Tecnologías utilizadas

- Java 8
- Swing
- NetBeans
- Git / GitHub

---

## Próximos pasos (Roadmap)

- [ ] Migrar lógica de negocio a **Spring Boot**
- [ ] Exponer servicios REST (API)
- [ ] Crear frontend con **React**
- [ ] Persistencia en base de datos (MySQL / PostgreSQL)
- [ ] Autenticación básica

---

## Notas

Este proyecto es de carácter académico, pero fue diseñado aplicando buenas prácticas
utilizadas en entornos reales de desarrollo de software.

# PRUEBA_U2__GRUPO_3
## Integrantes
- Adrián Andaluz
- Paulo Escobar
- Mateo Salazar
- Ariel Chanatasig

**Carrera:** Ingeniería en Software  
**Universidad:** Universidad Técnica de Ambato
## 1. Análisis del Problema

### Entradas
- **N**: Cantidad de tickets a procesar (`int`)[cite: 1, 5]
- **placa**: Identificador del vehículo (`String`)[cite: 1, 5]
- **minutos**: Tiempo de permanencia (`int`, validación: `minutos > 0`)[cite: 1, 5]
- **tipoCliente**: Tipo de cliente (`int`: `1` = Regular, `2` = VIP, `3` = Abonado)[cite: 1, 5]

### Procesos
- Repetir para **N** tickets utilizando un ciclo `para` (`for`)[cite: 1, 5].
- Validar `minutos > 0` con un bucle `repetir-hasta` (`do-while`)[cite: 1, 5].
- Calcular tarifa mediante una estructura `según` (`switch`)[cite: 1, 5]:
  - **Opción 1 (Regular):** `tarifa = minutos * 0.05`[cite: 1, 5]
  - **Opción 2 (VIP):** `tarifa = minutos * 0.03`[cite: 1, 5]
  - **Opción 3 (Abonado):** `tarifa = 1.00`[cite: 1, 5]
- Acumular ingresos: `ingresoTotal = ingresoTotal + tarifa`[cite: 1, 5]
- Acumular minutos: `totalMinutos = totalMinutos + minutos`[cite: 1, 5]
- Evaluar menor tiempo: si `minutos < menorTiempo`, guardar `menorTiempo = minutos` y `placaMenor = placa`[cite: 1, 5]
- Calcular promedio: `promedio = totalMinutos / N`[cite: 1, 5]

### Salidas
- **Ingreso total recaudado** ($)[cite: 1, 5]
- **Promedio de permanencia** (minutos)[cite: 1, 5]
- **Placa con el menor tiempo de permanencia**[cite: 1, 5]

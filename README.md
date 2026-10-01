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
- **N**: Cantidad de tickets a procesar (`int`)
- **placa**: Identificador del vehículo (`String`)
- **minutos**: Tiempo de permanencia (`int`, validación: `minutos > 0`)
- **tipoCliente**: Tipo de cliente (`int`: `1` = Regular, `2` = VIP, `3` = Abonado)

### Procesos
- Repetir para **N** tickets utilizando un ciclo `para` (`for`)
- Validar `minutos > 0` con un bucle `repetir-hasta` (`do-while`)
- Calcular tarifa mediante una estructura `según` (`switch`)
  - **Opción 1 (Regular):** `tarifa = minutos * 0.05`
  - **Opción 2 (VIP):** `tarifa = minutos * 0.03`
  - **Opción 3 (Abonado):** `tarifa = 1.00`[cite: 1, 5]
- Acumular ingresos: `ingresoTotal = ingresoTotal + tarifa`
- Acumular minutos: `totalMinutos = totalMinutos + minutos`
- Evaluar menor tiempo: si `minutos < menorTiempo`, guardar `menorTiempo = minutos` y `placaMenor = placa`
- Calcular promedio: `promedio = totalMinutos / N`

### Salidas
- **Ingreso total recaudado** ($)
- **Promedio de permanencia** (minutos)
- **Placa con el menor tiempo de permanencia**

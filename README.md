# PRUEBA_U2__GRUPO_3
## Integrantes
- Adrián Andaluz
- Paulo Escobar
- Mateo Salazar
- Ariel Chanatasig

**Carrera:** Ingeniería en Software  
**Universidad:** Universidad Técnica de Ambato

---

## Ejercicio Asignado: GRUPO 3 - ParkControl: Estacionamiento
Desarrollo de un sistema en Java para el control de boletos de estacionamiento. El programa procesa $N$ tickets, valida que los minutos registrados sean mayores a 0 usando un bucle `do-while`, determina las tarifas a pagar mediante un `switch` condicional según el tipo de cliente, y calcula el ingreso total, el promedio de permanencia y el vehículo con menor tiempo registrado.

## Instrucciones para Compilar y Ejecutar
1. Abrir la terminal en la carpeta `ejercicio-3`.
2. Compilar el programa:
   ```bash
   javac Ejercicio3.java
---
## . Distribución de Aportes y Commits por Integrante

### Adrián Andaluz: Estrategia y Estructura Base
- **Aporte:** Creación del repositorio en GitHub, inicialización de la lectura de datos con `Scanner` y configuración del ciclo principal `for` para procesar $N$ tickets.
- **Commit:** `"Crea estructura base con Scanner e inicio de ciclo principal"`
- **Código implementado:**
```java
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== SISTEMA PARKCONTROL: ESTACIONAMIENTO ===");
        System.out.print("Ingrese la cantidad de tickets a procesar (N): ");
        int totalTickets = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= totalTickets; i++) {
            System.out.println("\n--- REGISTRO DEL TICKET #" + i + " ---");
            // Estructura lista para procesar los tickets
        }

        scanner.close();
    }
}
```
---
### Paulo Escobar : Validacion de Datos e Ingreso de Placa
* **Descripcion:** Desarrollo del ingreso de la placa del vehiculo e implementacion del bucle do-while para la validacion estricta del tiempo de permanencia (minutos > 0).
* **Commit:** `"Implementa lectura de placa y validacion de minutos con do-while"`

#### Codigo Implementado en Java:
```java
System.out.print("Ingrese la placa del vehiculo: ");
String placa = scanner.nextLine();

// Validacion de minutos (> 0) mediante do-while
int minutos = 0;
do {
    System.out.print("Ingrese los minutos de permanencia (debe ser > 0): ");
    minutos = scanner.nextInt();
    if (minutos <= 0) {
        System.out.println("Error! Los minutos deben ser mayores a 0. Intente de nuevo.");
    }
} while (minutos <= 0);
```
---
### Ariel Chanatasig : Menú de Clientes y Cálculo de Tarifas

* **Aporte:** Desarrollo del menú interactivo para la selección del tipo de cliente y cálculo de las tarifas aplicando una estructura condicional múltiple `switch`.
* **Commit:** `"Implementa menu de clientes y calculo de tarifas mediante switch"`

#### Código Implementado (Java)

```java
System.out.println("Seleccione el Tipo de Cliente:");
System.out.println("1. Regular ($0.05 por minuto)");
System.out.println("2. VIP ($0.03 por minuto)");
System.out.println("3. Abonado (Tarifa fija de $1.00)");
System.out.print("Opción (1-3): ");
int tipoCliente = scanner.nextInt();
scanner.nextLine();

// Estructura switch para tarifa
double tarifaPagar = 0.0;
switch (tipoCliente) {
    case 1:
        tarifaPagar = minutos * 0.05;
        break;
    case 2:
        tarifaPagar = minutos * 0.03;
        break;
    case 3:
        tarifaPagar = 1.00;
        break;
    default:
        System.out.println("Opción no válida. Aplicando tarifa Regular por defecto.");
        tarifaPagar = minutos * 0.05;
        break;
}

System.out.printf("Tarifa calculada para este ticket: $%.2f\n", tarifaPagar);
```
---
## Mateo Salazar: Métricas, Acumuladores y Reporte Final

### Aporte

Implementación de acumuladores para registrar el ingreso total y los minutos acumulados. También se implementó el contador de tickets, la búsqueda del menor tiempo de permanencia junto con la placa correspondiente, el cálculo del promedio y el despliegue del resumen final de resultados.

### Commit

`Agrega acumuladores, calculo de menor tiempo, promedio y resultados final`

### Código Implementado

```java
// Variables globales
double ingresoTotal = 0.0;
int totalMinutos = 0;
int cantidadTickets = 0;
int menorTiempo = Integer.MAX_VALUE;
String placaMenorTiempo = "";

// Dentro del ciclo for
ingresoTotal += tarifaPagar;
totalMinutos += minutos;
cantidadTickets++;

if (minutos < menorTiempo) {
    menorTiempo = minutos;
    placaMenorTiempo = placa;
}

// Salida al finalizar el bucle
System.out.println("\n================ RESUMEN DEL DÍA ================");
System.out.printf("Ingreso total recaudado: $%.2f\n", ingresoTotal);

if (cantidadTickets > 0) {
    double promedioPermanencia = (double) totalMinutos / cantidadTickets;

    System.out.printf(
        "Promedio de permanencia: %.2f minutos\n",
        promedioPermanencia
    );

    System.out.println(
        "Vehículo con menor tiempo: Placa " 
        + placaMenorTiempo + " (" 
        + menorTiempo + " minutos)"
    );
} else {
    System.out.println("No se registraron tickets.");
}
```
---

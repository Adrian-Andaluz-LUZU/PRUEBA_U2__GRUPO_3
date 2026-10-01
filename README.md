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

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
## 4. Distribución de Aportes y Commits por Integrante

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

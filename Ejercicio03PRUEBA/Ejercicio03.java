import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double ingresoTotal = 0.0;
        int totalMinutos = 0;
        int cantidadTickets = 0;
        int menorTiempo = Integer.MAX_VALUE;
        String placaMenorTiempo = "";

        System.out.println("=== SISTEMA PARKCONTROL: ESTACIONAMIENTO ===");
        System.out.print("Ingrese la cantidad de tickets a procesar (N): ");
        int totalTickets = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        for (int i = 1; i <= totalTickets; i++) {
            System.out.println("\n--- REGISTRO DEL TICKET #" + i + " ---");

            System.out.print("Ingrese la placa del vehículo: ");
            String placa = scanner.nextLine();

            // Validación de minutos (> 0) mediante do-while
            int minutos = 0;
            do {
                System.out.print("Ingrese los minutos de permanencia (debe ser > 0): ");
                minutos = scanner.nextInt();
                if (minutos <= 0) {
                    System.out.println("¡Error! Los minutos deben ser mayores a 0. Intente de nuevo.");
                }
            } while (minutos <= 0);

            System.out.println("Seleccione el Tipo de Cliente:");
            System.out.println("1. Regular ($0.05 por minuto)");
            System.out.println("2. VIP ($0.03 por minuto)");
            System.out.println("3. Abonado (Tarifa fija de $1.00)");
            System.out.print("Opción (1-3): ");
            int tipoCliente = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

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

            // Acumuladores y contadores
            ingresoTotal += tarifaPagar;
            totalMinutos += minutos;
            cantidadTickets++;

            // Mínimo
            if (minutos < menorTiempo) {
                menorTiempo = minutos;
                placaMenorTiempo = placa;
            }
        }

        // Mostrar resultados
        System.out.println("\n================ RESUMEN DEL DÍA ================");
        System.out.printf("Ingreso total recaudado: $%.2f\n", ingresoTotal);

        if (cantidadTickets > 0) {
            double promedioPermanencia = (double) totalMinutos / cantidadTickets;
            System.out.printf("Promedio de permanencia: %.2f minutos\n", promedioPermanencia);
            System.out.println("Vehículo con menor tiempo: Placa " + placaMenorTiempo + " (" + menorTiempo + " minutos)");
        } else {
            System.out.println("No se registraron tickets.");
        }

        scanner.close();
    }
}
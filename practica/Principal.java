/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        Empleado empleado = new Empleado("Kendra", "Rosario", "Republica Dominicana", 16, "809-098-9088", "Calle Juan 1");
        Cliente cliente = new Cliente("Kendall", "Baldayaque", "Republica Dominicana", 16, "809-098-9098", "Calle Juan 21");

    
            System.out.println("--Menú--");
            System.out.println("1. Solicitar permiso");
            System.out.println("2. Reportar horas extras");
            System.out.println("3. Contactar Representante");
            System.out.println("4. Solicitar Información");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            
            int opcion = scanner.nextInt();
            scanner.nextLine();  

            switch (opcion) {
                case 1:
                    empleado.solicitudPermiso();
                    break;

                case 2:
                    System.out.print("Ingrese la cantidad de horas extras: ");
                    int horasExtra = scanner.nextInt();
                    empleado.reporteHorasExtra(horasExtra);
                    break;

                case 3:
                    cliente.contactarRepresentante();
                    break;

                case 4:
                    cliente.solicitarInformacion();
                    break;

                case 5:
                    System.out.println("Saliendo del programa.");
                    

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
    }
}
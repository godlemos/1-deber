import java.util.Scanner;

public class tarea10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar = "si";

        while (continuar.equals("si")) {
            System.out.print("Ingrese un año: ");
            int anio = scanner.nextInt();

            // Verificar si el año es bisiesto
            if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
                System.out.println("Es bisiesto.");
            } else {
                System.out.println("No es bisiesto.");
            }

            System.out.print("¿Desea ingresar otro año? (si/no): ");
            continuar = scanner.next().toLowerCase();
        }

        System.out.println("Programa terminado.");
    }
}

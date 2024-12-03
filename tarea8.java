import java.util.Scanner;

public class tarea8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar = "si";

        while (continuar.equals("si")) {
            System.out.print("Ingrese su edad: ");
            int edad = scanner.nextInt();

            if (edad >= 0 && edad <= 12) {
                System.out.println("Eres niño.");
            } else if (edad >= 13 && edad <= 17) {
                System.out.println("Eres adolescente.");
            } else if (edad >= 18) {
                System.out.println("Eres adulto.");
            } else {
                System.out.println("Edad inválida.");
            }

            System.out.print("¿Desea ingresar otra edad? (si/no): ");
            continuar = scanner.next().toLowerCase();
        }

        System.out.println("Programa terminado.");
    }
}

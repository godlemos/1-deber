import java.util.Scanner;

public class tarea6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar = "si";

        while (continuar.equals("si")) {
            System.out.print("Ingrese su edad: ");
            int edad = scanner.nextInt();

            System.out.println(edad >= 18 ? "Puedes votar." : "No puedes votar.");

            System.out.print("¿Desea ingresar otra edad? (si/no): ");
            continuar = scanner.next().toLowerCase();
        }

        System.out.println("Programa terminado.");
    }
}

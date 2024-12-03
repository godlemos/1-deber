import java.util.Scanner;
import java.util.Random;

public class tarea12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String continuar = "si";

        while (continuar.equals("si")) {
            // Generar un número aleatorio entre 1 y 10
            int numeroAleatorio = random.nextInt(10) + 1;

            System.out.print("Adivina el número entre 1 y 10: ");
            int intento = scanner.nextInt();

            // Verificar si el usuario acertó
            if (intento == numeroAleatorio) {
                System.out.println("¡Felicidades, acertaste!");
            } else {
                System.out.println("Intenta de nuevo.");
            }

            System.out.print("¿Deseas jugar otra vez? (si/no): ");
            continuar = scanner.next().toLowerCase();
        }

        System.out.println("Programa terminado.");
    }
}

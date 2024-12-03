import java.util.Scanner;

public class tarea2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar = "si";

        while (continuar.equals("si")) {
            System.out.print("Ingrese un número: ");
            int numero = scanner.nextInt();

            System.out.println(numero > 0 ? "Es un número positivo." : (numero < 0 ? "Es un número negativo." : "Es cero."));

            System.out.print("¿Desea ingresar otro número? (si/no): ");
            continuar = scanner.next().toLowerCase();
        }

        System.out.println("Programa terminado.");
    }
}

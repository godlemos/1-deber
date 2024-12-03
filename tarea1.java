import java.util.Scanner;

public class tarea1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar;

        do {
            System.out.print("Ingrese un número: ");
            int numero = scanner.nextInt();
            System.out.println(numero > 10 ? "Es mayor que 10." : (numero < 10 ? "Es menor que 10." : "Es igual a 10."));

            System.out.print("¿Desea ingresar otro número? (si/no): ");
            continuar = scanner.next().toLowerCase();
        } while (continuar.equals("si"));

        System.out.println("Programa terminado.");
    }
}

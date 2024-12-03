import java.util.Scanner;

public class tarea5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar = "si";

        while (continuar.equals("si")) {
            System.out.print("Ingrese el monto total de la compra: $");
            double monto = scanner.nextDouble();

            double montoFinal = monto > 100 ? monto * 0.8 : monto;
            System.out.printf("Monto final: $%.2f%n", montoFinal);

            System.out.print("¿Desea ingresar otro monto? (si/no): ");
            continuar = scanner.next().toLowerCase();
        }

        System.out.println("Programa terminado.");
    }
}

import java.util.Scanner;

public class tarea4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar = "si";

        while (continuar.equals("si")) {
            System.out.print("Ingrese la calificación del estudiante: ");
            double calificacion = scanner.nextDouble();

            System.out.println(calificacion >= 7 ? "Aprobado." : "Reprobado.");

            System.out.print("¿Desea ingresar otra calificación? (si/no): ");
            continuar = scanner.next().toLowerCase();
        }

        System.out.println("Programa terminado.");
    }
}

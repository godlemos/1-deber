import java.util.Scanner;

public class tarea14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar = "si";

        while (continuar.equals("si")) {
            System.out.print("Ingrese la calificación numérica: ");
            int calificacion = scanner.nextInt();

            String letraCalificacion = "";

            // Determinar la letra correspondiente
            if (calificacion >= 90 && calificacion <= 100) {
                letraCalificacion = "A";
            } else if (calificacion >= 80 && calificacion <= 89) {
                letraCalificacion = "B";
            } else if (calificacion >= 70 && calificacion <= 79) {
                letraCalificacion = "C";
            } else if (calificacion >= 60 && calificacion <= 69) {
                letraCalificacion = "D";
            } else if (calificacion < 60) {
                letraCalificacion = "F";
            } else {
                System.out.println("Calificación fuera de rango.");
                continue; // Salta la iteración si la calificación no es válida
            }

            System.out.println("Tu calificación es " + letraCalificacion + ".");

            System.out.print("¿Deseas ingresar otra calificación? (si/no): ");
            continuar = scanner.next().toLowerCase();
        }

        System.out.println("Programa terminado.");
    }
}

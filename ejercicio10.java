import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int suma = 0;
        int contador = 0;
        double promedio;

        System.out.println("Ingresa las calificaciones (ingresa -1 para terminar):");
        while (true) {
            System.out.print("Calificación: ");
            int calificacion = scanner.nextInt();
            if (calificacion == -1) {
                break;
            }
            suma += calificacion;
            contador++;
        }

        if (contador > 0) {
            promedio = (double) suma / contador;
            System.out.printf("El promedio es: %.2f\n", promedio);
        } else {
            System.out.println("No se ingresaron calificaciones.");
        }
    }
}

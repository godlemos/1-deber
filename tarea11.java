import java.util.Scanner;

public class tarea11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar = "si";

        while (continuar.equals("si")) {
            // Contraseña fija que se considera válida
            String contrasenaCorrecta = "00000";

            System.out.print("Ingrese su contraseña: ");
            String contrasena = scanner.nextLine();

            // Validación de la contraseña
            if (contrasena.equals(contrasenaCorrecta)) {
                System.out.println("Acceso concedido.");
            } else {
                System.out.println("Contraseña incorrecta.");
            }

            System.out.print("¿Desea intentar otra vez? (si/no): ");
            continuar = scanner.next().toLowerCase();
            scanner.nextLine();  // Limpiar el buffer del scanner
        }

        System.out.println("Programa terminado.");
    }
}


import java.util.Scanner;

public class tarea15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Credenciales correctas
        String usuarioCorrecto = "admin";
        String contrasenaCorrecta = "1234";

        int intentos = 0;
        String continuar = "si";

        while (continuar.equals("si") && intentos < 3) {
            System.out.print("Ingrese el nombre de usuario: ");
            String usuario = scanner.nextLine();

            System.out.print("Ingrese la contraseña: ");
            String contrasena = scanner.nextLine();

            // Validar si el nombre de usuario y la contraseña son correctos
            if (usuario.equals(usuarioCorrecto) && contrasena.equals(contrasenaCorrecta)) {
                System.out.println("Bienvenido, " + usuario + ".");
                break;
            } else {
                intentos++;
                if (intentos < 3) {
                    System.out.println("Usuario o contraseña incorrectos. Te quedan " + (3 - intentos) + " intento(s).");
                } else {
                    System.out.println("Acceso bloqueado. Has superado el número máximo de intentos.");
                }
            }

            // Opción de continuar después de un intento fallido
            if (intentos < 3) {
                System.out.print("¿Deseas intentar nuevamente? (si/no): ");
                continuar = scanner.next().toLowerCase();
                scanner.nextLine(); // Limpiar buffer
            }
        }

        System.out.println("Programa terminado.");
    }
}

import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        int suma = 0;
        while (numero != 0) {
            suma += numero % 10;
            numero /= 10;
        }

        System.out.println("La suma de los dígitos es: " + suma);
    }
}


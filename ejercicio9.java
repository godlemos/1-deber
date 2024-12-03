import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        int invertido = 0;
        while (numero != 0) {
            invertido = invertido * 10 + (numero % 10);
            numero /= 10;
        }

        System.out.println("El número invertido es: " + invertido);
    }
}

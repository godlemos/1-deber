import java.util.Scanner;

public class bucle3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número para mostrar su tabla de multiplicar: ");
        int numero = scanner.nextInt();

        // Tabla de multiplicar del 1 al 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}

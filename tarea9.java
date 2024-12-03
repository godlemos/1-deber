import java.util.Scanner;

public class tarea9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar = "si";

        while (continuar.equals("si")) {
            System.out.print("Ingrese el primer número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Ingrese el segundo número: ");
            double num2 = scanner.nextDouble();

            System.out.print("Ingrese la operación (+, -, *, /): ");
            char operacion = scanner.next().charAt(0);

            double resultado = 0;

            switch (operacion) {
                case '+':
                    resultado = num1 + num2;
                    break;
                case '-':
                    resultado = num1 - num2;
                    break;
                case '*':
                    resultado = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        resultado = num1 / num2;
                    } else {
                        System.out.println("No se puede dividir entre cero.");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Operación no válida.");
                    continue;
            }

            System.out.println("Resultado: " + resultado);

            System.out.print("¿Desea realizar otro cálculo? (si/no): ");
            continuar = scanner.next().toLowerCase();
        }

        System.out.println("Programa terminado.");
    }
}


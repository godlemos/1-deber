public class ejercicio7 {
    public static void main(String[] args) {
        // Encontrar números primos entre 1 y 50
        System.out.print("Números primos entre 1 y 50: ");
        for (int i = 2; i <= 50; i++) {
            boolean esPrimo = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                System.out.print(i + " ");
            }
        }
    }
}

import java.util.Scanner;

public class tarea13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar = "si";

        while (continuar.equals("si")) {
            System.out.print("Ingrese el día de nacimiento: ");
            int dia = scanner.nextInt();

            System.out.print("Ingrese el mes de nacimiento: ");
            String mes = scanner.next().toLowerCase();

            String signo = "";

            // Determinación del signo zodiacal
            if ((mes.equals("enero") && dia >= 20) || (mes.equals("febrero") && dia <= 18)) {
                signo = "Acuario";
            } else if ((mes.equals("febrero") && dia >= 19) || (mes.equals("marzo") && dia <= 20)) {
                signo = "Piscis";
            } else if ((mes.equals("marzo") && dia >= 21) || (mes.equals("abril") && dia <= 19)) {
                signo = "Aries";
            } else if ((mes.equals("abril") && dia >= 20) || (mes.equals("mayo") && dia <= 20)) {
                signo = "Tauro";
            } else if ((mes.equals("mayo") && dia >= 21) || (mes.equals("junio") && dia <= 20)) {
                signo = "Géminis";
            } else if ((mes.equals("junio") && dia >= 21) || (mes.equals("julio") && dia <= 22)) {
                signo = "Cáncer";
            } else if ((mes.equals("julio") && dia >= 23) || (mes.equals("agosto") && dia <= 22)) {
                signo = "Leo";
            } else if ((mes.equals("agosto") && dia >= 23) || (mes.equals("septiembre") && dia <= 22)) {
                signo = "Virgo";
            } else if ((mes.equals("septiembre") && dia >= 23) || (mes.equals("octubre") && dia <= 22)) {
                signo = "Libra";
            } else if ((mes.equals("octubre") && dia >= 23) || (mes.equals("noviembre") && dia <= 21)) {
                signo = "Escorpio";
            } else if ((mes.equals("noviembre") && dia >= 22) || (mes.equals("diciembre") && dia <= 21)) {
                signo = "Sagitario";
            } else if ((mes.equals("diciembre") && dia >= 22) || (mes.equals("enero") && dia <= 19)) {
                signo = "Capricornio";
            }

            System.out.println("Tu signo es " + signo + ".");

            System.out.print("¿Deseas ingresar otra fecha de nacimiento? (si/no): ");
            continuar = scanner.next().toLowerCase();
        }

        System.out.println("Programa terminado.");
    }
}

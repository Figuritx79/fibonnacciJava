import java.util.Scanner;

public class App {
    private static Scanner scanner = new Scanner(System.in);
    private static long number;

    public static void main(String[] args) {
        long numeroFibonnaci = pedirNumero();
        fibonnacci(numeroFibonnaci);

    }

    private static long pedirNumero() {
        try {
            System.out.println("Ingrese un numero: ");
            number = scanner.nextLong();
        } catch (Exception e) {
            System.out.println("EL DATO INGRESADO NO ES VALIDO, VOLVER A INGRESAR");
            // Se limpia el buffer
            scanner.nextLine();
            pedirNumero();
        }
        scanner.close();
        return number;
    }

    private static void fibonnacci(long numero) {
        long numeroAnterio = 0;
        long ultimoNumero = 0;
        long fibonnacci = 1;
        for (int i = 1; i <= numero; i++) {
            numeroAnterio = ultimoNumero;
            ultimoNumero = fibonnacci;
            fibonnacci = numeroAnterio + ultimoNumero;

            System.out.println((fibonnacci < numero) ? fibonnacci : "");

            if (fibonnacci == numero) {
                System.out.println("El numero " + numero + " pertenece a la serie de fibonnacci");
                break;
            }
            if (fibonnacci > numero) {
                System.out.println(
                        "El numero " + numero + " no pertenece a la serie de fibonnacci. Ya que el siguiente numero es "
                                + (numeroAnterio + ultimoNumero));
                break;
            }
        }

    }
}
import java.util.Scanner;
public class PositivoNegativoNeutro {
    public static void main (String args[]) {
        Scanner scanner = new Scanner (System.in);
        double numero;
        System.out.print("Coloque um numero: ");
        numero = scanner.nextDouble();
        if (numero > 0) {
            System.out.println(numero + " é positivo");
        }
        else if (numero == 0) {
            System.out.println(numero + " é neutro");
        }
        else {
            System.out.println(numero + " é negativo");
        }
        scanner.close();
    }
}
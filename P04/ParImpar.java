import java.util.Scanner;
public class ParImpar {
    public static void main (String args []) {
        Scanner scanner = new Scanner (System.in);
        int numero;
        System.out.print("Digite seu numero: ");
        numero = scanner.nextInt();
        if (numero % 2 == 0) {
            System.out.println(numero + " é par");
        }
        else {
            System.out.println(numero + " é impar");
        }
        scanner.close();
    }
}
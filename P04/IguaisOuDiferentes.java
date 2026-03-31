//Ler 2 números e dizer se são iguais ou diferentes
import java.util.Scanner;
public class IguaisOuDiferentes {
    public static void main (String args []) {
        Scanner scanner = new Scanner (System.in);
        double numeroUm, numeroDois;
        System.out.print("Digite o primeiro numero: ");
        numeroUm = scanner.nextDouble();
        System.out.print("Digite o segundo numero: ");
        numeroDois = scanner.nextDouble();
        if (numeroUm == numeroDois) {
            System.out.println("Os dois numeros são iguais");
        }
        else {
            System.out.println("os dois numero são diferentes");
        }
        scanner.close();

    }
}
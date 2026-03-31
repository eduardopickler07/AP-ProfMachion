import java.util.Scanner;
public class IgualMaiorMenor {
    public static void main (String args []) {
        Scanner scanner = new Scanner (System.in);
        double numeroUm, numeroDois;
        System.out.print("Digite o primeiro numero: ");
        numeroUm = scanner.nextDouble();
        System.out.print("Digite o segundo numero: ");
        numeroDois = scanner.nextDouble();
        if (numeroUm > numeroDois) {
            System.out.println(numeroUm + " é maior do que o " + numeroDois);
        }
        else if (numeroUm == numeroDois) {
            System.out.println("os dois numeros são iguais");
        }
        else {
            System.out.println(numeroDois + " é maior do que " + numeroUm);
        }
        scanner.close();
    }
}
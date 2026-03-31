import java.util.Scanner;
public class Teste {
    public static void main (String args []) {
        Scanner scanner = new Scanner (System.in);
        double valor, prazo;
        boolean selecao = ;
        System.out.print("Digite o valor do produto: ");
        valor = scanner.nextDouble();
        prazo = valor * 1.1;
        System.out.print("Digite o metodo de pagamento: 1 para á vista e 2 para á prazo: ");
        selecao = scanner.nextInt();
        if (selecao == 1) {
            System.out.println("O valor a pagar é: " + valor );
        }
        else if (selecao == 2) {
            System.out.println("O valor a pagar é: " + prazo);
        }
        scanner.close();
    }
}
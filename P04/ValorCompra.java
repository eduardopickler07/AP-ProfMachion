/*Exercicio: Ler um valor de compra e uma opção de pagamento:
1)a vista
2)a prazo
Se o pagamento for a prazo, calcular um acrésimo de 10%
Em abos os casos, mostrar o valor a pagar. */
import java.util.Scanner;
public class ValorCompra {
    public static void main (String args []) {
        Scanner scanner = new Scanner (System.in);
        double valor;
        double selecao;
        System.out.print("Digite o valor do produto: ");
        valor = scanner.nextDouble();
        System.out.print("digite:\n1 - a vista\n2 - a prazo\n--> ");
        selecao = scanner.nextInt();
        if (selecao == 2) {
            valor = valor * 1.1;
        }
        System.out.printf("valor a pagar = R$ %.2f\n", valor);
        scanner.close();
    }
}
/*ler o valor da compra e a opção de pagamento (1 - vista/2 - prazo)
se for a Vista, ler forma de pagamento (1 - Pix/2 - débito)
no Pix, dar 10% de desconto, no débito, 5%
se for a Prazo, ler número de parcelas (2/3)
para 2 parcelas, não tem acréscimo, para 3, 10%
Em todos o casos, exibir todos os valores*/

import java.util.Scanner;
public class Shopping {
    public static void main (String args []) {
        Scanner scanner = new Scanner(System.in);
        double valorCompra, pix, debito, parcela1, parcela2;
        System.out.print("Insira o valor da compra: ");
        valorCompra = scanner.nextDouble();
        System.out.print("Digite:\n1 - a vista\n2 - a prazo\n---> ");
        int opcaoPagamento = scanner.nextInt();

        if (opcaoPagamento == 1) { //Pagamento a vista
            System.out.print ("Digite:\n1 - Pix\n2 - debito\n---> ");
            int formaPagamento = scanner.nextInt();
            if (formaPagamento == 1) { //PIX
                double desconto = 10.0/100 * valorCompra;
                double valorFinal = valorCompra - desconto;
                System.out.printf ("Desconto = R$ %.2f\n", desconto);
                System.out.printf ("Valor a pagar = R$ %.2f\n", valorFinal);
            }
            else if (formaPagamento == 2) { //Débito
                double desconto = 5.0/100 * valorCompra;
                double valorFinal = valorCompra - desconto;
                System.out.printf ("Desconto = R$ %.2f\n", desconto);
                System.out.printf ("Valor a pagar = R$ %.2f\n", valorFinal);
            }
            else {
                System.out.println ("Forma de pagamento invalida!");
            }
        }

        else if (opcaoPagamento == 2) { //Pagamento a prazo
            System.out.println("Escolha o numero de parcelas (2/3: ");
            int parcelas = scanner.nextInt();
            if (parcelas == 2) {
                //double valorParcela = valorCompra / 2;
                System.out.printf ("Valor de cada parcela = R$ %.2f\n ", valorCompra/2);
                System.out.printf ("Valor a pagar = R$ %.2f\n", valorCompra);
            }

            else if (parcelas == 3) {
                //double valorParcela = valorCompra / 3;
                double acrescimo = 5.0/100 * valorCompra;
                double valorFinal = valorCompra + acrescimo;
                double valorParcela = valorFinal / 3;
                System.out.printf ("Você teve um acrescimo de R$ %.2f\n", acrescimo);
                System.out.printf ("Valor de cada parcela = R$ %.2f\n", valorParcela);
                System.out.printf ("Valor a pagar = R$ %.2f\n", valorFinal);
            }

            else {
                System.out.println ("Numero de parcelas invalido!");
            }
        }

        else {
            System.out.println ("Opção invalida!");
        }
        scanner.close();
    }   
}
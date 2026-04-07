//ler o nome de um produto e exibir seu preço
import java.util.Scanner;
public class Produtos {
    public static void main (String args []) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Escolha o seu produto:\nnotebook\nmonitor\nteclado\nmouse");
        String produto = scanner.nextLine().toLowerCase();
        double preco;
        switch (produto) {
            case "notebook":
                preco = 2000;
                break;
            case "monitor":
                preco = 700;
                break;
            case "teclado":
                preco = 120;
                break;
            case "mouse":
                preco = 38;
                break;
            default:
                preco = -1;
        }
        if(preco == -1) {
            System.out.println("Produto inexistente");
        }
        else {
            System.out.printf("Preço do %s: R$ %.2f\n", produto, preco);
        }
        scanner.close();
    }
}
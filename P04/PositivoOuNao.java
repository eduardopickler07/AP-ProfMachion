//Ler um número, dizer se ele é positivo ou não
import java.util.Scanner;
public class PositivoOuNao {
    public static void main (String args[]) {
        //processamento
        Scanner scanner = new Scanner (System.in);
        double numero;
        //entrada de dados
        System.out.print("Digite um numero: ");
        numero = scanner.nextDouble();
        //estrutura de decisão
            if (numero > 0) {
                System.out.println(numero + " é positivo");
            } 
            else {
                System.out.println(numero + " não é positivo");
            }
        scanner.close();
    }
}
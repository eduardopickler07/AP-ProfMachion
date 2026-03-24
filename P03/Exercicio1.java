//Ler uma distancia em km, converter para milhas e exibir o resultado.
import java.util.Scanner;
public class Exercicio1 {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        double milhas, km;
        System.out.print("Digite a distancia em kilometros: ");
        km = scanner.nextDouble();
        milhas = km / 1.61;
        System.out.printf("%.2f Km correspondem a %.2f milha\n", km, milhas);
        scanner.close();
    }
}
/*Ler a quantidade n de valores, depois ler n valores, calcular e mostrar sua media*/
import java.util.Scanner;
public class MediaNValores {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.print("digite a quantidade de valores: ");
        int n = sc.nextInt();
        // modo 1: sem vetores
        int soma = 0, cont = 1;
        for (cont = 1; cont <=n; cont++) {
            System.out.print("Digite o " + cont + "\u00B0 valor: ");
            int valor = sc.nextInt();
            soma = soma + valor;
        }
        double media = (double)soma / n;
        System.out.printf("media = %.2f", media);
        // modo 2: com vetor
        int[] v = new int[n];

        for (cont=0, soma=0; cont < n; cont++) {
            System.out.print("\ndigite o " + (cont+1) + "\u00B0 valor: ");
            v[cont] = sc.nextInt();
            soma += v[cont];
        }
        media = (double) soma / n;
        System.out.println("\nsua lista: ");
        for (int i=0; i<n; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.printf("\nmedia = %.2f", media);
        sc.close();
    }
}
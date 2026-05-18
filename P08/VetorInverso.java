//Ler o tamanho da lista, instanciar um vetor, pedir para o usuário digitar os valores e exibi-los na ordem inversa

import java.util.Scanner;
public class VetorInverso {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("digite o tamanho do vetor: ");
        int tamanho = sc.nextInt();
        int[] v = new int[tamanho];
        for (int i=0; i<tamanho; i++) {
            System.out.print("digite o " + (i + 1) + "\u00B0 valor: ");
            v[i] = sc.nextInt();
        }
        System.out.println("\nVetor invertido: ");
        for (int i = v.length-1; i >=0; i--) {
            System.out.print(v[i] + " ");
        }

        sc.close();
    }
}
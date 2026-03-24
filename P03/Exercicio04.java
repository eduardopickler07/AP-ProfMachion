//Ler um numero inteiro e imprimir a soma do sucessor do triplo com o antecessor de seu dobro.

import java.util.Scanner;
public class Exercicio04 {
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        int numero, soma;
        System.out.print("Digite o numero: ");
        numero = scanner.nextInt();
        soma = (2 * numero - 1) + (3 * numero + 1);
        System.out.println("Aqui está a soma do sucessor do triplo com o antecessor de seu dobro: " + soma);
        scanner.close();
    }
}

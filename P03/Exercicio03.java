//Ler 3 notas, calcular a média aritmética e exibir o resultado.
import java.util.Scanner;
public class Exercicio03 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        double notaUm, notaDois, notaTres, media;
        System.out.print("Insira a primeira nota: ");
        notaUm = scanner.nextDouble();
        System.out.print("Insira a segunda nota: ");
        notaDois = scanner.nextDouble();
        System.out.print("Insira a terceira nota: ");
        notaTres = scanner.nextDouble();
        media = (notaUm + notaDois + notaTres) / 3;
        System.out.println("A media aritmetica vai dessas notas é: " + media);
        scanner.close();
    }
}

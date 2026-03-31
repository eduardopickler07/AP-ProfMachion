import java.util.Scanner;
public class Notas {
    public static void main (String args[]) {
        Scanner scanner = new Scanner (System.in);
        double nota1, nota2, nota3, media;
        System.out.print("Insira a primeira nota: ");
        nota1 = scanner.nextDouble();
        System.out.print("Insira a segunda nota: ");
        nota2 = scanner.nextDouble();
        System.out.print("Insira a terceira nota: ");
        nota3 = scanner.nextDouble();
        media = (nota1 + nota2 + nota3) / 3;
        System.out.printf("Sua média é: %.1f\n ", media);
        if (media >= 7) {
            System.out.print("Está aprovado!");
        }
        else if (media >= 3) {
            System.out.print("Está de exame!");
        }
        else {
            System.out.print("Está reprovado!");
        }
        scanner.close();
    }
}
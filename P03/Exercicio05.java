//Sejam a e b os catetos de um triângulo, onde a hipotenusa é obtida pela equação: h = raiz²(a² + b²). Ler os valores de a e b, calcular a hipotenusa e mostrar o resultado.
import java.util.Scanner;
public class Exercicio05 {
    public static void main (String args []) {
        Scanner scanner = new Scanner (System.in);
        double a, b, h;
        System.out.print("Insira o cateto a: ");
        a = scanner.nextDouble();
        System.out.print("Insira o cateto b: ");
        b = scanner.nextDouble();
        h = Math.sqrt (Math.pow(a, 2) + Math.pow(b, 2));
        System.out.printf("Este é a hipotenusa do seu triangulo: %.2f\n", h);
        scanner.close();
    } 
}

//Ler um angulo em graus e apresenta-lo convertido em radianos. A fórmula de conversão é R = G * PI/180, sendo G, o angulo em graus e R em radianos, usar a constante Math.PI. 
import java.util.Scanner;
public class Exercicio02 {
    public static void main (String[] args){
    Scanner scanner = new Scanner (System.in);
    //declarar variaveis
    double radianos, graus;
    //Entrada de dados
    System.out.print ("Digite o angulo em graus: ");
    graus = scanner.nextDouble();
    //Processamento
    radianos = graus * Math.PI / 180;
    //Saida de dados
    System.out.println (graus + "\u00B0 = " + radianos + " rad");
    System.out.printf ("%.2f\u00B0 = %.3f rad\n", graus, radianos);
    //fechar scanner
    scanner.close();
    }
}
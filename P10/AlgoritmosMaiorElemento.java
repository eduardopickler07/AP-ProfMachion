import java.util.Random;
public class AlgoritmosMaiorElemento {
    public static void main (String[] args) {
        Random random = new Random();
        int i, j;
        //Parte 1 - o maior em um vetor:
        System.out.println("\n-------Vetor--------\n");
        int[] vInt = new int[12];
        for (i=0; i<12; i++) {
            vInt[i] = random.nextInt(100); //valores de 0 a 99
            System.out.print(vInt[i] + " ");
        }
        int maiorValor = vInt[0];
        int posicaoMaior = 0;
        for (i=1; i<12; i++) {
            if (vInt[i] > maiorValor) {
                maiorValor = vInt[i];
                posicaoMaior = i;
            }
        }
        System.out.println("\nO maior valor: " + maiorValor);
        System.out.println("Posicao: " + (posicaoMaior+1));
        //Parte 2: o maior em uma matriz bidimensional
        System.out.println("\n---------Matriz---------\n");
        int[][] matriz = new int[10][10];
        for (i=0; i<matriz.length; i++) {
            for (j=0; j<matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(100);
            }
            System.out.println();
        }
        int maiorMatriz = matriz[0][0];
        int maiorLinha = 0;
        int maiorColuna = 0;
        for (i=0; i<matriz.length; i++) {
            for (j=0; j<matriz[i].length; j++) {
                if (matriz[i][j] > maiorMatriz) {
                    maiorMatriz = matriz[i][j];
                    maiorLinha = i;
                    maiorColuna = j;
                }
            }
        }
        System.out.println("maior: " + maiorMatriz);
        System.out.println("Linha: " + (maiorLinha+1));
        System.out.println("Coluna: " + (maiorColuna+1));
        //Parte 3: maior de cada linha
        int[] maiorDeCadaLinha = new int[matriz.length];
        for (i=0; i<matriz.length; i++) {
            maiorDeCadaLinha[i] = matriz[i][0];
            for (j=1;j<matriz[i].length; j++) {
                if (matriz[i][j] > maiorDeCadaLinha[i]) {
                    maiorDeCadaLinha[i] = matriz[i][j];
                }
            }
        }
        System.out.println("A matriz e o maior de cada linha:");
        for (i=0; i < maiorDeCadaLinha.length; i++) {
            for (j=0; j<matriz[i].length; j++) {
                System.out.printf ("%2d ", matriz[i][j]);
            }
            System.out.println("             " + maiorDeCadaLinha[i]);
        }
    }
}
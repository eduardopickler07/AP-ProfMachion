public class Matriz1 {
    public static void main (String[] args) {
        String[][] matriz = new String[3][4];
        for (int i=0; i<3; i++) {
            for (int j=0; j<4; j++) {
                matriz[i][j] = "m" + i + j;
            }
        }
        for (int i=0; i<3; i++) {
            for (int j=0; j<4; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();

        }
    }
} 
public class Carrinho {
    public static void main (String args []){
        int[] id = {1,2,3,4};
        String[] nome = {"Produto 1", "Produto 2", "Produto 3", "Produto 4"};
        double[] preco = {39.90, 29.90, 49.90, 49.90};
        int quantidade[] = {1, 2, 4, 6};

//Parte do Carrinho
        boolean vazio = true;

        System.out.println("===================== Carrinho =====================\n");
//Verifica se o carrinho tem algum produto
        for (int i = 0; i < id.length; i++){
            if (quantidade[i] > 0){
                vazio = false;
            }
        }

//Se estiver vazio:
        if (vazio) {
            System.out.println("Seu carrinho está vazio!");
        }

//Se o carrinho tiver produtos
        else {
            for (int i = 0; i < id.length; i++){
                if (quantidade[i] > 0) {
                System.out.printf("ID: %d | %s | Preço: R$ %.2f  | Quantidade: %d\n", id[i], nome[i], preco[i], quantidade[i]);
                }
            }
        }
    }
}
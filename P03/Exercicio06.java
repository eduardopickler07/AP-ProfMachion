//A importancia de R$780.000 será dividida entre tres ganhadores de um concurso. Sendo que da quantia total: O primeiro ganhador receberá 46%, o segundo receberá 32%, o terceiro receberá o restante. Calcule e imprima a quantia ganha por cada um dos ganhadores.
public class Exercicio06 {
    public static void main (String args []){
        double primeiroGanhador, segundoGanhador, terceiroGanhador;
        primeiroGanhador = 780000 * 0.46;
        segundoGanhador = 780000 * 0.32;
        terceiroGanhador = 780000 * 0.22;
        System.out.printf("O primeiro ganhador irá receber: R$%.2f. o segundo ganhador vai ganhar: R$%.2f e o terceiro ganhador vai ganhar: R$%.2f", primeiroGanhador, segundoGanhador, terceiroGanhador);
    }
}

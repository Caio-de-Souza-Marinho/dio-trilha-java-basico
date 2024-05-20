import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        /*
         * Joaozinho recebeu R$50,00 de mesada e foi em uma loja de doces gastar todo o
         * seu dinheiro,
         * logo, enquanto o valor dos doces não igualar a R$50,00 ele foi adicionando
         * itens no carrinho.
         */

        double mesada = 50.0;
        int quantidadeDoces = 0;
        while (mesada > 0) {
            Double valorDoce = valorAleatorio();
            if (valorDoce > mesada) {
                valorDoce = mesada;
            }
            System.out.println("Doce com valor: " + valorDoce + " adicionado ao carrinho");
            mesada = mesada - valorDoce;
            quantidadeDoces++;
        }
        System.out.println("Mesada: " + mesada);
        System.out.println("Joãozinho gastou toda sua mesada e comprou " + quantidadeDoces + " doces");
    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextInt(1, 10);
    }
}
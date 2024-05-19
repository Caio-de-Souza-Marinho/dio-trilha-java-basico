public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 1.0;

        // Condição simples
        // if(valorSolicitado < saldo) {
        // saldo = saldo - valorSolicitado;
        // }

        // Condição composta
        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println("Saque de R$" + valorSolicitado + " efetuado com sucesso!");
            System.out.println("Seu saldo atualizado é R$" + saldo);
        } else {
            System.out.println("ERRO! Saldo insuficiente");
            System.out.println("Você possui R$" + saldo + " na conta.");
        }
    }
}
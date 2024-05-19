public class ResultadoEscolar {
    public static void main(String[] args) {
        // Condição composta
        // int nota = 6;
        // if (nota >= 7) {
        // System.out.println("Aprovado");
        // } else {
        // System.out.println("Reprovado");
        // }

        // Condição encadeata
        // int nota = 6;
    //     if (nota >= 7) {
    //         System.out.println("Aprovado");
    //     } else if (nota >= 5 && nota < 7) {
    //         System.out.println("Recuperação");
    //     } else {
    //         System.out.println("Reprovado");
    //     }
        
        //Operador ternário
        int nota = 3;
        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";

        System.out.println(resultado);
    }
}
public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        // for (int x = 0; x < alunos.length; x++) {
        // System.out.println("O aluno do índice x = " + x + " é " + alunos[x]);
        // }

        // Usando For
        for (String aluno : alunos) {
            System.out.println("O nome do aluno é: " + aluno);
        }
    }
}
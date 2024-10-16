package estudosdois;

public class ExemploForArray {
    public static void main(String[] args) {
        //em arrays o índice inicia em 0 (int x = 0)
        String alunos[] = {"Felipe", "Jonas", "Julia", "Marcos"};

        //forma resumida de um for com array
        for(String aluno : alunos){
            System.out.println("O nome do aluno é: " + aluno);
        }

        /* 
        //length é um atributo de tamanho, então lê-se "enquanto x for menor que a quantidade de alunos"
        for (int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno no índice x = " + x + ", é " + alunos[x] + "!");
        }
        */
    }
}

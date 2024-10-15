package estudosdois;

public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 6;

        //condição ternária
        /* 
        String resultado = nota >= 7 ? "Aprovado!" : "Reprovado!";
        System.out.println(resultado);
        */

        //condição ternária com implementação de condicional encadeada
        String resultado = nota >= 7 ? "Aprovado!" : nota >= 5 && nota <7 ? "Recuperação!" : "Reprovado!";
        System.out.println(resultado);

        /*
        if (nota >= 7)//condicional simples
            System.out.println("Aprovado!");

        //condicional encadeada
        else if (nota >= 5 && nota < 7) 
            System.out.println("Recuperação!");
           
        else //condicional composta
            System.out.println("Reprovado!");
        */
    }
}

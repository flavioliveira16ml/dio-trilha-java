public class Relacionais {
    public static void main(String[] args) {
        String nomeUm = "Flavio";
        String nomeDois = "Flavio";

        System.out.println(nomeUm == nomeDois);
        

        String nomeTres = "flavio";
        String nomeQuatro = "flavio";
        
        System.out.println(nomeTres.equals(nomeQuatro));


        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if(numero1 < numero2){
            System.out.println("A condição é verdadeira");

        }

        System.out.println("NumeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;
        
        System.out.println("NumeroUm é diferente de numeroDois? " + simNao);

        simNao = numero1 > numero2;
        
        System.out.println("NumeroUm é maior que numeroDois? " + simNao);
    }
}

//para números se usa os operadores relacionais
//para objetos (string) usa equals

//(==) para verificar se uma variável é igual a outra
//(!=) para verificar se uma variável é diferente da outra
//(>) para verificar se uma variável é maior que outra
//(>=) para verificar se uma variável é maior ou igual a outra
//(<) para verificar se uma variável é menor que outra
//(<=) para verificar se uma variável é menor ou igual a outra

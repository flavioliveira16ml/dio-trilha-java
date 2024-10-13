package estudos;
public class Variaveis {
    public static void main(String[] args) throws Exception {

        String meuNome = "Flavio";

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;
        //prática de casting (ñ deve ser feito com frequência)

        int numero = 5;

        numero = 10;

        System.out.println(numero);

        final double VALOR_DE_PI = 3.14;

    }
}

//variável é uma área de memória, associada a um nome, para armazenar valores de um determinado tipo.
//constantes são valores armazenados em memória que não podem ser modificados sepois de declarados, utiliza-se "final" e a variável sempre será utilizada em caixa alta.

//byte - valor de -128 a 127
//short - valor de -32768 a 32767
//int - valor de -2147483648 a 2147483647 (mais comum de ser utilizado)
//long - valor de -9223372036854775808 a 9223372036854775807

//float - valor de -34028E + 38 a 34028E + 38 e termina com F
//double - valor de -17976E + 308 a 17976E + 308 (mais comum de ser utilizado)

//char só permite um único caractere entre ''
//boolean é usado para false ou true

//comum se utilizar int (idade e ano) e double (salário)
//em java . ñ quer dizer milhar (2.500 seria 2,5)/(2500 seria milhar)

//em um int cep (exemplo), se começar com 0, talvez tenha de ser de outro tipo
//em um long cpf (exemplo), se começar com 0, talvez tenha de ser de outro tipo
//(float pi = 3.14F;), float termina em F
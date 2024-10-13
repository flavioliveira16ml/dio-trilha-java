
public class Operadores{
    
    public static void main(String[] args){
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println(nomeCompleto);

        //o operador de adição (+) pode fazer a junção (concatenação) de textos quando usado em variáveis de texto


        //x repetição

        int numero = 5;

        numero = numero + 1;

        System.out.println(numero);

        numero++;

        System.out.println(numero);

        System.out.println(numero ++);

        System.out.println(numero);

        System.out.println(++ numero);

        System.out.println(numero --);

        System.out.println(numero);

        System.out.println(-- numero);


        boolean variavel = true;
        System.out.println(!variavel);
        //(!) faz com que a variável seja falsa sem mudar ela em si

        System.out.println(variavel);

        variavel = !variavel;
        //(!) inverteu, diretamente, o valor da variável
        System.out.println(variavel);
    }
}

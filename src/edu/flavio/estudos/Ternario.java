package estudos;
public class Ternario {
    public static void main(String[] args) {
        int a, b;

        a = 5;
        b = 6;

        /*String resultado = "";
        if(a==b)
            resultado = "verdadeiro";
        else
            resultado = "falso";

            System.out.println(resultado);*/

        String resultado = a==b ?"verdadeiro" : "falso";
        //com operador ternário
        //? indica verdadeiro enquanto : falso
        //poderia ser usado com int, mudando "verdadeiro" e "falso" para valores numéricos

        System.out.println(resultado);
        //caso a(5) fosse igual a b(6), seria verdadeiro
    }
}

package estudos;
public class Unarios {
    public static void main(String[] args) {
        int numero = 5;

        numero = - numero;

        System.out.println(numero);

        numero = numero * -1;
        //(+) é um operador aritmético para somar, caso queira inverter o valor do número, deve ser utilizado multipicação (número + -1)

        System.out.println(numero);
    }
}

//(+) operados unário de valor positivo
//(-) operador unário de valor negotivo -- nega um nº ou expressão aritmética
//(++) operados unário de incremento de valor -- incrementa em 1 unidade
//(--) operador unário de decremento -- decrementa em 1 unidade
//(!) operador unário lógico de negação -- nega o valor de uma expressão booleana
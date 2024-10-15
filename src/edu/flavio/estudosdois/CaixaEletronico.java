package estudosdois;

public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 20.0;

        //condicional simples
        if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;

            //se dentro do if ou else houver mais de uma instrução (System.out.println();), deve-se criar um bloco {}
            System.out.println("Novo saldo: " + saldo);

        } else //condicional composta
            System.out.println("Saldo insuficiente");
}
}

package estudosdois;

public class BreakContinue {
    public static void main(String[] args) {
        for (int numero = 1; numero <= 5; numero++){
            if (numero == 3)
            //caso o próximo comando seja break, o contador irá parar antes de chegar em 3
            //caso o próximo comando saja continue, o contador irá pular o número 3
                continue;

            System.out.println(numero);
        }
    }
}

public class Concatenacao {
    public static void main(String[] args) {
        String concatenacao = "?";

        concatenacao = 1 + 1 + 1 + "1";

            System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + 1;

            System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + "1";

            System.out.println(concatenacao);

        concatenacao = "1" + 1 + 1 + 1;

            System.out.println(concatenacao);

        concatenacao = "1" + (1 + 1 + 1);

            System.out.println(concatenacao);
    }
}


//a partir do momento que caracteres são detectados, operações matemáticas cessam, entretanto, colocar as operações em evidências pode burlar esse sistema (linha 21)
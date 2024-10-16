package estudosdois;

public class FormatadorDeCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23765064");
            
            System.out.println(cepFormatado);
        } catch (CepInvalidException e) {
            System.out.println("O CEP não corresponde às regras de negócio!");
        }
    }
    static String formatarCep(String cep) throws CepInvalidException{
        if (cep.length() != 8)
            throw new CepInvalidException();

            //exemplo de CEP formatado
            return "23.765-064";
    }
}

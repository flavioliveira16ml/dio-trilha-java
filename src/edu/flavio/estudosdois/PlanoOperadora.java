package estudosdois;

public class PlanoOperadora {
    public static void main(String[] args) {
        //T (TURBO) é o maior plano, então colocamos em ordem decrescente para haver inclusão dos bônus de cada pacote correspondente
        String plano = "T";

        //nesse caso, não utilizamos break, pois está em ordem decrescente e queremos as características de cada pacote 
        switch (plano) {
            case "T": {
                System.out.println("5Gb de YouTube!");
            }
            case "M": {
                System.out.println("Whats e Instagram grátis!");
            }
            case "B": {
                System.out.println("100 minutos de ligação!");
                break;
            }
            default:
                System.out.println("Selecione um plano válido!");
        /* 
        if(plano == "B"){
            System.out.println("Plano Basic com 100 minutos de ligação!");
        } else if (plano == "M") {
            System.out.println("Plano Midia com 100 minutos de ligação, WhatsApp e Instagram grátis!");
        } else if (plano == "T") {
            System.out.println("Plano Turbo com 100 minutos de ligação, WhatsApp e Instagram grátis e 5Gb para YouTube!");
        } else {
            System.out.println("Selecione um plano válido!");
        }

        */

    }
    }
}

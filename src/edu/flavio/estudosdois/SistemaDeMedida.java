package estudosdois;

public class SistemaDeMedida {
    public static void main(String[] args) {
        String sigla = "M";

        //Switch Case
        //deve-se adicionar o comando break para que as comparações deixem de ser executadas uma atrás da outra
        switch (sigla) {
            case "P":{
                System.out.println("PEQUENO!");
                break;
            }
            case "M":{
                System.out.println("MEDIO!");
                break;
            }
            case "G":{
                System.out.println("GRANDE!");
                break;
            }
            default:
                System.out.println("INDEFINIDO!");
        }

        /* 
        if(sigla == "P")
            System.out.println("PEQUENO!");
        
        else if (sigla == "M")
            System.out.println("MEDIO!");

        else if (sigla == "G")
            System.out.println("GRANDE!");

        else
            System.out.println("INDEFINIDO!");

        */
    }
}

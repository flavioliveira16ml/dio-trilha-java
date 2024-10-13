public class Logicos {
    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && (7 < 4)){
            System.out.println("as duas condições são verdadeiras");
        }

        if(condicao1 || condicao2){
            System.out.println("uma das condições é verdadeira");
        }


        System.out.println("Fim");
    }
}

//permite criar expressões lógicas a partir da junção de outras duas ou mais expressões

//(&&) operador lógico E 
//(||) operador lógico OU
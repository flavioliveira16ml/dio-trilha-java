package treinos.smarttv;
public class SmartTV {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void subirCanal(){
        canal++;
    }
        public void descerCanal(){
            canal--;
        }
            public void mudarCanal(int novoCanal){
                canal = novoCanal;
            }


    public void ligar(){
        ligada = true;
    }
        public void desligar(){
            ligada = false;
        }


    public void aumentarVolume(){
        volume++;

        System.out.println("Aumentando o volume para: " + volume);
    }
        public void diminuirVolume(){
            volume--;

            System.out.println("Diminuindo o volume para: " + volume);
        }
        
    }


//método deve ser nomeado como verbo
//método seguir o padrão camelCase (letras minúsculas, exceto a primeira letra da segunda palavra (camelCase))

/* Treino SmartTV
 * Deve ter as características: ligada(boolean), canal(int) e volume (int)
 * Ligas e desligar para mudar o estado ligada
 * Aumentar ou diminuir o volume sempre em +1 ou -1
 * Mudar de canal de 1 em 1 ou definindo número correspondente
 */
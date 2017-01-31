import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Random;

/**
 * Created by calamarte on 27/01/2017.
 */
public class Jugador {

    Carta[] mano = new Carta[3];
    int puntos;

    void setPuntos(int p){
        puntos += p;
    }

    Carta seleccion(int s){

        Carta c = mano[s];

        if (s >= 3){
            mano[s] = null;
            return c;
        }else {
            return null;
        }
    }

    void elimina(int n){
        if (n < 3) mano[n] = null;
    }


}

class Maquina extends Jugador {

    int inteligencia(){

        Random r = new Random();
        return r.nextInt(3);

    }

}

class  Humano extends Jugador {

    void getmano(){
        for (int i = 0; i < 3 ; i++) {
            System.out.println(i+"- "+mano[i].numero + " de " + mano[i].palo);
        }
    }

    void humanoGana(Maquina maquina, boolean b) {

        if (b == true) {
            System.out.println("Ganas la ronda");
        }else{
            System.out.println("Pierdes la ronda");
        }
        System.out.println("Tu puntuación " + this.puntos);
        System.out.println("Puntuación de la máquina " + maquina.puntos);
    }


}

import java.util.Arrays;

/**
 * Created by calamarte on 17/01/2017.
 */
public class Baraja {

    Carta[] baraja = new Carta[48];

    Baraja(){

        Carta.Palo[] palos = Carta.Palo.values();
        Carta.Numero[] numeros = Carta.Numero.values();

        Carta[] baraja = new Carta[48];
        int b = 0;

        //genera todas las cartas posibles de una baraja
        for (int i = 0; i < 4 ; i++) {
            for (int j = 0; j < 12 ; j++) {
                baraja[b] = new Carta(palos[i],numeros[j]);
                b++;
            }
        }

        this.baraja = baraja;

    }

    void imprime(int n){
        if (n <= 47) {
            System.out.println("El " + baraja[n].numero + " de " + baraja[n].c);
        }else{
            System.out.println("No existe");
        }
    }

}

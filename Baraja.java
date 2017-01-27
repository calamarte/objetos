import java.util.Random;

/**
 * Created by calamarte on 17/01/2017. :)
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

    void mezcla(){

        Random r = new Random();

        for (int i = baraja.length -1; i >= 1; i--) {
            int ii = r.nextInt(i+1);
             Carta c = baraja[ii];
             baraja[ii] = baraja[i];
             baraja[i] = c;
        }

    }


    void imprime(int n){
        if (n <= 47) {
            if (baraja[n] == null){return;}
            System.out.println(baraja[n].numero + " de " + baraja[n].palo);
        }else{
            System.out.println("No existe");
        }
    }

}

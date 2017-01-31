import java.util.Scanner;

/**
 * Created by calamarte on 11/01/2017. :)
 */
public class generador {

    public static void main(String[] args) {
        Baraja baraja = new Baraja();
        Maquina maquina = new Maquina();
        Humano humano = new Humano();
        Brisca brisca = new Brisca();

        baraja.mezcla();

        brisca.setTriunfo(baraja);



        while (true){

            humano.mano = brisca.repartir(baraja);
            maquina.mano = brisca.repartir(baraja);

            Scanner s = new Scanner(System.in);

            System.out.println( "Carta triunfo es "+brisca.getTriunfo().imprime());
            humano.getmano();
            int h = s.nextInt();
            int m = maquina.inteligencia();

            brisca.compara(humano.mano[h],maquina.mano[m],humano,maquina);
            humano.elimina(h);
            maquina.elimina(m);

        }

        //System.out.println("-------------------------------------------");

       // for (int i = 0; i < 48 ; i++) {
         //   baraja.imprime(i);
        //}



    }
}
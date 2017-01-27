

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

        humano.mano = brisca.repartir(baraja);
        maquina.mano = brisca.repartir(baraja);


        while (true){

            break;
        }

        System.out.println("-------------------------------------------");

        for (int i = 0; i < 48 ; i++) {
            baraja.imprime(i);
        }



    }
}
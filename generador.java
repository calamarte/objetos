import java.util.Arrays;

/**
 * Created by calamarte on 11/01/2017. :)
 */
public class generador {
    public static void main(String[] args) {
         Baraja b = new Baraja();

        for (int i = 0; i < 48 ; i++) {
            b.imprime(i);
        }

        b.mezcla();

        System.out.println("---------------");

        for (int i = 0; i < 48 ; i++) {
            b.imprime(i);
        }
    }
}

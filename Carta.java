/**
 * Created by calamarte on 17/01/2017.
 */
public class Carta {

     Palo c;
     Numero numero;

   private static int cantcartas = 0;

    enum Palo {
        OROS,
        COPAS,
        ESPADAS,
        BASTOS
    }
    enum Numero {
        AS, DOS, TRES, CUATR0, CINCO, SEIS, SIETE, OCHO, NUEVE, SOTA, CABALLO, REY
    }

    Carta(Palo c, Numero numero){
         this.numero = numero;
         cantcartas++;
        this.c = c;
    }

    void getCantcartas(){
        System.out.println(cantcartas);
    }

    void imprime(){
        System.out.println(c);
        System.out.println(numero);
    }

}

/**
 * Created by calamarte on 17/01/2017.
 */
public class Carta {

     Palo palo;
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

    Carta(Palo palo, Numero numero){
         this.numero = numero;
         cantcartas++;
        this.palo = palo;
    }

    void getCantcartas(){
        System.out.println(cantcartas);
    }

    String imprime(){
        StringBuilder sb = new StringBuilder();

        sb.append(numero + " de " + palo);

        return sb.toString();
    }

}

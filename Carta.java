/**
 * Created by calamarte on 17/01/2017.
 */
public class Carta {

    TipoDeCarta c;
    int numero;

   private static int cantcartas = 0;

    enum TipoDeCarta{
        OROS,
        COPAS,
        ESPADAS,
        BASTOS
    }
    enum Numero {
        AS, DOS, TRES, CUATR0, CINCO, SEIS, SIETE, OCHO, NUEVE, SOTA, CABALLO, REY
    }

    Carta(TipoDeCarta c, int numero){
        if((numero >= 0) && (numero <= 11)){
         this.numero = numero;
         cantcartas++;
        }else{

            return;
        }

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

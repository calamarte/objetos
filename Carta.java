/**
 * Created by calamarte on 17/01/2017.
 */
public class Carta {

    TipoDeCarta c;
    int numero;

    static int cantcartas = 0;

    enum TipoDeCarta{
        OROS,
        COPAS,
        ESPADAS,
        BASTOS
    }

    Carta(TipoDeCarta c, int numero){
        if((numero >= 0) && (numero <= 11)){
         this.numero = numero;
         cantcartas++;
        }else{
            System.out.println("No existe");
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

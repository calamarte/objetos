/**
 * Created by calamarte on 27/01/2017.
 */
public class Brisca {

   private Carta triunfo;

    public void setTriunfo(Baraja b) {

        for (int i = 0; i < 48 ; i++) {
            if (b.baraja[i] != null) {
                triunfo = b.baraja[i];
                b.baraja[i] = null;

                break;
            }
        }
    }

    Carta[] repartir(Baraja b){
        Carta[] mano = new Carta[3];
        int m = 0,c = 0;

        while(m <= 2) {

            if(mano[m] == null) {

                if (c >= 47) {
                    break;
                }

                if (b.baraja[c] != null) {
                    mano[m] = b.baraja[c];
                    b.baraja[c] = null;
                    m++;
                }


                c++;
            }else{
                m++;
            }
        }

        return mano;
    }

    void compara(Carta humano, Carta maquina,Humano H,Maquina M){


        int h = valor(humano);
        int m = valor(maquina);

        if (humano.palo == triunfo.palo || maquina.palo == triunfo.palo){
            if(humano.palo == triunfo.palo && maquina.palo == triunfo.palo) {
                if (h > m) {
                    H.setPuntos(h + m);
                    H.humanoGana(M, true);
                } else {
                    M.setPuntos(h + m);
                    H.humanoGana(M, false);
                }
            }

            if (humano.palo == triunfo.palo){
                    H.setPuntos(h+m);
                    H.humanoGana(M,true);
                }else{
                    M.setPuntos(h+m);
                    H.humanoGana(M,false);
                }

        }else {
            if (h > m){
                H.setPuntos(h+m);
                H.humanoGana(M,true);
            }else{
                M.setPuntos(h+m);
                H.humanoGana(M,false);
            }
        }


    }

    private int valor(Carta c){

        int v;

        switch (c.numero){
            case AS: v = 11;
            case TRES: v = 10;
            case REY: v = 4;
            case CABALLO: v = 3;
            case SOTA: v = 2;
            default: v = 0;
        }
        return v;
    }



}

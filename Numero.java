import java.util.Arrays;

/**
 * Created by calamarte on 12/01/2017.
 */
public class Numero {
    int numero = 0;
    String nromano;

    Numero(int numero){
    this.numero = numero;
    }

    Numero(String nromano){
    this.nromano = nromano;
    int[] a = new int[nromano.length()];

        //Da valores al array
        for (int i = nromano.length() - 1; i >= 0; i--) {
           a[i] = romanconverter(nromano.charAt(i));
        }

        numero = a[a.length-1];

        //Genrador del numero
        for (int i = nromano.length() -1; i > 0 ; i--) {
            if(a[i-1] < a[i]){
                numero -= a[i-1];
            }else{
                numero += a[i -1];
            }
        }
    }

    void imprime(){
        System.out.println(this.numero);
    }

    private int romanconverter(char l){
        int n = 0;
        if ((l == 'I') || (l =='V') || (l =='X') || (l == 'L') || (l == 'C') || (l =='D') || (l =='M')) {
            if (l == 'I') {
                n = 1;
            }
            if (l == 'V') {
                n = 5;
            }
            if (l == 'X') {
                n = 10;
            }
            if (l == 'L') {
                n = 50;
            }
            if (l == 'C') {
                n = 100;
            }
            if (l == 'D') {
                n = 500;
            }
            if (l == 'M') {
                n = 1000;
            }
        }else{
            n = 0;
        }
        return n;
    }

    String hex(){
        String n = Integer.toHexString(numero);

        return n;
    }

    String bin() {
        String n = Integer.toBinaryString(numero);

        return n;
    }
}

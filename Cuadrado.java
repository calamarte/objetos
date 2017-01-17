import java.util.Arrays;

/**
 * Created by calamarte on 11/01/2017.
 */
public class Cuadrado {
    int[][] a;

    Cuadrado(int n){
        int[][] a = new int[n][n];
        this.a = a;

        for (int i = 0; i < a.length ; i++) {
        a[i][0] = 1;
        a[0][i] = 1;
        }

        for (int i = 0,x = 1,y = 1; i < (a.length - 1)*(a.length - 1) ; i++) {
            if (x > a.length -1){
                y++;
                x = 1;
            }
            a[y][x] = (a[y -1][x] + a[y][x - 1]);
            x++;
        }
    }


    void imprime() {
        for (int i = 0,x = 0,y = 0; i <a.length*a.length ; i++) {
            if(x > a.length -1) {
                x = 0;
                y++;
                System.out.println();
            }
            System.out.printf("% 20d ", (long) a[y][x]);
            x++;
        }
    }
}

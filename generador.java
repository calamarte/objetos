import java.util.Arrays;

/**
 * Created by calamarte on 11/01/2017.
 */
public class generador {
    public static void main(String[] args) {

        Pez Pablo = new Pez();
        Pez Jaime = new Pez();
        Pablo.setNombre("Pablo");
        Jaime.setNombre("Jaime");

        Pablo.numpeces = 1;
        Jaime.numpeces = 2;

        System.out.println(Pablo.getNombre());
        System.out.println(Jaime.getNombre());
        System.out.println(Pablo.numpeces);
        System.out.println(Jaime.numpeces);


}
}

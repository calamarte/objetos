/**
 * Created by calamarte on 12/01/2017.
 */
public class Pez {
    String nombre = "pepito";

    static int numpeces = 0;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    Pez(Pez pez){
        this.nombre = pez.nombre;
        count();
    }

    Pez(){
        count();
    }

    private void count(){
        numpeces++;
    }

    public boolean equals(Pez pez){
        boolean b = false;

        if (this.nombre == pez.nombre){
            b = true;
        }

        return b;
    }

}

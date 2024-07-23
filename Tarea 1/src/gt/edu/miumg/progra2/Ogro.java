package gt.edu.miumg.progra2;

public class Ogro extends Personaje implements Villano {

    public Ogro(String nombre, String descripcion, long tamaño, int poder, int vida) {
        super(nombre, descripcion, tamaño, poder, vida);
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " está atacando.");
    }

    @Override
    public void destruir() {
        System.out.println(nombre + " está destruyendo.");
    }
}
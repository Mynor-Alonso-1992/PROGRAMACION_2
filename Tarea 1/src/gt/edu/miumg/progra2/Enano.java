package gt.edu.miumg.progra2;

public class Enano extends Personaje implements Heroe {

    public Enano(String nombre, String descripcion, long tamaño, int poder, int vida) {
        super(nombre, descripcion, tamaño, poder, vida);
    }

    public void atacar() {
        System.out.println(nombre + " está atacando.");
    }


    public void defender() {
        System.out.println(nombre + " está defendiendo.");
    }


    public void recibirAtaque() {
        System.out.println(nombre + " está recibiendo un ataque.");
    }
}

package gt.edu.miumg.progra2;

public class Humano extends Personaje implements Heroe {

    public Humano(String nombre, String descripcion, long tamaño, int poder, int vida) {
        super(nombre, descripcion, tamaño, poder, vida);
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " está atacando.");
    }

    @Override
    public void defender() {
        System.out.println(nombre + " está defendiendo.");
    }

    @Override
    public void recibirAtaque() {
        System.out.println(nombre + " está recibiendo un ataque.");
    }
}
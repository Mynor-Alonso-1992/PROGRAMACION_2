package gt.edu.miumg.progra2;

public abstract class Personaje {
    protected String nombre;
    protected String descripcion;
    protected long tamaño;
    protected int poder;
    protected int vida;

    public Personaje(String nombre, String descripcion, long tamaño, int poder, int vida) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tamaño = tamaño;
        this.poder = poder;
        this.vida = vida;
    }

    public void desplazarse() {
        System.out.println(nombre + " se está desplazando.");
    }

    public int mostrarVida() {
        return vida;
    }

    public void mostrarPoder() {
        System.out.println("El poder de " + nombre + " es " + poder);
    }
}
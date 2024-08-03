package gt.edu.miumg.progra2;

public class Granos implements Ingrediente {
    private String tipo;
    private int cantidad;

    public Granos(String tipo, int cantidad) {
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    @Override
    public String obtenerNombre() {
        return tipo;
    }

    @Override
    public int obtenerCantidad() {
        return cantidad;
    }
}
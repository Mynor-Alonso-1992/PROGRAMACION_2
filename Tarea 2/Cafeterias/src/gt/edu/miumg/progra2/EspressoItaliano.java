package gt.edu.miumg.progra2;

public class EspressoItaliano extends Cafe {
    private String intensidad;

    public EspressoItaliano(String tamaño, String precio, String intensidad) {
        super("Espresso Italiano", tamaño, precio);
        this.intensidad = intensidad;
    }

    @Override
    public void preparar() {
        System.out.println("Preparando " + Nombre + " con intensidad " + intensidad);
    }
}
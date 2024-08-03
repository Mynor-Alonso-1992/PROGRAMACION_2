package gt.edu.miumg.progra2;

public class CafeColombiano extends Cafe {
    private String tipoGrano;

    public CafeColombiano(String tamaño, String precio, String tipoGrano) {
        super("Cafe Colombiano", tamaño, precio);
        this.tipoGrano = tipoGrano;
    }

    @Override
    public void preparar() {
        System.out.println("Preparando " + Nombre + " con grano " + tipoGrano);
    }
}
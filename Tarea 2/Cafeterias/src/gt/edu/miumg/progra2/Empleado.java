package gt.edu.miumg.progra2;

public class Empleado {
    private String nombre;
    private String puesto;
    private double salario;

    public Empleado(String nombre, String puesto, double salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }

    public void trabajar() {
        System.out.println(nombre + " está trabajando como " + puesto);
    }

    public void tomarOrden() {
        System.out.println(nombre + " está tomando una orden");
    }
}
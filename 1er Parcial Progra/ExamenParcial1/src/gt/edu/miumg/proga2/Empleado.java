package gt.edu.miumg.proga2;

class Empleado {
    String nombre;
    String puesto;
    double salario;

    Empleado(String nombre, String puesto, double salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }

    void trabajar() {
        System.out.println(nombre + " está trabajando");
    }

    void tomarOrden() {
        System.out.println(nombre + " está tomando una orden");
    }
}
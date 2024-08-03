package gt.edu.miumg.proga2;

abstract class Pizza {
    String nombre;
    String tamaño;
    double precio;
    Masa masa;
    Salsa salsa;
    Queso queso;

    Pizza(String nombre, String tamaño, double precio) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.precio = precio;
    }

    void preparar() {
        System.out.println("Preparando " + nombre);
    }

    void hornear() {
        System.out.println("Horneando " + nombre);
    }

    void cortar() {
        System.out.println("Cortando " + nombre);
    }

    void empacar() {
        System.out.println("Empacando " + nombre);
    }

    abstract void setComposicion();
}
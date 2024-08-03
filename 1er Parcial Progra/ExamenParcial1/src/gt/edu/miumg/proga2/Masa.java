package gt.edu.miumg.proga2;

class Masa implements Ingrediente {
    String tipo;
    int cantidad;

    Masa(String tipo, int cantidad) {
        this.tipo = tipo;
        this.cantidad = cantidad;
    }


    public String obtenerNombre() {
        return tipo;
    }

    public int obtenerCantidad() {
        return cantidad;
    }
}

class Salsa implements Ingrediente {
    String sabor;
    int cantidad;

    Salsa(String sabor, int cantidad) {
        this.sabor = sabor;
        this.cantidad = cantidad;
    }


    public String obtenerNombre() {
        return sabor;
    }


    public int obtenerCantidad() {
        return cantidad;
    }
}

class Queso implements Ingrediente {
    String tipo;
    int cantidad;

    Queso(String tipo, int cantidad) {
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    public String obtenerNombre() {
        return tipo;
    }

    public int obtenerCantidad() {
        return cantidad;
    }
}
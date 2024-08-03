package gt.edu.miumg.proga2;
class PizzaNuevaYork extends Pizza {
    String estiloCorte;

    PizzaNuevaYork(String nombre, String tamaño, double precio, String estiloCorte) {
        super(nombre, tamaño, precio);
        this.estiloCorte = estiloCorte;
        setComposicion();
    }


    void setComposicion() {
        this.masa = new Masa("Fina", 1);
        this.salsa = new Salsa("Marinara", 1);
        this.queso = new Queso("Mozzarella", 1);
    }
}

class PizzaChicago extends Pizza {
    String grosorMasa;

    PizzaChicago(String nombre, String tamaño, double precio, String grosorMasa) {
        super(nombre, tamaño, precio);
        this.grosorMasa = grosorMasa;
        setComposicion();
    }


    void setComposicion() {
        this.masa = new Masa("Gruesa", 2);
        this.salsa = new Salsa("Tomate", 2);
        this.queso = new Queso("Cheddar", 2);
    }
}
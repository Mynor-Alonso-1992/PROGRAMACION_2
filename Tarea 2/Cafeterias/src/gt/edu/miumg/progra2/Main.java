package gt.edu.miumg.progra2;

public class Main {
    public static void main(String[] args) {
        Sucursal bogota = new Sucursal("Bogotá", "Calle 123");
        Sucursal roma = new Sucursal("Roma", "Via Roma 456");

        Empleado juan = new Empleado("Juan", "Barista", 1000);
        Empleado maria = new Empleado("Maria", "Cajera", 800);

        bogota.agregarEmpleado(juan);
        bogota.agregarEmpleado(maria);

        Ingrediente granosColombianos = new Granos("Colombiano", 100);
        Ingrediente agua = new Agua(500);
        Ingrediente leche = new Leche("Entera", 200);

        bogota.agregarIngrediente(granosColombianos);
        bogota.agregarIngrediente(agua);
        bogota.agregarIngrediente(leche);

        Equipo maquinaCafe = new Equipo("Maquina de Café", "Operativo");
        bogota.agregarEquipo(maquinaCafe);

        Cafe cafeColombiano = new CafeColombiano("Grande", "5.0", "Arabica");
        bogota.agregarEspecialidad(cafeColombiano);

        juan.trabajar();
        juan.tomarOrden();

        cafeColombiano.preparar();
        cafeColombiano.servir();
    }
}
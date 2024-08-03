package gt.edu.miumg.proga2;

public class Main {
    public static void main(String[] args) {
        // Crear sucursales
        Sucursal sucursalNY = new Sucursal("New York", "123 Main St");
        Sucursal sucursalCHI = new Sucursal("Chicago", "456 Lake St");

        // Crear empleados
        Empleado empleado1 = new Empleado("John Doe", "Cocinero", 3000);
        Empleado empleado2 = new Empleado("Jane Smith", "Cajero", 2500);

        // Crear equipos
        Equipo equipo1 = new Equipo("Horno", "Operativo");
        Equipo equipo2 = new Equipo("Amasadora", "Reparación");

        // Agregar empleados y equipos a las sucursales
        sucursalNY.agregarEmpleado(empleado1);
        sucursalNY.agregarEmpleado(empleado2);
        sucursalNY.agregarEquipo(equipo1);
        sucursalNY.agregarEquipo(equipo2);

        // Crear especialidades de pizza
        Pizza pizzaNY = new PizzaNuevaYork("NY Style Pepperoni", "Grande", 15.99, "Triangular");
        Pizza pizzaCHI = new PizzaChicago("Chicago Deep Dish", "Mediana", 18.99, "Gruesa");

        // Agregar especialidades a las sucursales
        sucursalNY.agregarEspecialidad(pizzaNY);
        sucursalCHI.agregarEspecialidad(pizzaCHI);

        // Mostrar resultados en la terminal
        empleado1.trabajar();
        empleado2.tomarOrden();
        equipo1.encender();
        equipo2.reparar();

        pizzaNY.preparar();
        pizzaNY.hornear();
        pizzaNY.cortar();
        pizzaNY.empacar();

        pizzaCHI.preparar();
        pizzaCHI.hornear();
        pizzaCHI.cortar();
        pizzaCHI.empacar();
    }
}
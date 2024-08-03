package gt.edu.miumg.proga2;

import java.util.ArrayList;

class Sucursal {
    String nombre;
    String direccion;
    ArrayList<Empleado> empleados;
    ArrayList<Ingrediente> ingredientes;
    ArrayList<Equipo> equipos;
    ArrayList<Pizza> especialidades;

    Sucursal(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.empleados = new ArrayList<>();
        this.ingredientes = new ArrayList<>();
        this.equipos = new ArrayList<>();
        this.especialidades = new ArrayList<>();
    }

    void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    void agregarIngrediente(Ingrediente ingrediente) {
        ingredientes.add(ingrediente);
    }

    void agregarEquipo(Equipo equipo) {
        equipos.add(equipo);
    }

    void agregarEspecialidad(Pizza pizza) {
        especialidades.add(pizza);
    }
}

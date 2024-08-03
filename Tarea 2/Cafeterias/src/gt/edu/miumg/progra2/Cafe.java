package gt.edu.miumg.progra2;

public abstract class Cafe {
    public String Nombre, Tamaño, precio;

    public Cafe (String Nombre, String Tamaño, String precio){
        this.Nombre = Nombre;
        this.Tamaño= Tamaño;
        this.precio= precio;
    }

    public abstract void preparar();

    public void servir(){
        System.out.println(Nombre+ " Se esta sirviendo");
    }
}

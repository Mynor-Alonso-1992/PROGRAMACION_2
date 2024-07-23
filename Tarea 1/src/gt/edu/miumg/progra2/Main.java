package gt.edu.miumg.progra2;

public class Main {
    public static void main(String[] args) {
        Elfo elfo = new Elfo("Legolas", "Elfo del bosque", 180, 80, 100);
        Enano enano = new Enano("Gimli", "Enano de las montañas", 130, 85, 120);
        Humano humano = new Humano("Aragorn", "Humano del reino de Gondor", 190, 90, 110);
        Ogro ogro = new Ogro("Shrek", "Ogro del pantano", 250, 70, 150);
        Duende duende = new Duende("Duende Verde", "Duende maligno", 160, 75, 95);

        elfo.atacar();
        enano.defender();
        humano.recibirAtaque();
        ogro.atacar();
        duende.destruir();

        elfo.desplazarse();
        System.out.println("Vida de " + elfo.nombre + ": " + elfo.mostrarVida());
        elfo.mostrarPoder();
    }
}
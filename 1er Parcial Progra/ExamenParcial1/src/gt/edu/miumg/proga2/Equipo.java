package gt.edu.miumg.proga2;

class Equipo {
    String tipo;
    String estado;

    Equipo(String tipo, String estado) {
        this.tipo = tipo;
        this.estado = estado;
    }

    void encender() {
        System.out.println("Encendiendo " + tipo);
    }

    void apagar() {
        System.out.println("Apagando " + tipo);
    }

    void reparar() {
        System.out.println("Reparando " + tipo);
    }
}
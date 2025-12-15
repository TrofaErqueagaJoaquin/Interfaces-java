package JuegoB;

public class Cuartel extends Edificio {

    public Cuartel(String nombre, String equipo, int x, int y) {
        super(nombre, equipo, 500, 3000, x, y);
    }

    public int getTiempoConstruccion() {
        return 60;
    }

    public void recibeDano(int cantidad) {
        energia -= cantidad * 0.5;
    }
}

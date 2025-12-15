package JuegoB;

public class Cuartel extends Edificio {

    public Cuartel(String equipo, int x, int y) {
        super(equipo, 500, 3000, x, y);
    }

    public int getTiempoConstruccion() {
        return 60;
    }

    public void recibeDano(int cantidad) {
        energia -= cantidad * 0.5;
    }
}

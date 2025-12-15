package JuegoB;

public class Medico extends Personaje {

    public Medico(String equipo, int x, int y) {
        super(equipo, 40, 100, x, y);
    }

    public void recibeDano(int cantidad) {
        energia -= cantidad * 1.5;
    }
}
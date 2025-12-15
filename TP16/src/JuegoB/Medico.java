package JuegoB;

public class Medico extends Personaje {

    public Medico(String nombre, String equipo, int x, int y) {
        super(nombre, equipo, 40, 100, x, y);
    }

    public void recibeDano(int cantidad) {
        energia -= cantidad * 1.5;
    }
}

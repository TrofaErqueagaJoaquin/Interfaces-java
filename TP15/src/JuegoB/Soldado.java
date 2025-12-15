package JuegoB;

public class Soldado extends Personaje implements IHostil {

    public Soldado(String equipo, int x, int y) {
        super(equipo, 100, 500, x, y);
    }

    public void recibeDano(int cantidad) {
        energia -= cantidad;
    }

    public void atacar(Unidad adversario) {
        adversario.recibeDano(50);
    }
}

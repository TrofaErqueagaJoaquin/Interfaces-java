package JuegoB;

public abstract class Personaje extends Unidad implements IPosicionable, IMovible {

    protected int x;
    protected int y;

    public Personaje(String nombre, String equipo, int costo, int energia, int x, int y) {
        super(nombre, equipo, costo, energia);
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void mover(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

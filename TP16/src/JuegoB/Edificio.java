package JuegoB;

public abstract class Edificio extends Unidad implements IPosicionable, IConstruible {

    protected int x;
    protected int y;

    public Edificio(String nombre, String equipo, int costo, int energia, int x, int y) {
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
}

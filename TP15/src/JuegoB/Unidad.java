package JuegoB;

public abstract class Unidad {

    protected String equipo;
    protected int costo;
    protected int energia;

    public Unidad(String equipo, int costo, int energia) {
        this.equipo = equipo;
        this.costo = costo;
        this.energia = energia;
    }

    public int getEnergia() {
        return energia;
    }

    public abstract void recibeDano(int cantidad);
}

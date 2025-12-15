package JuegoB;

public abstract class Unidad implements Comparable<Unidad> {

    protected String nombre;
    protected String equipo;
    protected int costo;
    protected int energia;

    public Unidad(String nombre, String equipo, int costo, int energia) {
        this.nombre = nombre;
        this.equipo = equipo;
        this.costo = costo;
        this.energia = energia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEquipo() {
        return equipo;
    }

    public int getEnergia() {
        return energia;
    }

    public abstract void recibeDano(int cantidad);

    @Override
    public int compareTo(Unidad otra) {
        int cmpEquipo = this.equipo.compareToIgnoreCase(otra.equipo);
        if (cmpEquipo != 0) {
            return cmpEquipo;
        }
        return this.nombre.compareToIgnoreCase(otra.nombre);
    }

    @Override
    public String toString() {
        return equipo + " - " + nombre + " (" + energia + ")";
    }
}

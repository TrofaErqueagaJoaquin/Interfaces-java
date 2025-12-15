package JuegoB;

public class TorretaVigilancia extends Edificio implements IHostil {

    public TorretaVigilancia(String equipo, int x, int y) {
        super(equipo, 200, 2000, x, y);
    }

    public int getTiempoConstruccion() {
        return 40;
    }

    public void recibeDano(int cantidad) {
        energia -= cantidad;
    }

    public void atacar(Unidad adversario) {
        adversario.recibeDano(10);
    }
}
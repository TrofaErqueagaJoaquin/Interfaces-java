package JuegoB;

public class MainJuego {

    public static void main(String[] args) {

        Soldado soldadoRojo = new Soldado("Rojo", 5, 5);
        Medico medicoRojo = new Medico("Rojo", 6, 5);

        Cuartel cuartelAzul = new Cuartel("Azul", 10, 10);
        TorretaVigilancia torretaAzul = new TorretaVigilancia("Azul", 12, 10);

        System.out.println("Energia inicial");
        System.out.println("Soldado rojo: " + soldadoRojo.getEnergia());
        System.out.println("Medico rojo: " + medicoRojo.getEnergia());
        System.out.println("Cuartel azul: " + cuartelAzul.getEnergia());
        System.out.println("Torreta azul: " + torretaAzul.getEnergia());

        System.out.println("\nEl soldado ataca de una a la torreta");
        soldadoRojo.atacar(torretaAzul);

        System.out.println("la energia torreta desp del ataque: " + torretaAzul.getEnergia());

        System.out.println("\nla torreta no se queda callada y responde el ataque");
        torretaAzul.atacar(soldadoRojo);

        System.out.println("Energia soldado luego del ataque: " + soldadoRojo.getEnergia());

        System.out.println("\nEl medico recibe daño");
        medicoRojo.recibeDano(20);
        System.out.println("Energia medico luego del daño: " + medicoRojo.getEnergia());

        System.out.println("\nMovimiento del soldado");
        soldadoRojo.mover(8, 9);
        System.out.println("Nueva posicion soldado: (" + soldadoRojo.getX() + ", " + soldadoRojo.getY() + ")");
    }
}

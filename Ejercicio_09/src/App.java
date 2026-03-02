import java.util.ArrayList;
import java.util.Collections;

public class App {
    static ArrayList<Carta> cartasExistentes = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        generarCartas(10);
        Collections.sort(cartasExistentes);
        imprimirCartas();
    }
    
    public static void generarCartas(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            Palo palo = Palo.values()[(int) (Math.random() * Palo.values().length)];
            Num numero = Num.values()[(int) (Math.random() * Num.values().length)];
            Carta cartaNueva = new Carta(palo, numero);
            if (!cartasExistentes.contains(cartaNueva)) {
                cartasExistentes.add(cartaNueva);
            } else {
                i--;
            }
        }
    }

    public static void imprimirCartas() {
        System.out.println("Cartas generadas:");
        for (Carta carta : cartasExistentes) {
            System.out.println(carta.getPalo() + " " + carta.getNumero());
        }
    }
    
}

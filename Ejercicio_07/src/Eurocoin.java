import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class Eurocoin {

    private static Random random = new Random();

    public static void main(String[] args) {

        List<Moneda> lista = new ArrayList<>();

        Moneda primera = generarMonedaAleatoria();
        lista.add(primera);

        for (int i = 1; i < 6; i++) {
            Moneda anterior = lista.get(i - 1);
            Moneda nueva = generarMonedaConRegla(anterior);
            lista.add(nueva);
        }

        for (Moneda m : lista) {
            System.out.println(m);
        }
    }
    
    private static Moneda generarMonedaAleatoria() {
        Valor valor = Valor.values()[random.nextInt(Valor.values().length)];
        Posicion posicion = Posicion.values()[random.nextInt(Posicion.values().length)];
        return new Moneda(valor, posicion);
    }

    private static Moneda generarMonedaConRegla(Moneda anterior) {

        boolean mantenerValor = random.nextBoolean();

        Valor valor;
        Posicion posicion;

        if (mantenerValor) {
            valor = anterior.getValor();
            posicion = Posicion.values()[random.nextInt(Posicion.values().length)];
        } else {
            valor = Valor.values()[random.nextInt(Valor.values().length)];
            posicion = anterior.getPosicion();
        }

        return new Moneda(valor, posicion);
    }
}
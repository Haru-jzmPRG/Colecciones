import java.util.ArrayList;
import java.util.List;

enum Valor {
    UN_CENTIMO("1 céntimo"),
    DOS_CENTIMOS("2 céntimos"),
    CINCO_CENTIMOS("5 céntimos"),
    DIEZ_CENTIMOS("10 céntimos"),
    VEINTICINCO_CENTIMOS("25 céntimos"),
    CINCUENTA_CENTIMOS("50 céntimos"),
    UN_EURO("1 euro"),
    DOS_EUROS("2 euros");

    private final String texto;

    Valor(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        return texto;
    }
}

enum Posicion {
    CARA, CRUZ
}

public class Moneda {

    private Valor valor;
    private Posicion posicion;

    public Moneda(Valor valor, Posicion posicion) {
        this.valor = valor;
        this.posicion = posicion;
    }

    public Valor getValor() {
        return valor;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    @Override
    public String toString() {
        return valor + " - " + posicion.toString().toLowerCase();
    }

    List<Moneda> monedas = new ArrayList<Moneda>();

}

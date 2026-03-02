enum Palo {
    BASTOS, COPAS, ESPADAS, OROS
}

enum Num {
    AS, DOS, TRES, CUATRO, CINCO, SEIS, SIETE, SOTA, CABALLO, REY
}

public class Carta implements Comparable<Carta> {
    private Palo palo;
    private Num numero;

    public Carta(Palo palo, Num numero) {
        this.palo = palo;
        this.numero = numero;
    }

    public Palo getPalo() {
        return palo;
    }

    public Num getNumero() {
        return numero;
    }

    @Override
    public int compareTo(Carta carta) {
        int comparacionPalo = this.palo.ordinal() - carta.palo.ordinal();
        if (comparacionPalo != 0) {
            return comparacionPalo;
        }
        return this.numero.ordinal() - carta.numero.ordinal();
    }

    @Override
    public String toString() {
        return palo + " " + numero;
    }
}

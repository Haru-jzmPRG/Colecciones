enum Palo {
    ORO, BASTRO, ESPADA, COPA
}

enum Num {
    UNO, DOS, TRES, CUATRO, CINCO, SEIS, SIETE
}

public class Carta {
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
}

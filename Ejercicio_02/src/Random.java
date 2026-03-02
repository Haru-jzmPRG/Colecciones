import java.util.ArrayList;

public class Random {
    ArrayList<Integer> lista = new ArrayList<Integer>();

    public Random() {
        for (int i = 0; i < ((Math.random() * (21 - 10)) + 10); i++) {
            lista.add((int)(Math.random() * 100));
        }
    }
}

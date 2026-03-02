import java.util.ArrayList;
import java.util.List;

public class Nombre {
    List<String> Nombres = new ArrayList<String>();

    public void setNombre(String nombre) {
        Nombres.add(nombre);
    }

    public void setNombres(List<String> nombres) {
        Nombres = nombres;
    }

    public List<String> getNombres() {
        return Nombres;
    }
    
    public Nombre() {
        Nombres.add("Victor");
        Nombres.add("Juanma");
        Nombres.add("Juan");
        Nombres.add("Marco");
        Nombres.add("Jose");
    }
}

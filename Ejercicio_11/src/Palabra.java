import java.util.Objects;

public class Palabra implements Comparable<Palabra> {
    private String traduccion;
    private String categoria;

    public Palabra(String traduccion, String categoria) {
        this.traduccion = traduccion;
        this.categoria = categoria;
    }

    public String getTraduccion() {
        return traduccion;
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
     public boolean equals(Object obj) {
        if (obj instanceof Palabra) {
            Palabra p = (Palabra) obj;
            return Objects.equals(this.getTraduccion(), p.getTraduccion()) && Objects.equals(this.getCategoria(), p.getCategoria());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getTraduccion(), this.getCategoria());
    }

    @Override
    public int compareTo(Palabra p) {
        return this.getTraduccion().compareTo(p.getTraduccion());
    }
}

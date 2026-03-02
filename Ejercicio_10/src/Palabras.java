public class Palabras {
    private String espaniol;
    private String ingles;

    public Palabras(String espaniol, String ingles) {
        this.espaniol = espaniol;
        this.ingles = ingles;
    }

    public String getEspaniol() {
        return espaniol;
    }

    public void setEspaniol(String espaniol) {
        this.espaniol = espaniol;
    }

    public String getIngles() {
        return ingles;
    }

    public void setIngles(String ingles) {
        this.ingles = ingles;
    }

    @Override
    public String toString() {
        return "Español: " + espaniol + '\n' +
                "Inglés: " + ingles + '\n';
    }
}

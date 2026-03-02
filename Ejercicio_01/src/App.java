public class App {
    public static void main(String[] args) throws Exception {
        for (String nombre : new Nombre().getNombres()) {
            System.out.println(nombre);
        }
    }
}

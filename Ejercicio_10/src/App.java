import java.util.ArrayList;

public class App {

    ArrayList<Palabras> palabras = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        App app = new App();
        app.addPalabra("Hola", "Hello");
        app.addPalabra("Adios", "Goodbye");
        app.addPalabra("Buenos días", "Good morning");
        app.addPalabra("Buenas tardes", "Good afternoon");
        app.addPalabra("Buenas noches", "Good night");
        app.addPalabra("Gracias", "Thank you");
        app.addPalabra("De nada", "You're welcome");
        app.addPalabra("Por favor", "Please");
        app.addPalabra("Lo siento", "I'm sorry");
        app.addPalabra("Sí", "Yes");
        app.addPalabra("No", "No");
        app.addPalabra("¿Cómo estás?", "How are you?");
        app.addPalabra("Comida", "Food");
        app.addPalabra("Agua", "Water");
        app.addPalabra("Casa", "House");
        app.addPalabra("Casa", "Home");
        app.addPalabra("Apartamento", "Apartment");
        app.addPalabra("Coche", "Car");
        app.addPalabra("Bicicleta", "Bicycle");
        app.addPalabra("Desatuno", "Breakfast");
        app.addPalabra("Almuerzo", "Lunch");
        app.mostrarPalabras();
    }

    public void addPalabra(String espaniol, String ingles) {
        palabras.add(new Palabras(espaniol, ingles));
    }

    public void mostrarPalabras() {
        for (Palabras palabra : palabras) {
            System.out.println(palabra);
        }
    }
}

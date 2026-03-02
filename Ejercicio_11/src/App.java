import java.util.HashMap;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        HashMap<String, Palabra> traductor = new HashMap<String, Palabra>();

        traductor.put("amanecer", new Palabra("sunrise", "sustantivo"));
        traductor.put("desafío", new Palabra("challenge", "sustantivo"));
        traductor.put("esperanza", new Palabra("hope", "sustantivo"));
        traductor.put("libertad", new Palabra("freedom", "sustantivo"));
        traductor.put("fortaleza", new Palabra("strength", "sustantivo"));
        traductor.put("sabiduría", new Palabra("wisdom", "sustantivo"));
        traductor.put("alegría", new Palabra("joy", "sustantivo"));
        traductor.put("tristeza", new Palabra("sadness", "sustantivo"));
        traductor.put("sueño", new Palabra("dream", "sustantivo"));
        traductor.put("recuerdo", new Palabra("memory", "sustantivo"));
        traductor.put("camino", new Palabra("path", "sustantivo"));
        traductor.put("cambio", new Palabra("change", "sustantivo"));
        traductor.put("miedo", new Palabra("fear", "sustantivo"));
        traductor.put("amistad", new Palabra("friendship", "sustantivo"));
        traductor.put("amor", new Palabra("love", "sustantivo"));
        traductor.put("éxito", new Palabra("success", "sustantivo"));
        traductor.put("fracaso", new Palabra("failure", "sustantivo"));
        traductor.put("trabajo", new Palabra("work", "sustantivo"));
        traductor.put("tiempo", new Palabra("time", "sustantivo"));
        traductor.put("vida", new Palabra("life", "sustantivo"));

        System.out.println("Ingrese una palabra: ");
        Scanner sc = new Scanner(System.in);
        String palabra = sc.nextLine().toLowerCase();
        sc.close();

        if (traductor.containsKey(palabra)) {
            Palabra p = traductor.get(palabra);
            System.out.println(palabra + " = " + p.getTraduccion() + " (" + p.getCategoria() + ")");
        } else {
            System.out.println("NULL = La palabra no se encuentra en el traductor."); 
        }
    }
}

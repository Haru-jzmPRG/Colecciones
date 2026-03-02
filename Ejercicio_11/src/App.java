import java.util.ArrayList;
import java.util.Collections;
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
        
        ArrayList<String> palabras = new ArrayList<>(traductor.keySet());

        int aciertos = 0;
        int fracasos = 0;

        Scanner sc2 = new Scanner(System.in);
            Collections.shuffle(palabras);
        for (int i = 0; i < 5; i++) {
            String palabraActual = palabras.get(i);
            System.out.println("Palabra a traducir " + palabraActual);
            System.out.print("Ingrese la traducción: ");
            String palabra2 = sc2.nextLine().toLowerCase();
            Palabra p = traductor.get(palabraActual);
            if (p.getTraduccion().equals(palabra2)) {
                aciertos++;
                System.out.println("Muy Bien!");
            } else {
                fracasos++;
                System.out.println("Incorrecto, la traducción es: " + p.getTraduccion());
            }
        }

        sc2.close();

        System.out.println("Resultados:");
        System.out.println("Aciertos: " + aciertos);
        System.out.println("Fracasos: " + fracasos);

    }

}

import java.util.HashMap;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        HashMap<String, String> traductor = new HashMap<String, String>();

        traductor.put("amanecer", "sunrise");
        traductor.put("desafío", "challenge");
        traductor.put("esperanza", "hope");
        traductor.put("libertad", "freedom");
        traductor.put("fortaleza", "strength");
        traductor.put("sabiduría", "wisdom");
        traductor.put("alegría", "joy");
        traductor.put("tristeza", "sadness");
        traductor.put("sueño", "dream");
        traductor.put("recuerdo", "memory");
        traductor.put("camino", "path / way");
        traductor.put("cambio", "change");
        traductor.put("miedo", "fear");
        traductor.put("amistad", "friendship");
        traductor.put("amor", "love");
        traductor.put("éxito", "success");
        traductor.put("fracaso", "failure");
        traductor.put("trabajo", "work");
        traductor.put("tiempo", "time");
        traductor.put("vida", "life");

        System.out.println("Ingrese una palabra: ");
        Scanner sc = new Scanner(System.in);
        String palabra = sc.nextLine().toLowerCase();
        sc.close();

        if (traductor.containsKey(palabra)) {
            System.out.println(palabra + " = " + traductor.get(palabra));
        } else {
            System.out.println("NULL = La palabra no se encuentra en el traductor.");
        }
    }
}

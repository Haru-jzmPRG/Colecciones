import java.util.HashMap;
import java.util.Map;

public class Credenciales {
    private final Map<String, String> credenciales = new HashMap<>();

    public void registrar(String usuario, String contrasenia) {
        credenciales.put(usuario, contrasenia);
    }

    public boolean validar(String usuario, String contrasenia) {
        return credenciales.containsKey(usuario)
            && credenciales.get(usuario).equals(contrasenia);
    }

    public boolean isEmpty() {
        return credenciales.isEmpty();
    }
}
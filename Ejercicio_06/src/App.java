public class App {

    private final Credenciales credenciales = new Credenciales();

    public App() {
        credenciales.registrar("Alondra", "123456");
        credenciales.registrar("Maria", "123456");
        credenciales.registrar("Juan", "123456");
    }

    public static void main(String[] args) throws Exception {
        App app = new App();
        String usuario;
        String contrasenia;
        int oportunidades = 3;

        do {
            System.out.print("Ingresa el usuario: ");
            usuario = System.console().readLine();
            System.out.print("Ingresa la contraseña: ");
            contrasenia = System.console().readLine();
            System.out.println();

            if (!app.credenciales.validar(usuario, contrasenia)) {
                oportunidades--;
                System.out.println("Usuario o contraseña incorrectos. Te quedan " + oportunidades + " oportunidades.");
                System.out.println();
            } else {
                System.out.println("¡Bienvenido, " + usuario + "!");
                System.out.println();
                break;
            }
        } while (oportunidades > 0);
    }
}
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        HashMap<String, Double> productos = new HashMap<String, Double>();

        productos.put("avena", 2.21);
        productos.put("garbanzos", 2.39);
        productos.put("tomate", 1.59);
        productos.put("jengibre", 3.13);
        productos.put("quinoa", 4.50);
        productos.put("guisantes", 1.60);

        ArrayList<LineaCompra> ticket = new ArrayList<>();

        double total = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Producto: ");
        String producto = sc.nextLine().toLowerCase();

        while (!producto.equals("fin")) {
            System.out.print("Cantidad: ");
            int cantidad = Integer.parseInt(sc.nextLine());
            ticket.add(new LineaCompra(producto, productos.get(producto), cantidad));
            total += productos.get(producto) * cantidad;
            System.out.print("Producto: ");
            producto = sc.nextLine().toLowerCase();
        }
        sc.close();

        System.out.println("""
                Producto Precio Cantidad Subtotal
                ---------------------------------
                """);

        for (LineaCompra linea : ticket) {
            System.out.println(linea);
        }

        System.out.println("---------------------------------");
        System.out.println("TOTAL: " + total);

    }
}

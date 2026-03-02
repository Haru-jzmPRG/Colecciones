public class LineaCompra {
    private String producto;
    private double precio;
    private int cantidad;

    public LineaCompra(String producto, double precio, int cantidad) {
        this.producto = producto;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getProducto() {
        return producto;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    @Override 
    public String toString() {
        return String.format("%-10s", producto) + String.format( "%-8.2f", precio) 
        + String.format("%-10s", cantidad) + String.format("%-8.2f", precio * cantidad);
    }
}

package fiuba.algo3.AlgoBay;

/**
 * Created by nico on 29/10/17.
 */
public class Producto {

    private String nombre;
    private double precio;

    public Producto(String unNombre, double unPrecio){
        this.nombre = unNombre;
        this.precio = unPrecio;
    }

    public boolean Eres(String unNombre) {
        return (this.nombre == unNombre);
    }

    public double GetPrecio() {
        return this.precio;
    }
}

package fiuba.algo3.AlgoBay;

import com.sun.org.apache.regexp.internal.RE;

import java.util.ArrayList;

/**
 * Created by nico on 29/10/17.
 */
public class AlgoBay {

    private ArrayList<Producto> listaProductos;

    public AlgoBay(){
        this.listaProductos = new ArrayList<>();
    }

    public int getCantidadDeProductos() {
        return this.listaProductos.size();
    }

    public Producto agregarProductoConPrecio(String nombreProducto, double precioProducto) {
        Producto nuevoProducto = new Producto(nombreProducto, precioProducto);

        this.listaProductos.add(nuevoProducto);

        return nuevoProducto;
    }

    public Producto getProducto(String nombreProducto) {

        for (Producto unProducto: this.listaProductos) {
            if (unProducto.Eres(nombreProducto))
                return unProducto;
        }

        return null;
    }

    public Compra crearNuevaCompra() {
        return Compra.crearCompraSimple();
    }

    public void agregarProductoEnCompra(Producto unProducto, Compra unaCompra) {
        unaCompra.agregarProducto(unProducto);
    }

    public double getPrecioTotalDe(Compra unaCompra) {
        return unaCompra.getPrecio();
    }

    public Compra crearNuevaCompraConEnvio() {
        return Compra.crearCompraConEnvio();
    }

    public Compra crearNuevaCompraConGarantia() {
        return Compra.crearCompraConGarantia();
    }

    public Compra crearNuevaCompraConEnvioYGarantia() {
        return Compra.crearCompraConGarantiaYEnvio();
    }

    public Cupon crearCuponConPorcentaje(int unDescuento) {
        return (new Cupon(unDescuento));
    }

    public void agregarCuponEnCompra(Cupon unCupon, Compra unaCompra) {
        unaCompra.agregarCupon(unCupon);
    }
}

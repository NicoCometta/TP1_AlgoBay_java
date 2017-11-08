package fiuba.algo3.AlgoBay;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by nico on 29/10/17.
 */
public class Compra {

    private Envio envio;
    private Garantia garantia;
    private Cupon cuponDescuento;
    private ArrayList<Producto> listaProductos;

    private Compra(){
        this.envio = new NoEnvio();
        this.garantia = new NoGarantia();
        this.cuponDescuento = new Cupon(0);
        this.listaProductos = new ArrayList<Producto>();
    }

    public static Compra crearCompraSimple() {
        return (new Compra());
    }

    public void agregarProducto(Producto nuevoProducto) {
        this.listaProductos.add(nuevoProducto);
    }

    public double getPrecio() {
        double precioFinal = this.calcularPrecioTotal();

        precioFinal = this.garantia.getCosto(precioFinal);
        precioFinal = this.envio.getCosto(precioFinal);
        precioFinal = this.cuponDescuento.aplicar(precioFinal);

        return precioFinal;
    }

    public int cantidadDeProductos() {
        return this.listaProductos.size();
    }

    public static Compra crearCompraConEnvio() {
        Compra nuevaCompra = new Compra();
        nuevaCompra.establecerEnvioConCosto();

        return nuevaCompra;
    }

    public static Compra crearCompraConGarantia() {
        Compra nuevaCompra = new Compra();
        nuevaCompra.establecerGarantiaConCosto();

        return nuevaCompra;
    }

    public static Compra crearCompraConGarantiaYEnvio() {
        Compra nuevaCompra = new Compra();

        nuevaCompra.establecerEnvioConCosto();
        nuevaCompra.establecerGarantiaConCosto();

        return nuevaCompra;
    }

    public void agregarCupon(Cupon unCupon) {
        this.establecerCupon(unCupon);
    }

    //Metodos Privados
    private void establecerEnvioConCosto() {
        this.envio = new EnvioConCosto();
    }

    private void establecerGarantiaConCosto() {
        this.garantia = new GarantiaConCosto();
    }

    private void establecerCupon(Cupon unCupon) {
        if (unCupon.tieneMayorDescuento(this.cuponDescuento))
            this.cuponDescuento = unCupon;
    }

    private double calcularPrecioTotal(){
        double precioTotal = 0;

        for (Producto unProducto: this.listaProductos) {
            precioTotal += unProducto.GetPrecio();
        }

        return precioTotal;
    }
}

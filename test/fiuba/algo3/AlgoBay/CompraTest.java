package fiuba.algo3.AlgoBay;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by nico on 29/10/17.
 */
public class CompraTest {

    private static final double DELTA = 1e-15;

    @Test
    public void testAgregarProductosEnCompra(){

        Compra miCompra = Compra.crearCompraSimple();

        Producto producto1 = new Producto("Pepsi", 10);
        Producto producto2 = new Producto("Doritos", 21);

        miCompra.agregarProducto(producto1);
        miCompra.agregarProducto(producto2);

        Assert.assertEquals(2, miCompra.cantidadDeProductos());
    }

    @Test
    public void testCompraSimpleDe2ProductoValeLaSumaDeSusPrecios(){
        double precioFinal = 0;

        Compra miCompra = Compra.crearCompraSimple();

        Producto producto1 = new Producto("Pepsi", 10);
        Producto producto2 = new Producto("Doritos", 21);

        miCompra.agregarProducto(producto1);
        miCompra.agregarProducto(producto2);

        precioFinal = miCompra.getPrecio();

        Assert.assertEquals((10 + 21), precioFinal, DELTA);
    }

    @Test
    public void testCompraConEnvioDeUnProductoYValePrecioDelProductoMas100Pesos(){
        double precioTotal = 0;

        Compra miCompraConEnvio = Compra.crearCompraConEnvio();
    }
}

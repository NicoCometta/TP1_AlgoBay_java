package fiuba.algo3.AlgoBay;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by nico on 29/10/17.
 */
public class ProductoTest {

    private static final double DELTA = 1e-15;

    @Test
    public void testCrearProductoYVerificarSuEstado(){
        Producto miProducto = new Producto("Motorola X", 9050);

        Assert.assertTrue(miProducto.Eres("Motorola X"));

        Assert.assertEquals(9050, miProducto.GetPrecio(), DELTA);
    }
}

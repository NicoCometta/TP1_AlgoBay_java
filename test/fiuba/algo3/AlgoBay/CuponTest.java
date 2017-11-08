package fiuba.algo3.AlgoBay;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by nico on 29/10/17.
 */
public class CuponTest {

    private static final double DELTA = 1e-15;

    @Test
    public void testCrearCuponDe0DescuentoYAplicar(){
        double precio = 0;

        Cupon cuponSinDescuento = new Cupon(0);

        precio = cuponSinDescuento.aplicar(1000);

        Assert.assertEquals(1000, precio, DELTA);
    }

    @Test
    public void testCrearCuponDe20PorcientoDescuentoYAplicadoDaPrecioFinalDe800Pesos(){
        double precio = 0;

        Cupon cupon20Porciento = new Cupon(20);

        precio = cupon20Porciento.aplicar(1000);

        Assert.assertEquals(800, precio, DELTA);
    }
}

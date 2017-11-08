package fiuba.algo3.AlgoBay;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by nico on 29/10/17.
 */
public class GarantiaTest {

    private static final double DELTA = 1e-15;

    @Test
    public void testGarantiaSiempreCuesta10PorcientoDelPrecioQueSeInforme(){
        double precioTotal;

        Garantia miGarantia = new GarantiaConCosto();

        precioTotal = miGarantia.getCosto(1000);
        Assert.assertEquals(1100, precioTotal, DELTA);

        precioTotal = miGarantia.getCosto(250);
        Assert.assertEquals(275, precioTotal, DELTA);

        precioTotal = miGarantia.getCosto(2400);
        Assert.assertEquals(2640, precioTotal, DELTA);
    }
}

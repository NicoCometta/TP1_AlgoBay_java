package fiuba.algo3.AlgoBay;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by nico on 29/10/17.
 */
public class EnvioTest {

    private static final double DELTA = 1e-15;

    @Test
    public void testUnNoEnvioTieneCostoCero(){
        Envio miEnvio = new NoEnvio();

        Assert.assertEquals(100, miEnvio.getCosto(100), DELTA);
    }

    @Test
    public void testUnEnvioTieneCostoCien(){
        Envio miEnvio = new EnvioConCosto();

        Assert.assertEquals(100, miEnvio.getCosto(0), DELTA);
    }
}

package fiuba.algo3.AlgoBay;

/**
 * Created by nico on 29/10/17.
 */
public class GarantiaConCosto implements Garantia {
    @Override
    public double getCosto(double unPrecio) {
        return (unPrecio * 1.1);
    }
}

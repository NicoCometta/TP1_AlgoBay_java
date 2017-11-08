package fiuba.algo3.AlgoBay;

/**
 * Created by nico on 29/10/17.
 */
public class EnvioConCosto implements Envio {
    @Override
    public double getCosto(double unPrecio) {
        if (unPrecio > 5000)
            return unPrecio;

        return (unPrecio + 100);
    }
}

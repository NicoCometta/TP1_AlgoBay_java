package fiuba.algo3.AlgoBay;

/**
 * Created by nico on 29/10/17.
 */
public class Cupon {

    private double descuento;

    public Cupon(double unDescuento){
        this.descuento = unDescuento;
    }

    public double aplicar(double unPrecio) {
        return (unPrecio * (1 - (this.descuento/100)));
    }

    public boolean tieneMayorDescuento(Cupon cuponDescuento) {
        return (this.descuento > cuponDescuento.getDescuento());
    }

    public double getDescuento() {
        return this.descuento;
    }
}

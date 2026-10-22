
package cuenta;


public class TipoCuenta {
    private final String nombre;
    private final double tasa;
    
    public static final double ahorro=0.03;
    public static final double cheques=0.00;
    public static final double plazo=0.05;

    private TipoCuenta(String nombre, double tasa) {
        this.nombre = nombre;
        this.tasa = tasa;
    }

    public double Tasa() {
        return this.tasa;
    }
    

    @Override
    public String toString() {
        return this.nombre;
    }
    
    
}

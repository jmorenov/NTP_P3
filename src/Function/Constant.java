package Function;

/**
 * Clase para crear una constante como valor de una función.
 * 
 * @author Javier Moreno <jmorenov@correo.ugr.es>
 */
public class Constant extends Value {
    
    // Valor de la constante.
    private final double value;
    
    /**
     * Constructor de la constante.
     * @param v 
     */
    public Constant(double v) {
        value = v;
    }
    
    @Override
    public double result() {
        return value;
    }
    
    @Override
    public String toString() {
        return ""+value;
    }
}

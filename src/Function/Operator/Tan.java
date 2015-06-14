package Function.Operator;

import Function.Value;

/**
 * Clase para crear un operador tangente.
 * 
 * @author Javier Moreno <jmorenov@correo.ugr.es>
 */
public class Tan extends Operator {
    
    // Valor argumento de la tangente.
    Value f;
    
    /**
     * Constructor de la clase.
     * @param f 
     */
    public Tan(Value f) {
        this.f = f;
    }
    
    @Override
    public double result() {
        return Math.tan(f.result());
    }
    
    @Override
    public String toString() {
        return "Tan(" + f.toString() + ")";
    }
}

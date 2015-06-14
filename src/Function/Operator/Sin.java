package Function.Operator;

import Function.Value;

/**
 * Clase para crear un operador seno.
 * 
 * @author Javier Moreno <jmorenov@correo.ugr.es>
 */
public class Sin extends Operator {
    
    // Valor agumento del seno.
    Value f;
    
    /**
     * Constructor de la clase.
     * @param f 
     */
    public Sin(Value f) {
        this.f = f;
    }
    
    @Override
    public double result() {
        return Math.sin(f.result());
    }
    
    @Override
    public String toString() {
        return "Sin(" + f.toString() + ")";
    }
}

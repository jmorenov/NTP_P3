package Function.Operator;

import Function.Value;

/**
 * Clase para crear un operador de Coseno.
 * 
 * @author Javier Moreno <jmorenov@correo.ugr.es>
 */
public class Cos extends Operator {
    // Valor argumento del coseno.
    Value f;
    
    /**
     * Constructor de la clase.
     * @param f 
     */
    public Cos(Value f) {
        this.f = f;
    }
    
    @Override
    public double result() {
        return Math.cos(f.result());
    }
    
    @Override
    public String toString() {
        return "Cos(" + f.toString() + ")";
    }
}

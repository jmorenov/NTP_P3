package Function.Operator;

import Function.Value;

/**
 * Clase para crear un operador multiplicación.
 * 
 * @author Javier Moreno <jmorenov@correo.ugr.es>
 */
public class Mul extends Operator {
    // Valor primero de la multiplicación.
    Value f1;
    // Valor segundo de la multiplicación.
    Value f2;
    
    /**
     * Constructor de la clase.
     * @param f1
     * @param f2 
     */
    public Mul(Value f1, Value f2) {
        this.f1 = f1;
        this.f2 = f2;
    }
    
    @Override
    public double result() {
        return f1.result() * f2.result();
    }
    
    @Override
    public String toString() {
        return f1.toString()+"*"+f2.toString();
    }
}

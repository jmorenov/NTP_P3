package Function.Operator;

import Function.Value;

/**
 * Clase para crear un operador como valor de una función.
 * 
 * @author Javier Moreno <jmorenov@correo.ugr.es>
 */
public abstract class Operator extends Value {
    
    /**
     * Devuelve el operador en formato String.
     * @return 
     */
    public abstract String toString();
}

package Function;

/**
 * Clase abstracta para crear un valor de una función.
 * 
 * @author Javier Moreno <jmorenov@correo.ugr.es>
 */
public abstract class Value {
    
    /**
     * Devuelve el valor en formato String.
     * @return 
     */
    @Override
    public abstract String toString();
    
    /**
     * Devuelve el resultado de operar los valores.
     * @return 
     */
    public abstract double result();
}

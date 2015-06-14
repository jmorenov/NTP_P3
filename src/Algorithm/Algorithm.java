package Algorithm;

import Algorithm.Method.*;
import Function.*;

/**
 * Clase que define los algoritmos de búsqueda.
 * 
 * @author Javier Moreno <jmorenov@correo.ugr.es>
 */
public class Algorithm {
    // Método a usar en el algoritmo.
    private Method m;
    
    /**
     * Constructor de la clase.
     * @param m Method
     */
    public Algorithm(Method m) {
        setMethod(m);
    }
    
    /**
     * Añade el método a usar en el algoritmo.
     * @param m Method
     */
    public void setMethod(Method m) {
        this.m = m;
    }
    
    /**
     * Inicia el algoritmo de búsqueda.
     * Devuelve el último valor obtenido.
     * @param f Function
     * @return 
     */
    public double start(Function f) {
        return m.start(f);
    }
}

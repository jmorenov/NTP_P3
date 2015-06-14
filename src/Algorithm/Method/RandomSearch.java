package Algorithm.Method;

import Function.*;

/**
 * Clase que define el método de Búsqueda Aleatoria.
 * 
 * @author Javier Moreno <jmorenov@correo.ugr.es>
 */
public class RandomSearch extends Method {
    
    // Número de iteraciones del algoritmo.
    private final int n_iter;
    
    /**
     * Constructor del método.
     * @param n_iter 
     */
    public RandomSearch(int n_iter) {
        super();
        this.n_iter = n_iter;
    }
    
    @Override
    public String toString() {
        return "Búsqueda Aleatoria Simple";
    }
    
    @Override
    public double start(Function f) {
        for(int n = 0; n < n_iter; n++) {
            for(int i = 0; i < f.n_vars; i++) {
                f.getVar(i).setValue(randDouble(f.getVar(i).range.min, f.getVar(i).range.max));
            }
            newValue(f);
        }
        return value;
    }
}

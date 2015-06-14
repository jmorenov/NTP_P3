package Algorithm.Method;

import Function.*;
import Search.SearchState;
import java.util.Observable;
import java.util.Observer;
import java.util.Random;

/**
 * Clase abstracta para definir los métodos de búsqueda.
 * 
 * @author Javier Moreno <jmorenov@correo.ugr.es>
 */
public abstract class Method implements Observer {

    // Mejor valor obtenido por el método.
    double value;
    
    /**
     * Constructor de la clase.
     */
    public Method() {
        SearchState.getInstance().addObserver(this);
        value = SearchState.getInstance().getValue();
    }
    
    /**
     * Se llama cuando el método encuentra un nuevo valor, 
     * solo actualiza el mejor si es mayor que este.
     * @param f Function
     */
    public void newValue(Function f) {
        if(f.result() > value)
            SearchState.getInstance().update(f);
    }
    
    /**
     * Actualiza el mejor valor obtenido.
     * @param o
     * @param arg 
     */
    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof SearchState) {
            value = ((SearchState) o).getValue();
        }
    }
    
    /**
     * Devuelve la descripción del método.
     * @return 
     */
    @Override
    public abstract String toString();
    
    /**
     * Inicia la búsqueda.
     * @param f
     * @return 
     */
    public abstract double start(Function f);
    
    /**
     * Devuelve un double aleatorio entre el rango min-max.
     * @param min
     * @param max
     * @return 
     */
    public static double randDouble(double min, double max) {
        Random rand = new Random();
        double randomValue = min + (max - min) * rand.nextDouble();
        return randomValue;
    }
}

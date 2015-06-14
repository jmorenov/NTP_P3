package Search;

import Function.Function;
import java.util.Observable;

/**
 * Clase que controla el mejor resultado de los algoritmos de búsqueda.
 * 
 * @author Javier Moreno <jmorenov@correo.ugr.es>
 */
public class SearchState extends Observable {

    // Instancia de la clase para usarla como Singleton.
    private static SearchState instance;
    // Mejor resultado encontrado.
    private double value;
    // Función que ha generado el mejor resultado.
    private Function f;
    
    /**
     * Constructor de la clase.
     */
    public SearchState() {
        value = Double.NEGATIVE_INFINITY;
    }
    
    /**
     * Devuelve la instancia de la clase o la crea si aún no lo estaba.
     * @return instance
     */
    public static SearchState getInstance() {
        if(instance == null)
            instance = new SearchState();
        return instance;
    }
    
    /**
     * Notifica a los algoritmos (observadores) que el mejor valor ha cambiado.
     */
    public void valueChanged() {
        setChanged();
        notifyObservers();
    }

    /**
     * Actualiza el mejor valor y la función que lo ha generado.
     * Notifica a los algoritmos (observadores) que el mejor valor ha cambiado.
     * @param f Function
     */
    public synchronized void update(Function f) {
        if(value < f.result()) {
            this.f = new Function(f);
            this.value = this.f.result();
            System.out.println("New Value: "+value);
            valueChanged();
        }
    }

    /**
     * Devuelve el mejor valor encontrado.
     * @return value
     */
    public double getValue() {
        return value;
    }
    
    /**
     * Devuelve la función que ha generado el mejor valor.
     * @return f
     */
    public Function getFunction() {
        return f;
    }
}

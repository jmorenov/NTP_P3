package Search;

import Algorithm.*;
import Function.*;
import java.util.ArrayList;
import java.util.concurrent.*;

/**
 * Clase que controla la búsqueda.
 * 
 * @author Javier Moreno <jmorenov@correo.ugr.es>
 */
public class Search {
 
    // Lista de algoritmos que se usan.
    private final ArrayList<Algorithm> algs = new ArrayList<>();
    // Función a optimizar.
    private Function f;
    // Valor máximo obtenido.
    private double value;
    
    /**
     * Añade la función a optimizar.
     * @param f Función.
     */
    public void setFunction(Function f) {
        this.f = f;
    }
    
    /**
     * Devuelve la función con los valores que dan el mejor resultado.
     * @return f
     */
    public Function getResult() {
        return f;
    }
    
    /**
     * Devuelve el mejor valor encontrado.
     * @return value
     */
    public double getValue() {
        return value;
    }
    
    /**
     * Añade un algoritmo a la búsqueda.
     * @param alg 
     */
    public void addAlgorithm(Algorithm alg) {
        algs.add(alg);
    }
    
    /**
     * Inicia la búsqueda.
     */
    public void start() {
        // Uso del servicio ExecutorService para iniciar las tareas con hebras en paralelo.
        ExecutorService ex = Executors.newCachedThreadPool();
        algs.stream().forEach((alg) -> {
            ex.execute(new AlgorithmRunnable(alg));
        });
        ex.shutdown();
        while(!ex.isTerminated()){
        }
        // Se almacenan los resultados.
        this.f = SearchState.getInstance().getFunction();
        this.value = SearchState.getInstance().getValue();
    }
    
    /**
     * Clase para definir los algoritmos con interfaz Runnable.
     */
    private class AlgorithmRunnable implements Runnable {
        private final Algorithm a;
        
        /**
         * Constructor de la clase
         * @param a Algorithm
         */
        public AlgorithmRunnable(Algorithm a) {
            this.a = a;
        }
        
        /**
         * Inicia el algoritmo.
         */
        @Override
        public void run() {
            double v = a.start(f);
        }
    }
}

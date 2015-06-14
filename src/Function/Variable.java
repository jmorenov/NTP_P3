package Function;

/**
 * Clase para crear una variable como valor de una función.
 * 
 * @author Javier Moreno <jmorenov@correo.ugr.es>
 */
public class Variable extends Value {
    
    // Valor inicial de la variable.
    private double value = Double.NaN;
    // Identificador de la variable.
    private final int id;
    // Rango de valores de la variable.
    public Range range;
    
    /**
     * Constructor de la variable
     * @param id Identificador de la variable.
     */
    public Variable(int id) {
        this.id =  id;
    }
    
    /**
     * Añade valor a la variable
     * @param v 
     */
    public void setValue(double v) {
        value = v;
    }
    
    /**
     * Añade un rango a la variable
     * @param min Mínimo valor de la variable, incluido.
     * @param max Máximo valor de la variable, incluido
     */
    public void setRange(double min, double max) {
        range = new Range(min, max);
    }
    
    @Override
    public double result() {
        return value;
    }
    
    @Override
    public String toString() {
        return "X"+id;
    }
    
    /**
     * Clase que define el rango de una variable.
     */
    public class Range {
        // Máximo valor.
        public double max;
        // Mínimo valor.
        public double min;
        
        /**
         * Constructor del rango.
         * @param min
         * @param max 
         */
        public Range(double min, double max) {
            this.min = min;
            this.max = max;
        }
    }
    
}

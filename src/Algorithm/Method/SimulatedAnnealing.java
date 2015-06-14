package Algorithm.Method;

import Function.*;

/**
 * Clase que define el método de Recocido Simulado.
 * 
 * @author Javier Moreno <jmorenov@correo.ugr.es>
 */
public class SimulatedAnnealing extends Method {

    /**
     * Constructor del método.
     */
    public SimulatedAnnealing() {
        super();
    }
    
    /**
     * Controla la probabilidad de aceptar la nueva solución.
     * @param energy
     * @param newEnergy
     * @param temperature
     * @return 
     */
    public static double acceptanceProbability(double energy, double newEnergy, double temperature) {
        // If the new solution is better, accept it
        if (newEnergy > energy) {
            return 1.0;
        }
        // If the new solution is worse, calculate an acceptance probability
        return Math.exp((energy - newEnergy) / temperature);
    }

    
    @Override
    public String toString() {
        return "Recocido Simulado.";
    }
    
    @Override
    public double start(Function f) {
        // Set initial temp
        double temp = 10000;
        
        // Cooling rate
        double coolingRate = 0.003;
        
        for(int i = 0; i < f.n_vars; i++)
                f.getVar(i).setValue(randDouble(f.getVar(i).range.min, f.getVar(i).range.max));
        newValue(f);
        
        // Loop until system has cooled
        while (temp > 1) {
            Function f1 = new Function(f);
            int var1 = (int) (f.n_vars * Math.random());
            int var2 = (int) (f.n_vars * Math.random());
            
            double var1_value = f1.getVar(var1).result();
            double var2_value = randDouble(f.getVar(var2).range.min, f.getVar(var2).range.max);
            f1.setVarValue(var1, var2_value);
            f1.setVarValue(var2, var1_value);
            
            // Get energy of solutions
            double currentEnergy = f.result();
            double neighbourEnergy = f1.result();
            
            // Decide if we should accept the neighbour
            if (acceptanceProbability(currentEnergy, neighbourEnergy, temp) > Math.random()) {
                f = new Function(f1);
            }
            
            newValue(f);
            
            // Cool system
            temp *= 1-coolingRate;
        }
        
        
        return value;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithm.Method;

import Function.*;
import java.util.Random;

/**
 *
 * @author jmorenov
 */
public class RandomSearch extends Method {
    
    private final Random rand;
    private final int n_iter;
    
    public RandomSearch(int n_iter) {
        super();
        this.n_iter = n_iter;
        rand = new Random();
    }
    
    @Override
    public String toString() {
        return "Búsqueda Aleatoria Simple";
    }
    
    @Override
    public double start(Function f) {
        for(int n = 0; n < n_iter; n++) {
            for(int i = 0; i < f.n_vars; i++) {
                double r = f.getVar(i).range.max - f.getVar(i).range.min;
                f.getVar(i).setValue((rand.nextDouble()*r) + f.getVar(i).range.min);
            }
            newValue(f);
        }
        return value;
    }
}

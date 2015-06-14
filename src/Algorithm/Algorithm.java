/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithm;

import Algorithm.Method.*;
import Function.*;

/**
 *
 * @author jmorenov
 */
public class Algorithm {
    private Method m;
    
    public Algorithm(Method m) {
        setMethod(m);
    }
    
    public void setMethod(Method m) {
        this.m = m;
    }
    
    public double start(Function f) {
        return m.start(f);
    }
}

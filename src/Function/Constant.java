/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Function;

/**
 *
 * @author jmorenov
 */
public class Constant extends Value {
    private final double value;
    
    public Constant(double v) {
        value = v;
    }
    
    @Override
    public double result() {
        return value;
    }
    
    @Override
    public String toString() {
        return ""+value;
    }
}

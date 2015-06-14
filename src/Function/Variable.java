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
public class Variable extends Value {
    private double value = Double.NaN;
    private final int id;
    public Range range;
    
    public Variable(int id) {
        this.id =  id;
    }
    
    public void setValue(double v) {
        value = v;
    }
    
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
    
    public class Range {
        public double max;
        public double min;
        
        public Range(double min, double max) {
            this.min = min;
            this.max = max;
        }
    }
    
}

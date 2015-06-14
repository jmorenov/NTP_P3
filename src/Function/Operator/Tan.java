/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Function.Operator;

import Function.Value;

/**
 *
 * @author jmorenov
 */
public class Tan extends Operator {
    Value f;
    
    public Tan(Value f) {
        this.f = f;
    }
    
    @Override
    public double result() {
        return Math.tan(f.result());
    }
    
    @Override
    public String toString() {
        return "Tan(" + f.toString() + ")";
    }
}

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
public class Cos extends Operator {
    Value f;
    
    public Cos(Value f) {
        this.f = f;
    }
    
    @Override
    public double result() {
        return Math.cos(f.result());
    }
    
    @Override
    public String toString() {
        return "Cos(" + f.toString() + ")";
    }
}

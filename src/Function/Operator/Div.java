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
public class Div extends Operator {
    Value f1;
    Value f2;
    
    public Div(Value f1, Value f2) {
        this.f1 = f1;
        this.f2 = f2;
    }
    
    @Override
    public double result() {
        return f1.result() / f2.result();
    }
    
    @Override
    public String toString() {
        return f1.toString()+"/"+f2.toString();
    }
}

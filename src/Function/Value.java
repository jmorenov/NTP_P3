/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Function;

import java.util.ArrayList;

/**
 *
 * @author jmorenov
 */
public abstract class Value {
    
    ArrayList<Variable> vars = new ArrayList<>();
    
    @Override
    public abstract String toString();
    
    public abstract double result();
}

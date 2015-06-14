/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithm.Method;

import Function.*;
import Search.SearchState;
import java.util.Observable;
import java.util.Observer;
import java.util.Random;

/**
 *
 * @author jmorenov
 */
public abstract class Method implements Observer {

    double value;
    
    public Method() {
        SearchState.getInstance().addObserver(this);
        value = SearchState.getInstance().getValue();
    }
    
    public void newValue(Function f) {
        if(f.result() > SearchState.getInstance().getValue())
            SearchState.getInstance().update(f);
    }
    
    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof SearchState) {
            //value = ((SearchState) o).getValue();
        }
    }
    
    @Override
    public abstract String toString();
    
    public abstract double start(Function f);
    
    public static double randDouble(double min, double max) {
        Random rand = new Random();
        double randomValue = min + (max - min) * rand.nextDouble();
        return randomValue;
    }
}

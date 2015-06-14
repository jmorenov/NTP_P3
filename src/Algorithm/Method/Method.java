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
        if(f.result() > value)
            SearchState.getInstance().update(f);
    }
    
    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof SearchState) {
            value = ((SearchState) o).getValue();
        }
    }
    
    @Override
    public abstract String toString();
    
    public abstract double start(Function f);
}

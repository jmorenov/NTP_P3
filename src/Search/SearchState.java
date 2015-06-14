/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Search;

import Function.Function;
import java.util.Observable;

/**
 *
 * @author jmorenov
 */
public class SearchState extends Observable {

    private static SearchState instance;
    private double value;
    private Function f;
    
    public SearchState() {
        value = Double.NEGATIVE_INFINITY;
    }
    
    public static SearchState getInstance() {
        if(instance == null)
            instance = new SearchState();
        return instance;
    }
    
    public void valueChanged() {
        setChanged();
        notifyObservers();
    }

    public synchronized void update(Function f) {
        this.value = f.result();
        this.f = f;
        valueChanged();
        System.out.println("New Value: "+value);
    }

    public double getValue() {
        return value;
    }
}

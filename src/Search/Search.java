/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Search;

import Algorithm.*;
import Function.*;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.*;

/**
 *
 * @author jmorenov
 */
public class Search {
 
    private final ArrayList<Algorithm> algs = new ArrayList<>();
    private Function f;
    
    public void setFunction(Function f) {
        this.f = f;
    }
    
    public void addAlgorithm(Algorithm alg) {
        algs.add(alg);
    }
    
    public void start() {
        ExecutorService ex = Executors.newCachedThreadPool();
        algs.stream().forEach((alg) -> {
            ex.execute(new AlgorithmRunnable(alg));
        });
        ex.shutdown();
        while(!ex.isTerminated()){
        }
    }
    
    private class AlgorithmRunnable implements Runnable {
        private final Algorithm a;
        private double value;
        
        public AlgorithmRunnable(Algorithm a) {
            this.a = a;
        }
        
        @Override
        public void run() {
            double v = a.start(f);
        }
    }
}

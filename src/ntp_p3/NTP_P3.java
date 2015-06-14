/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ntp_p3;

import Algorithm.*;
import Algorithm.Method.*;
import Function.*;
import Function.Operator.*;
import Search.*;

/**
 *
 * @author jmorenov
 */
public class NTP_P3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Function f = new Function(2);

        f.Sin(new Mul(new Mul(new Constant(20), new Constant(3.14)), f.getVar(1)));
        f.Mul(1);
        f.Sum(new Mul(f.getVar(0), new Sin(new Mul(new Mul(new Constant(4), new Constant(3.14)), f.getVar(0)))));
        f.Sum(new Constant(21.5));
        
        f.getVar(0).setRange(-3, 12.1);
        f.getVar(1).setRange(4.1, 5.8);
        
        Search e = new Search();
        e.setFunction(f);
        e.addAlgorithm(new Algorithm(new RandomSearch(10000)));
        e.addAlgorithm(new Algorithm(new SimulatedAnnealing()));
        e.start();
        
        System.out.println("Best Value: "+e.getValue());
    }
    
}

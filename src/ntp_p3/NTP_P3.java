package ntp_p3;

import Algorithm.*;
import Algorithm.Method.*;
import Function.*;
import Function.Operator.*;
import Search.*;

/**
 * Clase principal para probar la funcionalidad de la práctica.
 * 
 * @author Javier Moreno <jmorenov@correo.ugr.es>
 */
public class NTP_P3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Objeto f de la clase Function que contendrá la función a optimizar.
        Function f = new Function(2);

        // Se definen las operaciones, constantes y variables de la función.
        f.Sin(new Mul(new Mul(new Constant(20), new Constant(3.14)), f.getVar(1)));
        f.Mul(1);
        f.Sum(new Mul(f.getVar(0), new Sin(new Mul(new Mul(new Constant(4), new Constant(3.14)), f.getVar(0)))));
        f.Sum(new Constant(21.5));
        
        // Rango de las variables.
        f.getVar(0).setRange(-3, 12.1);
        f.getVar(1).setRange(4.1, 5.8);
        
        // Objeto e de la clase Search que controla la búsqueda de valores máximos.
        Search e = new Search();
        // Se añade la función a optimizar.
        e.setFunction(f);
        // Se añaden los algoritmos de búsqueda que se quieran usar.
        e.addAlgorithm(new Algorithm(new RandomSearch(10000)));
        e.addAlgorithm(new Algorithm(new SimulatedAnnealing()));
        // Inicio de la búsqueda.
        e.start();
        
        // Se escribe por pantalla la función a optimizar.
        System.out.println("f()="+f.toString());
        // Se escribe por pantalla el mejor valor encontrado.
        System.out.println("Best Value: "+e.getValue());
    }
}

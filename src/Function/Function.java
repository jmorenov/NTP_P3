package Function;

import java.util.ArrayList;
import Function.Operator.*;

/**
 * Clase que define una función compleja.
 * 
 * @author Javier Moreno <jmorenov@correo.ugr.es>
 */
public class Function {
    
    // Número de variables en la función.
    public int n_vars;
    // Valores de la función.
    private Value f;
    // Lista con las variables de la función.
    private ArrayList<Variable> vars = new ArrayList<>();
    
    /**
     * Constructor de copia.
     * @param f1 
     */
    public Function(Function f1) {
        n_vars = f1.n_vars;
        f = f1.getFunction();
        vars.clear();
        for(int i=0; i<f1.n_vars; i++)
            vars.add(f1.getVar(i));
    }
    
    /**
     * Constructor de la clase.
     * @param n_vars Número de variables.
     */
    public Function(int n_vars) {
        initVars(n_vars);
    }
    
    /**
     * Constructor de la clase.
     * @param n_vars Número de variables.
     * @param f1 Valores a añadir a la función.
     */
    public Function(int n_vars, Value f1) {
        initVars(n_vars);
        setFunction(f1);
    }
    
    /**
     * Constructor de la clase
     * @param n_vars Número de variables.
     * @param id Variable a igualar a la función.
     */
    public Function(int n_vars, int id) {
        initVars(n_vars);
        setFunction(vars.get(id));
    }
    
    /**
     * Iniciar las variables y añadirlas a la lista.
     * @param n_vars Número de variables.
     */
    private void initVars(int n_vars) {
        this.n_vars = n_vars;
        for(int i=0; i<n_vars; i++)
            vars.add(new Variable(i));
    }
    
    /**
     * Devuelve los valores de la función.
     * @return 
     */
    public Value getFunction() {
        return f;
    }
    
    /**
     * Devuelve una variable.
     * @param id Identificador de la variable.
     * @return 
     */
    public Variable getVar(int id) {
        return vars.get(id);
    }
    
    /**
     * Añade valor a una variable.
     * @param id Identificador de la variable.
     * @param value Valor a añadir.
     */
    public void setVarValue(int id, double value) {
        vars.get(id).setValue(value);
    }
    
    /**
     * Añade valores a una función.
     * @param f1 
     */
    public void setFunction(Value f1) {
        this.f = f1;
    }
    
    // Operadores binarios
    public void Sum(Value f1) {
        f = new Sum(f, f1);
    }
    public void Sum(int id) {
        f = new Sum(f, vars.get(id));
    }
    public void Minus(Value f1) {
        f = new Minus(f, f1);
    }
    public void Minus(int id) {
        f = new Minus(f, vars.get(id));
    }
    public void Mul(Value f1) {
        f = new Mul(f, f1);
    }
    public void Mul(int id) {
        f = new Mul(f, vars.get(id));
    }
    public void Div(Value f1) {
        f = new Div(f, f1);
    }
    public void Div(int id) {
        f = new Div(f, vars.get(id));
    }
    
    
    // Operadores unitarios
    public void Cos(Value f1) {
        f = new Cos(f1);
    }
    public void Cos(int id) {
        f = new Cos(vars.get(id));
    }
    public void Sin(Value f1) {
        f = new Sin(f1);
    }
    public void Sin(int id) {
        f = new Sin(vars.get(id));
    }
    public void Tan(Value f1) {
        f = new Tan(f1);
    }
    public void Tan(int id) {
        f = new Tan(vars.get(id));
    }
    
    /**
     * Devuelve el resultado de la función.
     * @return 
     */
    public double result() {
        return f.result();
    }
    
    /**
     * Devuelve la función con formato String.
     * @return 
     */
    @Override
    public String toString() {
        return f.toString();
    }
}

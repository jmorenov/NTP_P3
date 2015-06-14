/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Function;

import java.util.ArrayList;
import Function.Operator.*;

/**
 *
 * @author jmorenov
 */
public class Function {
    
    public int n_vars;
    private Value f;
    private ArrayList<Variable> vars = new ArrayList<>();
    
    public Function(int n_vars) {
        initVars(n_vars);
    }
    
    public Function(int n_vars, Value f1) {
        initVars(n_vars);
        setFunction(f1);
    }
    
    public Function(int n_vars, int id) {
        initVars(n_vars);
        setFunction(vars.get(id));
    }
    
    private void initVars(int n_vars) {
        this.n_vars = n_vars;
        for(int i=0; i<n_vars; i++)
            vars.add(new Variable(i));
    }
    
    public Value getFunction() {
        return f;
    }
    
    public Variable getVar(int id) {
        return vars.get(id);
    }
    
    public void setVarValue(int id, double value) {
        vars.get(id).setValue(value);
    }
    
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
    /*public void Exp(Function f1) {
        f = new Exp(f1);
    }
    public void Exp(int id) {
        f = new Exp(vars.get(id));
    }*/
    
    public double result() {
        return f.result();
    }
    
    @Override
    public String toString() {
        return f.toString();
    }
}

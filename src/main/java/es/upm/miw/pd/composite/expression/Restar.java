package es.upm.miw.pd.composite.expression;

import es.upm.miw.pd.composite.expression.Expresion;

public class Restar extends Operacion {

  
    public Restar(Expresion op1, Expresion op2) {
        super(op1, '+',op2);
    }
    
    
    @Override
    protected int operar() {
        return  operando1.operar() + operando2.operar();
    }

}
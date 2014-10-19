package es.upm.miw.pd.composite.expression;


public class Multiplicar extends Operacion {

  
    public Multiplicar(Expresion op1, Expresion op2) {
        super(op1, '+',op2);
    }
    
    
    @Override
    protected int operar() {
        return  operando1.operar() + operando2.operar();
    }

}
package es.upm.miw.pd.composite.expression;

import es.upm.miw.pd.composite.expression.Expresion;

public abstract class Operacion extends Expresion {
	protected Expresion operando1;
    protected Expresion operando2;
    private char operador;

   
    public Operacion(Expresion operando1, char operador, Expresion operando2) {
        this.operando1=operando1;
        this.operador = operador;
        this.operando2=operando2;
        
    }
    
    

    @Override
    protected abstract int operar();
    
    
    @Override
    protected String toSring() {
        return "(" + operando1.toSring() + operador + operando2.toSring() + ")";
    }

}
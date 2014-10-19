package es.upm.miw.pd.composite.expression;


public class Numero extends Expresion {
    private int numero;

    public Numero(int numero) {
        this.numero = numero;
    }

    @Override
    protected int operar() {
        return numero;
    }

    @Override
    protected String toSring() {
        return String.valueOf(numero);     
    }
    
}
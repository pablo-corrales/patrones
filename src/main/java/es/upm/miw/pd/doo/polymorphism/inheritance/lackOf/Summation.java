package es.upm.miw.pd.doo.polymorphism.inheritance.lackOf;

public class Summation{
    private final int operator1, operator2;

    public Summation(final int operator1, final int operator2) {
        this.operator1 = operator1;
        this.operator2 = operator2;
    }

    public int getOperator1() {
        return operator1;
    }

    public int getOperator2() {
        return operator2;
    }

    public int sum() {
        return this.getOperator1() + this.getOperator2();
    }
    
    public int multiplicacion() {
        return this.getOperator1() * this.getOperator2();
    }
    
       @Override
    public String toString() {
        return "[" + this.getOperator1() + "+" + this.getOperator2() + "]";
    }

}

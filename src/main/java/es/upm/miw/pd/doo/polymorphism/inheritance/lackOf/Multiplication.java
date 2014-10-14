package es.upm.miw.pd.doo.polymorphism.inheritance.lackOf;


public class Multiplication extends Operations{
	private int operador1;
	private int operador2;
	private int resultado;
	
	
	public int getOperador1() {
		return operador1;
	}


	public void setOperador1(int operador1) {
		this.operador1 = operador1;
	}


	public int getOperador2() {
		return operador2;
	}


	public void setOperador2(int operador2) {
		this.operador2 = operador2;
	}


	public int getResultado() {
		return resultado;
	}

	public void setResultado(int resultado) {
		this.resultado = resultado;
	}

	

    public Multiplication(int op1, int op2) {
    	this.setOperador1(op1);
    	this.setOperador2(op2);
    	
    	this.setResultado(this.getOperador1() * this.getOperador2());
    
    		    	
        System.out.println("Multiplication de "+this.getOperador1()+" * "+this.getOperador2()+" = "+this.getResultado());
        
    
    }

}

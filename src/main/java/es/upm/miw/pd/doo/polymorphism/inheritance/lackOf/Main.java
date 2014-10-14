package es.upm.miw.pd.doo.polymorphism.inheritance.lackOf;

import es.upm.miw.pd.doo.polymorphism.inheritance.lackOf.OperationsHandler;

public class Main {

	public static void main(String[] args){
		
		OperationsHandler op = new OperationsHandler();
				
		op.ejecuta(new Addition(1,2));
		op.ejecuta(new Substraction(4,3));
				
		
	}

   
}

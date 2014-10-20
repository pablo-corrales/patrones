package es.upm.miw.pd.factorymethod.naturalnumber;
import es.upm.miw.pd.factorymethod.naturalnumber.NaturalNumberManager;

public class MainNaturalNumber {
	
	public static void main(String args[]){
		int numero;
		
        NaturalNumberManager naturalNumberManager = new NaturalNumberManager();
        
        //Español
        numero = 2;
        naturalNumberManager.setCreator(new NaturalNumberEsCreator());
        naturalNumberManager.createNaturalNumber(numero);
        System.out.println(numero+" en Español es " +naturalNumberManager.getNaturalNumber().getTextValue());
        
        //Inglés
        numero = 5;
        naturalNumberManager.setCreator(new NaturalNumberENCreator());
        naturalNumberManager.createNaturalNumber(numero);
        System.out.println(numero+" en Inglés es "+naturalNumberManager.getNaturalNumber().getTextValue());
        
    }

}

package es.upm.miw.pd.text;

import java.util.Map;
import java.util.HashMap;

public class FactoriaCaracter {
	
	private Map<Character, Caracter> caracteres;
	private static FactoriaCaracter factoriaCaracter;
	
	
	private FactoriaCaracter(){
		caracteres = new HashMap<Character, Caracter>();
	}
	
	//Singleton
	public static FactoriaCaracter getFactoria() {
		if(factoriaCaracter == null){
			factoriaCaracter = new FactoriaCaracter();
		}
		return factoriaCaracter;
	}

	
	public Caracter get(char c) {
		Caracter caracter = caracteres.get(new Character(c));
		if(caracter == null){
			caracter = new Caracter(Character.valueOf(c));
			caracteres.put(Character.valueOf(c), caracter);
		} 
		return caracter;
	}


}

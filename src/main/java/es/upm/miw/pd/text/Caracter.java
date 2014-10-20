package es.upm.miw.pd.text;

public class Caracter extends Componente{
	
	private Character caracter;
	
	public Caracter (char caracter){
		this.caracter = caracter;
	}

	@Override
	public void add(Componente componente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String dibujar(Boolean mayusculas) {
		if(mayusculas){
			return caracter.toString().toUpperCase();
		} else{
			return caracter.toString();
		}
	}

	@Override
	public Boolean isCompuesto() {
		
		return false;
	}

}

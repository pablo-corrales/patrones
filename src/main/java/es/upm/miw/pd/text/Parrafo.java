package es.upm.miw.pd.text;

public class Parrafo extends Compuesto{
	
	public Parrafo(){
	}
	
	@Override
	public void add(Componente componente) {
		if (componente.isCompuesto()) {
			throw new UnsupportedOperationException("Imposible añadir caracter");
		}
			
	}

	@Override
	public String dibujar(Boolean mayusculas) {
		// TODO Auto-generated method stub
		return null;
	}

}

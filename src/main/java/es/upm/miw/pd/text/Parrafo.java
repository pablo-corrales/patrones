package es.upm.miw.pd.text;

public class Parrafo extends Compuesto{
	
	public Parrafo(){
	}
	
	@Override
	public void add(Componente componente) {
		if (componente.isCompuesto()) {
			throw new UnsupportedOperationException("Imposible añadir caracter");
		} else {
			super.getComponente().add(componente);
		}
			
			
	}

	@Override
	public String dibujar(Boolean mayusculas) {
		String parrafoEnMayusculas = dibuja(mayusculas);
		parrafoEnMayusculas += "\n"; 
		return parrafoEnMayusculas;
		
	}

}

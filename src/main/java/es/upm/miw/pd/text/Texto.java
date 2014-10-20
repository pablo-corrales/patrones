package es.upm.miw.pd.text;

public class Texto extends Compuesto {
	
	
	public Texto(){
		
	}

	@Override
	public void add(Componente componente) {
		if (componente.isCompuesto()) {
			super.getComponente().add(componente);
		} else {
				throw new UnsupportedOperationException("Imposible añadir componente");
		}
		
	}

	@Override
	public String dibujar(Boolean mayusculas) {
		
		// TODO Auto-generated method stub
		return null;
	}

}

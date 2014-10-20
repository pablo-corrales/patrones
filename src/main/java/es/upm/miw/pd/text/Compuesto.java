package es.upm.miw.pd.text;

import java.util.ArrayList;
import java.util.List;

public abstract class Compuesto extends Componente {

	private final List<Componente> componentes = new ArrayList<Componente>();

	public List<Componente> getComponente() {
		return componentes;
	}

	
	public String dibuja(Boolean mayusculas) {
		String resultado = "";
		for (Componente componente : componentes) {
			resultado += componente.dibujar(mayusculas);
		}
		return resultado;
		
	}
	
	@Override
	public Boolean isCompuesto() {
		return true;
	}
}

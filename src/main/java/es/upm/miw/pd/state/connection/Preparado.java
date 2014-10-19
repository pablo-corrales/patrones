package es.upm.miw.pd.state.connection;

public class Preparado extends Estado {

	@Override
	public void abrir(Conexion conexion) {
		// TODO Auto-generated method stub

	}

	@Override
	public void cerrar(Conexion conexion) {
		 conexion.setEstado(new Cerrado());

	}

	@Override
	public void parar(Conexion conexion) {
		conexion.setEstado(new Parado());

	}

	@Override
	public void iniciar(Conexion conexion) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enviar(Conexion conexion, String msg) {
		conexion.getLink().enviar(conexion, msg);
		conexion.setEstado(new Esperando());
	}

	@Override
	public void recibir(Conexion conexion, int respuesta) {
		throw new UnsupportedOperationException("Acción No Permitida");
	}

}

package es.upm.miw.pd.state.connection;

public class Conexion{
	
	protected Estado estado;
	private Link link;
  
    
    public Conexion() {
    	
        this.setEstado(new Cerrado());
        
        
    }
    
    public void abrir() {
        this.estado.abrir(this);
    }

    public void cerrar() {
        this.estado.cerrar(this);
    }

    public void parar() {
        this.estado.parar(this);
    }

    public void iniciar() {
        this.estado.iniciar(this);
    }

    public void enviar(String msg) {
        this.estado.enviar(this, msg);
    }

	public void recibir(int respuesta) {
        this.estado.recibir(this,respuesta);
    }

    public Estado getEstado() {
        return this.estado;
    }
    
    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
    public Link getLink() {
		return link;
	}

	public void setLink(Link link) {
		this.link = link;
	}
}

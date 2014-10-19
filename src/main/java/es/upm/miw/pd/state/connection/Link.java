package es.upm.miw.pd.state.connection;

public interface Link {
    static final int ACK = 0;

    void enviar(Conexion conexion, String msg);
    void recibir (Conexion conexion, int respuesta);
    
}

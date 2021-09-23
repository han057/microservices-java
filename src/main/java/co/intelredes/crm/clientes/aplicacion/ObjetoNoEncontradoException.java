package co.intelredes.crm.clientes.aplicacion;

public class ObjetoNoEncontradoException extends RuntimeException {

  public ObjetoNoEncontradoException() {
    super();
  }

  public ObjetoNoEncontradoException(String message) {
    super(message);
  }

  public ObjetoNoEncontradoException(String message, Throwable cause) {
    super(message, cause);
  }

  public ObjetoNoEncontradoException(Throwable cause) {
    super(cause);
  }

  protected ObjetoNoEncontradoException(String message, Throwable cause, boolean enableSuppression,
      boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }
}

package co.intelredes.crm.clientes.aplicacion.excepciones;

public class ValidacionDatosException extends RuntimeException {

  public ValidacionDatosException() {
    super();
  }

  public ValidacionDatosException(String message) {
    super(message);
  }

  public ValidacionDatosException(String message, Throwable cause) {
    super(message, cause);
  }

  public ValidacionDatosException(Throwable cause) {
    super(cause);
  }

  protected ValidacionDatosException(String message, Throwable cause, boolean enableSuppression,
      boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }
}

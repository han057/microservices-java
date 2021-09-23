package co.intelredes.crm.clientes.presentacion;

import co.intelredes.crm.clientes.aplicacion.ObjetoNoEncontradoException;
import co.intelredes.crm.clientes.aplicacion.excepciones.ValidacionDatosException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ControllerAdvice
public class ManejadorExcepciones {


  @ExceptionHandler(ObjetoNoEncontradoException.class)
  public ResponseEntity<Respuesta> objetoNoEncontrado(ObjetoNoEncontradoException e) {
    Respuesta respuesta = new Respuesta(e.getMessage());
    return new ResponseEntity<>(respuesta, HttpStatus.NOT_FOUND);
  }

  @ExceptionHandler(ValidacionDatosException.class)
  public ResponseEntity<Respuesta> validacionDominio(ValidacionDatosException e) {
    Respuesta respuesta = new Respuesta(e.getMessage());
    return new ResponseEntity<>(respuesta, HttpStatus.UNPROCESSABLE_ENTITY);
  }
}

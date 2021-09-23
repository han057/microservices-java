package co.intelredes.crm.clientes.presentacion;

import co.intelredes.crm.clientes.aplicacion.ClienteService;
import co.intelredes.crm.clientes.entidades.Cliente;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/clientes")
public class ClienteRestController {

  private ClienteService clienteService;

  public ClienteRestController(@Autowired ClienteService clienteService) {
    this.clienteService = clienteService;
  }

  @GetMapping("/{id}")
  public ResponseEntity<Cliente> crear(@PathVariable("id") long id) {
    return new ResponseEntity<>(this.clienteService.buscarPorId(id), HttpStatus.OK);
  }

  @GetMapping()
  public ResponseEntity<Collection<Cliente>> listar() {
    return new ResponseEntity<>(this.clienteService.listar(), HttpStatus.OK);
  }

  @PostMapping
  public ResponseEntity<Cliente> crear(@RequestBody Cliente cliente) {
    return new ResponseEntity<>(this.clienteService.crear(cliente), HttpStatus.CREATED);
  }
}
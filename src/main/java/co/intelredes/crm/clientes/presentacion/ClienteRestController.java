package co.intelredes.crm.clientes.presentacion;

import co.intelredes.crm.clientes.aplicacion.ClienteService;
import co.intelredes.crm.clientes.entidades.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
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

  @PostMapping()
  public Cliente crear(@RequestBody Cliente cliente) {
    return this.clienteService.crear(cliente);
  }
}
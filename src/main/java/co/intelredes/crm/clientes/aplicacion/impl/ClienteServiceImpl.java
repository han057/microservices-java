package co.intelredes.crm.clientes.aplicacion.impl;

import co.intelredes.crm.clientes.aplicacion.ClienteService;
import co.intelredes.crm.clientes.datos.ClienteRepository;
import co.intelredes.crm.clientes.entidades.Cliente;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ClienteServiceImpl implements ClienteService {

  private static final int MAX_CARACTERES_NOMBRE = 24;
  private static final int MAX_CARACTERES_APELLIDO = 14;

  private ClienteRepository clienteRepository;

  public ClienteServiceImpl(@Autowired ClienteRepository clienteRepository) {
    this.clienteRepository = clienteRepository;
  }

  @Override
  public Cliente crear(Cliente cliente) {
    Optional<Cliente> optionalCliente = Optional.of(cliente);
    if (optionalCliente.isEmpty()) {
      throw new RuntimeException("El cliente no puede ser null");
    }

    if (cliente.getNombre() == null || cliente.getNombre().isEmpty()
        || cliente.getNombre().length() > MAX_CARACTERES_NOMBRE) {
      throw new RuntimeException("El nombre del cliente no puede ser vacío");
    }

    if (cliente.getApellido() == null || cliente.getApellido().isEmpty()
        || cliente.getApellido().length() > MAX_CARACTERES_APELLIDO) {
      throw new RuntimeException("El nombre del cliente no puede ser vacío");
    }

    return this.clienteRepository.save(cliente);
  }
}

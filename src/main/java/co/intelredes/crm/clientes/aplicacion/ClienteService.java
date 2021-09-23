package co.intelredes.crm.clientes.aplicacion;

import co.intelredes.crm.clientes.entidades.Cliente;
import java.util.Collection;

public interface ClienteService {

  Cliente crear(Cliente cliente);

  Collection<Cliente> listar();

  Cliente buscarPorId(long id);
}

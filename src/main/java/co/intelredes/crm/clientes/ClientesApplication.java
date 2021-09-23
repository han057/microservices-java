package co.intelredes.crm.clientes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EntityScan("co.intelredes.crm.clientes.entidades")
@EnableJpaRepositories(basePackages = "co.intelredes.crm.clientes.datos")
@EnableTransactionManagement
public class ClientesApplication {

  public static void main(String[] args) {
    SpringApplication.run(ClientesApplication.class, args);
  }

}

package projeto.addcliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projeto.addcliente.entities.Clientes;

public interface ClienteRepository extends JpaRepository<Clientes, String> {
}
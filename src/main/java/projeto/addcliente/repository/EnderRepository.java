package projeto.addcliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projeto.addcliente.entities.Endereco;

public interface EnderRepository extends JpaRepository<Endereco, String> {
}
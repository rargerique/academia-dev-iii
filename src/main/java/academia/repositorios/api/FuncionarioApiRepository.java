package academia.repositorios.api;

import academia.entidades.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioApiRepository extends JpaRepository<Funcionario, Long> {

}

package academia.repositorios;

import academia.entidades.Funcionario;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "funcionarios", path = "funcionarios")
public interface FuncionarioRepository extends PagingAndSortingRepository<Funcionario, Long> {

    @Query("SELECT n FROM Funcionario n where n.usuario.nome = ?1")
    List<Funcionario> findByUserName(@Param("nome") String nome);

}

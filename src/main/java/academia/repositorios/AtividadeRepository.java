package academia.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import academia.entidades.Funcionario;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "atividades", path = "atividades")
public interface AtividadeRepository {

	@Query("SELECT n FROM Atividade n where n.descricao = ?1")
    List<Funcionario> findByDescricao(@Param("descricao") String descricao);
}

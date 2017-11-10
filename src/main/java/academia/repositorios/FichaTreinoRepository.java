package academia.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import academia.entidades.Funcionario;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "fichastreino", path = "fichastreino")
public interface FichaTreinoRepository {

	@Query("SELECT n FROM FichaTreino n where n.usuario.nome = ?1")
    List<Funcionario> findByUserName(@Param("nome") String nome);
}

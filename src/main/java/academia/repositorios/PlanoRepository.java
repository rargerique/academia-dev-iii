package academia.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import academia.entidades.Plano;
import academia.entidades.User;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "planos", path = "planos")
public interface PlanoRepository extends PagingAndSortingRepository<Plano, Long>{

	@Query("SELECT n FROM Plano n where n.descricao = ?1")
	List<Plano> findByDescricao(@Param("descricao") String descricao);
}

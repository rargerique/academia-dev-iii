package academia.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import academia.entidades.Restricao;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "restricoes", path="restricoes")
public interface RestricaoRepository extends PagingAndSortingRepository<Restricao, Long>{

	@Query("SELECT n FROM Restricao n where n.descricao = ?1")
	List<Restricao> findByDescricao(@Param("descricao") String descricao);
}

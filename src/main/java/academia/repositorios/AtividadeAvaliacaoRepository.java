package academia.repositorios;

import academia.entidades.AtividadeAvaliacao;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "atividadeAvaliacao", path = "atividadeAvaliacao")
public interface AtividadeAvaliacaoRepository extends PagingAndSortingRepository<AtividadeAvaliacao, Long> {

    @Query("SELECT n FROM AtividadeAvaliacao n where n.matricula.id = ?1")
    List<AtividadeAvaliacao> findByMatricula(@Param("id") String id);

}

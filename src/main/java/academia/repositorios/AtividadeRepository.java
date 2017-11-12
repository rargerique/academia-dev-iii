package academia.repositorios;

import academia.entidades.Atividade;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "atividades", path = "atividades")
public interface AtividadeRepository extends PagingAndSortingRepository<Atividade, Long> {

    @Query("SELECT n FROM Atividade n where n.descricao = ?1")
    List<Atividade> findByDescricao(@Param("descricao") String descricao);
}

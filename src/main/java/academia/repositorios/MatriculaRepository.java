package academia.repositorios;

import academia.entidades.Matricula;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "matriculas", path = "matriculas")
public interface MatriculaRepository extends PagingAndSortingRepository<Matricula, Long> {

    @Query("SELECT n FROM Matricula n where n.usuario.nome = ?1")
    List<Matricula> findByUserName(@Param("nome") String nome);

}

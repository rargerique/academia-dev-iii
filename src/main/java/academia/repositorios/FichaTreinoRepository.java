package academia.repositorios;

import academia.entidades.FichaTreino;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.data.repository.PagingAndSortingRepository;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "fichastreino", path = "fichastreino")
public interface FichaTreinoRepository extends PagingAndSortingRepository<FichaTreino, Long>{

}

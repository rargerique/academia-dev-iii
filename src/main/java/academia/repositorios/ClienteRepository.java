package academia.repositorios;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import academia.entidades.Cliente;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "clientes", path = "clientes")
public interface ClienteRepository extends PagingAndSortingRepository<Cliente, Long> {

	List<Cliente> findByNome(@Param("nome") String nome);
}

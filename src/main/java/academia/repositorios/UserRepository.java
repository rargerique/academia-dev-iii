package academia.repositorios;

import academia.entidades.User;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UserRepository extends PagingAndSortingRepository<User, Long> {
    @Query("SELECT n FROM User n where n.nome = ?1")
    List<User> findByNome(@Param("nome") String nome);
    
    @Query("SELECT n FROM User n where n.nome = ?1 and n.tipoCadastro = 'funcionario'")
    List<User> findFuncionarioByNome(@Param("nome") String nome);

    @Query("SELECT n FROM User n where n.tipoCadastro = 'funcionario'")
    List<User> findByFuncionario();
        
    @Query("SELECT n FROM User n where n.tipoCadastro = 'cliente'")
    List<User> findByCliente();
}

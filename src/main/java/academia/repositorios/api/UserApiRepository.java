package academia.repositorios.api;

import academia.entidades.User;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserApiRepository extends JpaRepository<User, Long> {

    @Query("SELECT n FROM User n where n.tipoCadastro = 'funcionario'")
    List<User> findByFuncionario();
    
    @Query("SELECT n FROM User n where n.tipoCadastro = 'cliente'")
    List<User> findByCliente();

}

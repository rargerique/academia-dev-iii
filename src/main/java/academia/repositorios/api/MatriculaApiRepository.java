package academia.repositorios.api;

import academia.entidades.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatriculaApiRepository extends JpaRepository<Matricula, Long> {

}

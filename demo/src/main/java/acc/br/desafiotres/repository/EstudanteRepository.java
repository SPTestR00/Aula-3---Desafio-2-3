package acc.br.desafiotres.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import acc.br.desafiotres.entity.EstudanteEntity;

public interface EstudanteRepository extends JpaRepository<EstudanteEntity, Integer>{

}

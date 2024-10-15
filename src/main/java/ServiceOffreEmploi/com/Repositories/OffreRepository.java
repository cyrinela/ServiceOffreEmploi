package ServiceOffreEmploi.com.Repositories;

import ServiceOffreEmploi.com.Entities.Offre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OffreRepository extends JpaRepository<Offre, Long> {
}

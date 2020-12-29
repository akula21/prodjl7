package lukas.projfinal.repository;

import lukas.projfinal.entity.ProduktGruppe1Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduktGruppe1Repository extends JpaRepository<ProduktGruppe1Entity, Long> {
}

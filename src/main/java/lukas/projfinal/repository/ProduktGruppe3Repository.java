package lukas.projfinal.repository;

import lukas.projfinal.entity.ProduktGruppe3Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduktGruppe3Repository extends JpaRepository<ProduktGruppe3Entity, Long> {
}

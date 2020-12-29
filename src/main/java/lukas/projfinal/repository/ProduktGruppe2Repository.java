package lukas.projfinal.repository;

import lukas.projfinal.entity.ProduktGruppe2Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduktGruppe2Repository extends JpaRepository<ProduktGruppe2Entity, Long> {
}

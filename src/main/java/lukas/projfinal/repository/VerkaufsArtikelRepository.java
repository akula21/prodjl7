package lukas.projfinal.repository;

import lukas.projfinal.entity.VerkaufsArtikelEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VerkaufsArtikelRepository extends JpaRepository<VerkaufsArtikelEntity, Long> {
}

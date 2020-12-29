package lukas.projfinal.repository;

import lukas.projfinal.entity.VerkaufsArtikelDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VerkaufsArtikelDetailsRepository extends JpaRepository<VerkaufsArtikelDetailsEntity, Long> {
}

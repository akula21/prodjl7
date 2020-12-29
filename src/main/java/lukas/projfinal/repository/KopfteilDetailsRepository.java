package lukas.projfinal.repository;

import lukas.projfinal.entity.KopfteilDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KopfteilDetailsRepository extends JpaRepository<KopfteilDetailsEntity, Long> {
}

package lukas.projfinal.repository;

import lukas.projfinal.entity.KopfteilEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KopfteilRepository extends JpaRepository<KopfteilEntity, Long> {
}

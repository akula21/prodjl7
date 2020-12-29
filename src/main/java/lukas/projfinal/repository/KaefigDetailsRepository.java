package lukas.projfinal.repository;

import lukas.projfinal.entity.KaefigDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KaefigDetailsRepository extends JpaRepository<KaefigDetailsEntity, Long> {
}

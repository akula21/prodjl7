package lukas.projfinal.repository;

import lukas.projfinal.entity.LogoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogoRepository extends JpaRepository<LogoEntity, Long> {
}

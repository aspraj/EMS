package domain.repository;

import domain.entities.Audit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface AuditRepository extends JpaRepository<Audit, Integer> {
}

package domain.repository;

import domain.entities.Organization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface OrganizationRepository extends JpaRepository<Organization, Integer> {
}

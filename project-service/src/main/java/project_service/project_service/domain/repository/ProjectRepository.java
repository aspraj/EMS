package project_service.project_service.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project_service.project_service.domain.entities.Project;

@Repository
interface ProjectRepository extends JpaRepository<Project, Integer> {
}

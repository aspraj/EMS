package employee_service.employee_service.domain.repository;

import employee_service.employee_service.domain.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}

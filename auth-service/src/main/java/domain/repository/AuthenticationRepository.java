package domain.repository;

import domain.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface AuthenticationRepository extends JpaRepository<User, Integer> {
}

package repoPilot.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import repoPilot.backend.entity.User;
import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
    Optional<User> findByGithubId(Long id);
}

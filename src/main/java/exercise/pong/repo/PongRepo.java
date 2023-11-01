package exercise.pong.repo;

import exercise.pong.models.CallerName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


public interface PongRepo extends JpaRepository<CallerName,String> {
}

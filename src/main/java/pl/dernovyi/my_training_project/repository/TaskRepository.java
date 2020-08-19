package pl.dernovyi.my_training_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pl.dernovyi.my_training_project.model.Task;
@RepositoryRestResource
public interface TaskRepository extends JpaRepository<Task, Long> {
}

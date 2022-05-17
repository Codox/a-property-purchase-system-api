package uk.codox.apps.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import uk.codox.apps.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}

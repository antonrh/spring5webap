package guru.springframework.spring5webapp.models.repositories;

import guru.springframework.spring5webapp.models.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}

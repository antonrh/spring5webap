package guru.springframework.spring5webapp.models.repositories;

import guru.springframework.spring5webapp.models.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}

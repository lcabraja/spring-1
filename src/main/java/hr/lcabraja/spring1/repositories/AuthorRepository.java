package hr.lcabraja.spring1.repositories;

import hr.lcabraja.spring1.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}

package hr.lcabraja.spring1.repositories;

import hr.lcabraja.spring1.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}

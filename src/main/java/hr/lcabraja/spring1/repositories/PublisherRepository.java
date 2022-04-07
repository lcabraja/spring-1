package hr.lcabraja.spring1.repositories;

import hr.lcabraja.spring1.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}

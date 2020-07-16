package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * @author John Bickerstaff
 * 15/07/2020
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}

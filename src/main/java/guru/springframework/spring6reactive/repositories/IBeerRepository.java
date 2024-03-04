package guru.springframework.spring6reactive.repositories;

import guru.springframework.spring6reactive.domain.Beer;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface IBeerRepository extends ReactiveCrudRepository<Beer, Integer> {
}

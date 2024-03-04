package guru.springframework.spring6reactive.repositories;

import guru.springframework.spring6reactive.domain.Customer;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ICustomerRepository extends ReactiveCrudRepository<Customer, Integer> {
}

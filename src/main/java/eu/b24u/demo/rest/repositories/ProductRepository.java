package eu.b24u.demo.rest.repositories;

import eu.b24u.demo.rest.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}

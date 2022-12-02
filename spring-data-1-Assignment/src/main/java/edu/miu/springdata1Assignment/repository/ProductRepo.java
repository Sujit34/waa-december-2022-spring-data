package edu.miu.springdata1Assignment.repository;

import edu.miu.springdata1Assignment.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends CrudRepository<Product,Integer> {
}

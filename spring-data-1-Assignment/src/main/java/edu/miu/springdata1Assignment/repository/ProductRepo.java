package edu.miu.springdata1Assignment.repository;

import edu.miu.springdata1Assignment.entity.Product;
import edu.miu.springdata1Assignment.entity.Review;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends CrudRepository<Product,Integer> {
    @Query(value = "SELECT p FROM Product p WHERE p.price > :price")
    List<Product> findByPriceGreaterThan(double price);
    @Query(value = "SELECT p FROM Product p inner join Category c on p.id = c.id " +
            "WHERE c.name= :name and p.price < :price")
    List<Product> findByCategory_NameAndPriceLessThan(String name, double price);
    @Query(value = "SELECT p FROM Product p WHERE p.name LIKE %:name% ")
    List<Product> findByNameContaining(String name);

}

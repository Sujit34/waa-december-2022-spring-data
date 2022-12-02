package edu.miu.springdata1Assignment.repository;

import edu.miu.springdata1Assignment.entity.Review;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepo extends CrudRepository<Review,Integer> {
}

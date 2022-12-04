package edu.miu.springdata1Assignment.controller.repository;

import edu.miu.springdata1Assignment.entity.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepo extends CrudRepository<Address,Integer> {
}

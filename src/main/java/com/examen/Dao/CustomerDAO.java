package com.examen.Dao;

import com.examen.domain.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerDAO extends CrudRepository<Customer, Long>{
    
}

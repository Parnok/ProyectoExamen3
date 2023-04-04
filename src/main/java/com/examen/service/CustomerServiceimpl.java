
package com.examen.service;

import org.springframework.transaction.annotation.Transactional;
import com.examen.Dao.CustomerDAO;
import com.examen.domain.Customer;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CustomerServiceimpl implements CustomerService{
    
    
    @Autowired
    private CustomerDAO customerDao;
    
    

    @Override
    @Transactional (readOnly = true)
    public List<Customer> listar() {
        return (List<Customer>) customerDao.findAll();
    }

    
    @Override
    @Transactional
    public void guardar(Customer customer) {
        customerDao.save(customer);
    }

    @Override
    @Transactional
    public void eliminar(Customer customer) {
        
        customerDao.delete(customer);
        
    }

    @Override
    @Transactional (readOnly = true)
    public Customer buscarcustomer(Customer customer) {
        return customerDao.findById(customer.getId()).orElse(null);
    }
    
    
    
    
    
    
    
    
}

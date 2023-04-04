
package com.examen.service;

import com.examen.domain.Customer;
import java.util.List;


public interface CustomerService {
    
    public List <Customer> listar();
    
    public void guardar(Customer customer);
    
    public void eliminar(Customer customer);
    
    public Customer buscarcustomer(Customer customer);
    
}

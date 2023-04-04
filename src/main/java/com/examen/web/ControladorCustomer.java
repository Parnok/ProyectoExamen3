
package com.examen.web;

import com.examen.service.CustomerService;
import com.examen.domain.Customer;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/customer")
public class ControladorCustomer {
    
   @Autowired
   private CustomerService service;
    
    
    @GetMapping
    public List<Customer> listado (){
        
        return service.listar();
    }
    
    @PostMapping("/agregar")
    public void agregar(@RequestBody Customer customer){
        
        service.guardar(customer);
    }
    
    
    @PutMapping("/actualizar")
    public void actualizar(@RequestBody Customer customer){
        service.guardar(customer);
    }
    
    
    @DeleteMapping("/eliminar")
    public void eliminar(@RequestBody Customer customer){
        
        service.eliminar(customer);
        
    }
    
    
    
    
}

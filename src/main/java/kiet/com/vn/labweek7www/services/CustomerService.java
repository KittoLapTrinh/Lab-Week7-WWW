package kiet.com.vn.labweek7www.services;

import kiet.com.vn.labweek7www.models.Customer;
import kiet.com.vn.labweek7www.models.Product;
import kiet.com.vn.labweek7www.repositories.CustomerRepository;
import kiet.com.vn.labweek7www.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;


    public void createOrUpdate(Customer c){
        customerRepository.save(c);
    }



    public Customer findOne(long id){
        return customerRepository.findById(id).get();
    }

    public void delete(long id){
        customerRepository.deleteById(id);
    }

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

}


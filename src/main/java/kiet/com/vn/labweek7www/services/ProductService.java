package kiet.com.vn.labweek7www.services;

import kiet.com.vn.labweek7www.models.Product;
import kiet.com.vn.labweek7www.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;


    public void createOrUpdate(Product p){
        productRepository.save(p);
    }



    public Product findOne(long id){
        return productRepository.findById(id).get();
    }

    public void delete(long id){
        productRepository.deleteById(id);
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }

}

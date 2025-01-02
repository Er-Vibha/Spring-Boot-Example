package org.example.SimpleWebAppDB.Service;

import org.example.SimpleWebAppDB.Model.Product;
import org.example.SimpleWebAppDB.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class ProductService {
    @Autowired
    ProductRepo repo;

    public List<Product> getProducts(){
        return repo.findAll();
    }
    public Product getProductByID(int prodId){
       return repo.findById(prodId).orElse(new Product());
    }
    public void addProduct(Product prod){
        repo.save(prod);
    }
    public void updateProduct(Product prod){
        repo.save(prod);
    }
    public void deleteProduct(int prodId){
repo.deleteById(prodId);

    }
    
}

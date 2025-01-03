package com.example.SimpleWebApp.Service;

import com.example.SimpleWebApp.Model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class ProductService {
    List<Product> products= new ArrayList<>(Arrays.asList(new Product(101, "Airdops", 1500), new Product(102, "Specs", 1300), new Product(103, "Marker", 100)));
    public List<Product> getProducts(){
        return products;
    }
    public Product getProductByID(int prodId){
        return products.stream().filter(p -> p.getProdId() == prodId)
                .findFirst().get();
    }
    public void addProduct(Product prod){
        products.add(prod);
    }
    public void updateProduct(Product prod){
        int index=0;
        for (int i = 0; i < products.size(); i++) {
        if(products.get(i).getProdId()==prod.getProdId()){
            index=i;
    }
        }
        products.set(index,prod);
    }
    public void deleteProduct(int prodId){
        int index=0;
        for(int i=0;i<products.size();i++){
            if(products.get(i).getProdId()==prodId){
                index=i;
            }
        }
        products.remove(index);
    }
    
}

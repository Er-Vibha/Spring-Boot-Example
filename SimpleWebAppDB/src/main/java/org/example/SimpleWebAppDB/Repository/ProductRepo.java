package org.example.SimpleWebAppDB.Repository;

import org.example.SimpleWebAppDB.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Integer> {
}

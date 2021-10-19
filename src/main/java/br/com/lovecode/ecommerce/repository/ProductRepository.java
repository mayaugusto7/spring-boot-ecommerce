package br.com.lovecode.ecommerce.repository;

import br.com.lovecode.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {}

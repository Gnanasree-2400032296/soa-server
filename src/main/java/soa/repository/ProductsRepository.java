package soa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import soa.model.Products;

public interface ProductsRepository extends JpaRepository<Products, Long>{

}

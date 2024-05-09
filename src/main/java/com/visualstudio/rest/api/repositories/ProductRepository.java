package com.visualstudio.rest.api.repositories;

import com.visualstudio.rest.api.models.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

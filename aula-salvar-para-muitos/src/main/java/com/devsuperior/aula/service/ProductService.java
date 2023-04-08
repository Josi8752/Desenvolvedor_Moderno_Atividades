package com.devsuperior.aula.service;

import com.devsuperior.aula.dto.CategoryDto;
import com.devsuperior.aula.dto.ProductDTO;
import com.devsuperior.aula.entities.Category;
import com.devsuperior.aula.entities.Product;
import com.devsuperior.aula.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.annotation.Retention;

@Service
public class ProductService {


    @Autowired
    private ProductRepository repository;

    public ProductDTO insert (ProductDTO dto) {
        Product entity = new Product();

        entity.setName(dto.getName());
        entity.setPrice(dto.getPrice());

        for (CategoryDto categoryDto : dto.getCategories()) {

            Category cat = new Category();
            cat.setId(categoryDto.getId());
            entity.getCategories().add(cat);

        }
        entity = repository.save(entity);

        return  new ProductDTO(entity);

    }
}

package com.ecommerce.service;

import com.ecommerce.model.Product;
import com.ecommerce.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FournisseurService {
    private final ProductRepository productRepository;

    public FournisseurService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getSupplierProducts(int supplierId) {
        // Implement logic to get products by supplier
        return productRepository.findAll(); // Simplified for example
    }

    public Product updateProductStock(int productId, int quantity) {
        Product product = productRepository.findById(productId).orElse(null);
        if (product != null) {
            // Update stock logic would go here
            return productRepository.save(product);
        }
        return null;
    }
}
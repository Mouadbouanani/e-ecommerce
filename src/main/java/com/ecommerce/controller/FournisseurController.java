package com.ecommerce.controller;

import com.ecommerce.model.Product;
import com.ecommerce.service.FournisseurService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/supplier")
public class FournisseurController {
    private final FournisseurService fournisseurService;

    public FournisseurController(FournisseurService fournisseurService) {
        this.fournisseurService = fournisseurService;
    }

    @GetMapping("/{supplierId}/products")
    public List<Product> getSupplierProducts(@PathVariable int supplierId) {
        return fournisseurService.getSupplierProducts(supplierId);
    }

    @PatchMapping("/products/{productId}/stock")
    public Product updateProductStock(@PathVariable int productId, @RequestParam int quantity) {
        return fournisseurService.updateProductStock(productId, quantity);
    }
}
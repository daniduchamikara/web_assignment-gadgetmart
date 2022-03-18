package com.assignment.gadgetmart.service.impl;

import com.assignment.gadgetmart.connector.Connector;
import com.assignment.gadgetmart.domain.model.Product;
import com.assignment.gadgetmart.repository.ProductRepositary;
import com.assignment.gadgetmart.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Dani
 */
@Service
public class ProductServiceImpl implements ProductService {

    
    @Autowired
    Connector connector;

    @Autowired
    ProductRepositary productRepositary;

    @Override
    public List<Product> getProductList() {
        return productRepositary.findAll();
    }

    @Override
    public List<Product> getProductsByCategory(String category) {
        List<Product> productList = productRepositary.findByName(category);
        return productList;
    }

    @Override
    public List<Product> getProductsByName(String name) {
        List<Product> productList = productRepositary.findByProductCat(name);
        return productList;
    }
}

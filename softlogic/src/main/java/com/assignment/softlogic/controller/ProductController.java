package com.assignment.softlogic.controller;



import com.assignment.softlogic.dto.ProductCategory;
import com.assignment.softlogic.dto.SoftlogicProduct;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dani
 */
@RestController
@CrossOrigin
@RequestMapping("/softlogic/product")
public class ProductController {
    
    
    
    @GetMapping("/product-list")
    public List<SoftlogicProduct> getProductList(){
        
        List<SoftlogicProduct> abanceProducts = new ArrayList<>();
        SoftlogicProduct abanceProduct = new SoftlogicProduct();
        abanceProduct.setDescription("test");
        abanceProduct.setId("so1");
        abanceProduct.setName("Softlogic Item 01");
        abanceProduct.setProduct_category(new ProductCategory("123","test", null, "ok", "test"));
        abanceProduct.setProductImageList(new ArrayList<>());
        abanceProduct.setQtyOnHand(10);
        abanceProduct.setUnitPrice(800.00);
        abanceProducts.add(abanceProduct);
        
        return abanceProducts;
    
    }
    
    
    
}

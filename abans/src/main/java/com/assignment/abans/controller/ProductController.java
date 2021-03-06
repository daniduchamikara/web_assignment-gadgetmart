package com.assignment.abans.controller;



import com.assignment.abans.domain.dto.AbanceProduct;
import com.assignment.abans.domain.dto.ProductCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dani
 */
@RestController
@CrossOrigin
@RequestMapping("/abance/product")
public class ProductController {
    
    
    
    @GetMapping("/product-list")
    public List<AbanceProduct> getProductList(){
        
        List<AbanceProduct> abanceProducts = new ArrayList<>();
        AbanceProduct abanceProduct = new AbanceProduct();
        abanceProduct.setDescription("test");
        abanceProduct.setId("ab1");
        abanceProduct.setName("Abance Item 01");
        abanceProduct.setProduct_category(new ProductCategory("123","test", null, "ok", "test"));
        abanceProduct.setProductImageList(new ArrayList<>());
        abanceProduct.setQtyOnHand(10);
        abanceProduct.setUnitPrice(640.00);
        abanceProducts.add(abanceProduct);
        
        return abanceProducts;
    
    }
    
    
    
}

package com.assignment.gadgetmart.domain.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * @author Dani
 */
@Data
@Entity
@Table(name = "Product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private long qtyOnHand;
    private double unitPrice;
    private String userId;
    private String statusId;
    private String productCat;

}

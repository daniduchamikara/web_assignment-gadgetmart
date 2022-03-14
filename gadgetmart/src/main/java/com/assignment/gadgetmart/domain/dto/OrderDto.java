package com.assignment.gadgetmart.domain.dto;

import lombok.Data;

@Data
public class OrderDto {
    private int orderId;
    private String date;
    private double amount;
    private String status;
    private String qty;
    private CustomerDto customer;
    private ProductDto product;

    @Override
    public String toString() {
        return "OrderDto{" +
                "amount='" + amount + '\'' +
                ", orderId='" + orderId + '\'' +
                ", date='" + date + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}

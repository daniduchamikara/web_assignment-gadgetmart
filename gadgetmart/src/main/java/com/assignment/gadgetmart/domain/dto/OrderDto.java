package com.assignment.gadgetmart.domain.dto;

import com.assignment.gadgetmart.domain.model.OrderDetail;
import lombok.Data;

import java.util.List;

@Data
public class OrderDto {
    private int orderId;
    private String date;
    private double amount;
    private String status;
    private String qty;
    private List<OrderDetailDto> orderDetail;
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

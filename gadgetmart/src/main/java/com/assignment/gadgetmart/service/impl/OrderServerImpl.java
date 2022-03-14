package com.assignment.gadgetmart.service.impl;

import com.assignment.gadgetmart.domain.dto.OrderDto;
import com.assignment.gadgetmart.domain.model.Order;
import com.assignment.gadgetmart.domain.model.OrderDetail;
import com.assignment.gadgetmart.repository.OrderDetailRepositary;
import com.assignment.gadgetmart.repository.OrderRepository;
import com.assignment.gadgetmart.service.OrderServer;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author Dani
 */
@Service
public class OrderServerImpl implements OrderServer {

    OrderRepository orderRepository;
    OrderDetailRepositary orderDetailRepositary;

    public OrderServerImpl(OrderRepository orderRepository, OrderDetailRepositary orderDetailRepositary) {
        this.orderRepository = orderRepository;
        this.orderDetailRepositary = orderDetailRepositary;
    }

    @Override
    public Order placeOrder(OrderDto orderDto) {
        Order order = new Order();
        OrderDetail orderDetail=new OrderDetail();
        order.setStatus("1");
        order.setDate(orderDto.getDate());
        order.setAmount(orderDto.getAmount());

        orderDetail.setCustomer(orderDto.getCustomer().getCustomerId());
        Order orderres=orderRepository.save(order);
        orderDetail.setOrderId(String.valueOf(orderres.getOrderId()));
        orderDetail.setDate(new Date());
        orderDetail.setQty(orderDto.getQty());
        orderDetailRepositary.save(orderDetail);
        return order;
    }

    @Override
    public List<Order> getAllOrders(String email) {
        return orderRepository.findAll();
    }
}

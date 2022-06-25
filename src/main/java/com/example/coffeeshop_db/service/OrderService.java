package com.example.coffeeshop_db.service;

import com.example.coffeeshop_db.model.dtos.OrderDTO;

public interface OrderService {

    boolean addOrder(OrderDTO orderDTO);
}

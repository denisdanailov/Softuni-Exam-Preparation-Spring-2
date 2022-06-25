package com.example.coffeeshop_db.service.impl;

import com.example.coffeeshop_db.model.dtos.OrderDTO;
import com.example.coffeeshop_db.service.OrderService;
import org.springframework.stereotype.Service;


@Service
public class OrderServiceImpl implements OrderService {

    @Override
    public boolean addOrder(OrderDTO orderDTO) {
        return false;
    }
}

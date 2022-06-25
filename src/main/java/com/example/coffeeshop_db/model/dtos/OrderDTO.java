package com.example.coffeeshop_db.model.dtos;

import com.example.coffeeshop_db.model.CategoryTypeEnum;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class OrderDTO {

    @Size(min = 3, max = 20)
    private String name;

    @Positive
    private BigDecimal price;


    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private LocalDateTime orderTime;

    @NotNull
    private CategoryTypeEnum category;

    @Size(min = 5)
    private String description;

    public OrderDTO() {

    }

    public String getName() {
        return name;
    }

    public OrderDTO setName(String name) {
        this.name = name;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public OrderDTO setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public OrderDTO setOrderTime(LocalDateTime orderTime) {
        this.orderTime = orderTime;
        return this;
    }

    public CategoryTypeEnum getCategory() {
        return category;
    }

    public OrderDTO setCategory(CategoryTypeEnum category) {
        this.category = category;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public OrderDTO setDescription(String description) {
        this.description = description;
        return this;
    }

    @Override
    public String toString() {
        return "OrderDTO{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", orderTime=" + orderTime +
                ", category=" + category +
                ", description='" + description + '\'' +
                '}';
    }
}

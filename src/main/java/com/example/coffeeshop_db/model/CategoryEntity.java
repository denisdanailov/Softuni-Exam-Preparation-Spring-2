package com.example.coffeeshop_db.model;

import javax.persistence.*;

@Entity
@Table( name = "categories")
public class CategoryEntity extends BaseEntity {

    @Enumerated(EnumType.STRING)
    private CategoryTypeEnum name;

    @Column(name = "needed_time", nullable = false)
    private Integer neededTime;

    public CategoryEntity() {
    }

    public CategoryEntity(CategoryTypeEnum name) {

    }

    public CategoryTypeEnum getName() {
        return name;
    }

    public CategoryEntity setName(CategoryTypeEnum name) {
        this.name = name;
        return this;
    }

    public Integer getNeededTime() {
        return neededTime;
    }

    public CategoryEntity setNeededTime(Integer neededTime) {
        this.neededTime = neededTime;
        return this;
    }
}

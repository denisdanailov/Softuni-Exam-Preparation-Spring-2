package com.example.coffeeshop_db.service.impl;

import com.example.coffeeshop_db.model.CategoryEntity;
import com.example.coffeeshop_db.model.CategoryTypeEnum;
import com.example.coffeeshop_db.repository.CategoryRepository;
import com.example.coffeeshop_db.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;


    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;

    }

    @Override
    public void initializeCategories() {

        if (categoryRepository.count() == 0) {

            Arrays.stream(CategoryTypeEnum.values()).forEach(categoryTypeEnum -> {
                        CategoryEntity category = new CategoryEntity();

                        category.setName(categoryTypeEnum);

                        switch (categoryTypeEnum) {
                            case COFFEE -> category.setNeededTime(2);
                            case CAKE -> category.setNeededTime(10);
                            case DRINK -> category.setNeededTime(1);
                            case OTHER -> category.setNeededTime(5);
                        }

                        categoryRepository.save(category);
                    });

        }
    }
}

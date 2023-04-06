package com.example.DistributionManagementSystem.controller;

import com.example.DistributionManagementSystem.Model.CategoryModel;
import com.example.DistributionManagementSystem.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {

        @Autowired
        CategoryService categoryService;

        @PostMapping("/saveCategory")
        private CategoryModel saveCategory(@RequestBody CategoryModel categoryModel){
            return categoryService.saveCategory(categoryModel);
        }
}

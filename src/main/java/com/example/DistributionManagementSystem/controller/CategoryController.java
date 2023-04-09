package com.example.DistributionManagementSystem.controller;

import com.example.DistributionManagementSystem.Model.CategoryModel;
import com.example.DistributionManagementSystem.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CategoryController {

        @Autowired
        CategoryService categoryService;

        @PostMapping("/saveCategory")
        private CategoryModel saveCategory(@RequestBody CategoryModel categoryModel){
            return categoryService.saveCategory(categoryModel);
        }
        @GetMapping("/getCategory/")
        private CategoryModel getCategory(@PathVariable CategoryModel categoryModel){
                return (CategoryModel) categoryService.getAllCategories(categoryModel);
        }
        @DeleteMapping("/deleteCategory/{id}")
        private String deleteCategory(@PathVariable CategoryModel categoryModel){
                return "Category is deleted";
        }

}

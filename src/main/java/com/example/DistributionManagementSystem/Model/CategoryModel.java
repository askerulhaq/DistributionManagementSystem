package com.example.DistributionManagementSystem.Model;

import com.example.DistributionManagementSystem.Entity.Category;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CategoryModel {
    private Long categoryId;
    private String CategoryType;
    public CategoryModel (Category category){
        this.setCategoryId(category.getCategoryId());
        this.setCategoryType(category.getCategoryType());
    }
    public Category dissamble(){
        Category category = new Category();
        category.setCategoryId(this.categoryId);
        category.setCategoryType(this.CategoryType);
        return category;
    }
}

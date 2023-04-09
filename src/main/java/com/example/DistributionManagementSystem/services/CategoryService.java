package com.example.DistributionManagementSystem.services;

import com.example.DistributionManagementSystem.Entity.Category;
import com.example.DistributionManagementSystem.Model.CategoryModel;
import com.example.DistributionManagementSystem.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAllCategories(CategoryModel categoryModel) {
        return categoryRepository.findAll();
    }

    //public CategoryModel saveCategory(CategoryModel categoryModel) {
    }
//    public CategoryModel saveCategory(CategoryModel categoryModel){
//        Category category=categoryRepository.save(categoryModel.dissamble());
//        return new CategoryModel(category);
//    }

//    public Category getCategoryById(Long id) {
//        return categoryRepository.findById(id).orElseThrow(() -> new ChangeSetPersister.NotFoundException("Category not found with id " + id));
//    }

//    public Category createCategory(Category category) {
//        return categoryRepository.save(category);
//    }
//
//    public Category updateCategory(Long id, Category category) {
//        Category existingCategory = getCategoryById(id);
//        existingCategory.setCategoryType(category.getCategoryType());
//        existingCategory.setProductList(category.getProductList());
//        return categoryRepository.save(existingCategory);
//    }
//
//    public void deleteCategory(Long id) {
//        Category category = getCategoryById(id);
//        categoryRepository.delete(category);
//    }
}

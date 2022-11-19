package com.example.RMgX_Assest_Management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.RMgX_Assest_Management.model.Assest;
import com.example.RMgX_Assest_Management.model.Category;
import com.example.RMgX_Assest_Management.service.AssestService;
import com.example.RMgX_Assest_Management.service.CategoryService;

@RestController
public class AssestController {
	
	@Autowired
    AssestService assetService;
    
    @Autowired
    CategoryService categoryService;

    @GetMapping("/asset")
    private List<Assest> getAllasset()
    {

        return assetService.getAllAsset();
    }
    
    @GetMapping("/asset/{id}")
    public Assest getAsset(@PathVariable("id") int name)
    {

        return assetService.getAssestById(name);
    }

    @DeleteMapping
    private void deleteAssest(@PathVariable("id") int name)
    {
        assetService.delete(name);
    }

    @PostMapping("/updateAsset")
    private int updateAsset(Assest assest)
    {
        assetService.saveOrUpdate(assest);
        return assest.getAssignedEmployeeId();
    }

   
    @GetMapping("/category/{id}")
    private Category getCategory(@PathVariable("id") int id){

        return categoryService.getCategoryById(id);
    }

    @PostMapping("/updateCategory")
    private int updateCategoryAsset(Category category)
    {
        categoryService.saveOrUpdate(category);
        return category.getId();
    }

}

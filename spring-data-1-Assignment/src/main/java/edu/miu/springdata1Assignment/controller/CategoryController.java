package edu.miu.springdata1Assignment.controller;

import edu.miu.springdata1Assignment.dto.CategoryDto;
import edu.miu.springdata1Assignment.entity.Category;
import edu.miu.springdata1Assignment.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/categories")
public class CategoryController {
    private CategoryService categoryService;

    @GetMapping
    public List<CategoryDto> findAll(){
        return categoryService.findAll();
    }
    @GetMapping("/{id}")
    public CategoryDto findById(@PathVariable int id){
        return categoryService.findById(id);
    }
    @PostMapping
    public void save(Category category){
        categoryService.save(category);
    }
    @PutMapping("/{id}")
    public void update(@PathVariable int id, Category category){
        categoryService.update(id,category);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        categoryService.delete(id);
    }
}

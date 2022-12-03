package edu.miu.springdata1Assignment.controller;

import edu.miu.springdata1Assignment.dto.ProductDto;
import edu.miu.springdata1Assignment.entity.Product;
import edu.miu.springdata1Assignment.entity.Review;
import edu.miu.springdata1Assignment.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/products")
public class ProductController {
    private ProductService productService;

    @GetMapping
    public List<ProductDto> findAll(){
        return productService.findAll();
    }
    @GetMapping("/{id}")
    public ProductDto findById(@PathVariable int id){
        return productService.findById(id);
    }
    @PostMapping
    public void save(Product product){
        productService.save(product);
    }
    @PutMapping("/{id}")
    public void update(@PathVariable int id, Product product){
        productService.update(id,product);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        productService.delete(id);
    }

    @GetMapping("/{filterByPriceGreaterThan}")
    public  List<Product> findByPriceGreaterThan(@RequestParam double price){
        return productService.findByPriceGreaterThan(price);
    }
    @GetMapping("/{filterByCategoryNameAndPriceLessThan}")
    public List<Product> findByCategory_NameAndPriceLessThan(@RequestParam String categoryName,@RequestParam double price){
        return  productService.findByCategory_NameAndPriceLessThan(categoryName,price);
    }
    @GetMapping("/filterByName")
    public List<Product> findByNameContaining(@RequestParam String name){
        return  productService.findByNameContaining(name);
    }

    @GetMapping("/{id}/reviews")
    public List<Review> findByProduct_Id(@PathVariable int id){
        return  productService.findByProduct_Id(id);
    }

}

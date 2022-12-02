package edu.miu.springdata1Assignment.service.impl;

import edu.miu.springdata1Assignment.dto.ProductDto;
import edu.miu.springdata1Assignment.entity.Product;
import edu.miu.springdata1Assignment.repository.ProductRepo;
import edu.miu.springdata1Assignment.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepo productRepo;
    private final ModelMapper modelMapper;

    @Override
    public List<ProductDto> findAll(){
        var products = (List<Product>) productRepo.findAll();
        return products.stream().map(x->modelMapper.map(x,ProductDto.class)).toList();

    }

    @Override
    public ProductDto findById(int id){
        var product = productRepo.findById(id);
        return modelMapper.map(product,ProductDto.class);
    }

    @Override
    public void save(Product product){
        productRepo.save(product);
    }

    @Override
    public void update(int id, Product product){
        productRepo.findById(id).orElseThrow(() -> new RuntimeException("Product does not exists"));;
        productRepo.save(product);
    }

    @Override
    public void delete(int id){
        Product product = productRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Product does not exists"));
        productRepo.delete(product);
    }



}

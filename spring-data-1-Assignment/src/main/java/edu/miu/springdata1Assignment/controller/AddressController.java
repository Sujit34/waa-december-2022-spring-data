package edu.miu.springdata1Assignment.controller;

import edu.miu.springdata1Assignment.dto.AddressDto;
import edu.miu.springdata1Assignment.entity.Address;
import edu.miu.springdata1Assignment.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/addresses")
public class AddressController {
    private AddressService addressService;

    @GetMapping
    public List<AddressDto> findAll(){
        return addressService.findAll();
    }
    @GetMapping("/{id}")
    public AddressDto findById(@PathVariable int id){
        return addressService.findById(id);
    }
    @PostMapping
    public void save(Address address){
        addressService.save(address);
    }
    @PutMapping("/{id}")
    public void update(@PathVariable int id, Address address){
        addressService.update(id,address);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        addressService.delete(id);
    }
}

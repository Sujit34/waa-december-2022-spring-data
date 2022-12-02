package edu.miu.springdata1Assignment.controller;

import edu.miu.springdata1Assignment.dto.UserDto;
import edu.miu.springdata1Assignment.entity.User;
import edu.miu.springdata1Assignment.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    @GetMapping
    public List<UserDto> findAll(){
        return userService.findAll();
    }
    @GetMapping("/{id}")
    public UserDto findById(@PathVariable int id){
        return userService.findById(id);
    }
    @PostMapping
    public void save(User user){
        userService.save(user);
    }
    @PutMapping("/{id}")
    public void update(@PathVariable int id, User user){
        userService.update(id,user);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        userService.delete(id);
    }
}

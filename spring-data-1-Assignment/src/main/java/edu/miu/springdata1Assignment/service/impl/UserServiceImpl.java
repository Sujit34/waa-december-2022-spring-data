package edu.miu.springdata1Assignment.service.impl;

import edu.miu.springdata1Assignment.dto.UserDto;
import edu.miu.springdata1Assignment.entity.User;
import edu.miu.springdata1Assignment.controller.repository.UserRepo;
import edu.miu.springdata1Assignment.service.UserService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepo userRepo;
    private final ModelMapper modelMapper;

    @Override
    public List<UserDto> findAll(){
        var users = (List<User>) userRepo.findAll();
        return users.stream().map(x->modelMapper.map(x, UserDto.class)).toList();
    }
    @Override
    public UserDto findById(int id){
        var user = userRepo.findById(id);
        return modelMapper.map(user,UserDto.class);
    }
    @Override
    public void save(User user){
        userRepo.save(user);
    }
    @Override
    public void update(int id, User user){
        userRepo.findById(id).orElseThrow(() -> new RuntimeException("User does not exists"));;
        userRepo.save(user);
    }
    @Override
    public void delete(int id){
        User user = userRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("User does not exists"));
        userRepo.delete(user);
    }
}

package edu.miu.springdata1Assignment.service;

import edu.miu.springdata1Assignment.dto.UserDto;
import edu.miu.springdata1Assignment.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public List<UserDto> findAll();
    public UserDto findById(int id);
    public void save(User user);
    public void update(int id, User user);
    public void delete(int id);
}

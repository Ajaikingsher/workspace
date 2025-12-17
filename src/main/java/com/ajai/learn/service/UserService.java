package com.ajai.learn.service;
import java.util.List;
import com.ajai.learn.model.User;

public interface UserService {
    User createUser(User user);
    List<User>getAllUser();
    User updateUserById(int id,User user);
    void deleteUserById(int id);
    
}

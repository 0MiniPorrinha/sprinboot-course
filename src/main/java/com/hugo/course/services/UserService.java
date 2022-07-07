package com.hugo.course.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import com.hugo.course.repositories.UserRepository;
import com.hugo.course.entities.User;

@Service
public class UserService {
    
    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }

    public User findById(Long id){
        Optional<User> obj = repository.findById(id);
        return obj.get();
    }

    public User insert(User user){
        return repository.save(user);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }
}

package com.example.demo.service;

import com.example.demo.data.entity.User;
import com.example.demo.data.repository.BaseRepository;
import com.example.demo.data.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService extends BaseService<User, Long>  {

    @Autowired
    public UserRepository repository;

    @Override
    public BaseRepository<User, Long> getRepository() {
        return repository;
    }

}

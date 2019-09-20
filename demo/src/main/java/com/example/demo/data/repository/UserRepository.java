package com.example.demo.data.repository;

import com.example.demo.data.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends BaseRepository<User, Long> {

    void deleteByName(String name);

    default User findOne() {
        return null;
    }
}

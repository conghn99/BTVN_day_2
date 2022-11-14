package com.example.btvn_day_2.repository;

import com.example.btvn_day_2.database.FakeDB;
import com.example.btvn_day_2.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {
    public List<User> getList() {
        return FakeDB.users;
    }
}

package com.example.btvn_day_2.service;

import com.example.btvn_day_2.exception.NotFoundException;
import com.example.btvn_day_2.model.User;
import com.example.btvn_day_2.model.UserDTO;
import com.example.btvn_day_2.repository.UserRepository;
import com.example.btvn_day_2.request.InsertRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public UserDTO getUser(InsertRequest request) {
        List<User> uList = userRepository.getList();
        for (User user : uList) {
            if (user.getUsername().equals(request.getUsername()) && user.getPassword().equals(request.getPassword())) {
                return convertToDTO(user);
            }
        }
        throw new NotFoundException("username hoặc password chưa chính xác");
    }

    private UserDTO convertToDTO(User model) {
        UserDTO dto = new UserDTO();
        dto.setUsername(model.getUsername());
        dto.setEmail(model.getEmail());
        dto.setAvatar(model.getAvatar());
        return dto;
    }
}

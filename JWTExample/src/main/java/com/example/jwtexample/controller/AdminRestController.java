package com.example.jwtexample.controller;

import com.example.jwtexample.dto.AdminUserDto;
import com.example.jwtexample.dto.UserDto;
import com.example.jwtexample.model.User;
import com.example.jwtexample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/admin/")
public class AdminRestController {

    @Autowired
    private UserService userService;

    @GetMapping("user/{id}")
    public ResponseEntity<AdminUserDto> getUserById(@PathVariable Long id) {
        User result = userService.findById(id);

        if(result==null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        AdminUserDto dto = AdminUserDto.fromUser(result);
        return new ResponseEntity<>(dto,HttpStatus.OK);
    }

}

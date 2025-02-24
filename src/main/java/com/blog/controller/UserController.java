package com.blog.controller;

import com.blog.Payloads.UserDto;
import com.blog.services.UserService;
import org.apache.catalina.filters.ExpiresFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/users")
public class UserController  {
@Autowired
    private UserService userService ;
@PostMapping("/")
public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto){
 UserDto createUserDto =this.userService.createUser(userDto);
 return new ResponseEntity<>(createUserDto, HttpStatus.CREATED);
}}

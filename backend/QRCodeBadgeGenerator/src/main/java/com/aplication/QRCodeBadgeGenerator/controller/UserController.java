package com.aplication.QRCodeBadgeGenerator.controller;

import com.aplication.QRCodeBadgeGenerator.model.User;
import com.aplication.QRCodeBadgeGenerator.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/api/user")
    public List<User> getAllJedi(){
        return service.findAll();
    }

    @GetMapping("/api/user/{id}")
    public ResponseEntity<User> getUser(@PathVariable("id") Long id){
        final User user = service.findById(id);
        return ResponseEntity.ok(user);
    }

    @PostMapping("/api/user/create")
    public User createUser(@Valid @RequestBody User user){
        return service.save(user);
    }

    @PutMapping("/api/user/update/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<User> updateUser(@PathVariable("id") Long id , @Valid @RequestBody User dto){
        final User user = service.update(id,dto);
        return  ResponseEntity.ok(user);
    }

    @DeleteMapping("/api/user/remove/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete (@PathVariable("id") Long id){
        final User user = service.findById(id);
        service.delete(id);
    }



}

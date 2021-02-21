package com.aplication.QRCodeBadgeGenerator.service;


import com.aplication.QRCodeBadgeGenerator.exception.UserNOtFoundException;
import com.aplication.QRCodeBadgeGenerator.model.User;
import com.aplication.QRCodeBadgeGenerator.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }

    public User  findById( final Long id){
        final Optional<User> user = repository.findById(id);

        if(user.isPresent()){
            return user.get();
        }else{
            throw new UserNOtFoundException();
        }
    }

    public User save( final User user){
        return repository.save(user);
    }

    public User update( final Long id, final User dto){
        final Optional<User> userEntity = repository.findById(id);
        final User user;

        if(userEntity.isPresent()){
            user =  userEntity.get();
        }else{
            throw new UserNOtFoundException();
        }
        user.setName(dto.getName());
        user.setEmail(dto.getEmail());
        user.setTwitter(dto.getTwitter());
        user.setGitHuber(dto.getGitHuber());

        return repository.save(user);
    }

    public void delete( final Long id){
        final User user = findById(id);
        repository.delete(user);
    }



}

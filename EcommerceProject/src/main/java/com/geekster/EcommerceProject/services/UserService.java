package com.geekster.EcommerceProject.services;

import com.geekster.EcommerceProject.models.Users;
import com.geekster.EcommerceProject.repositories.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    IUserRepo iUserRepo;

    public String insertUsers(List<Users> usersList) {
        List<Users> added = iUserRepo.saveAll(usersList);

        if(added != null){
            return "Added users successfully...";
        }
        return "Failed to add users...";
    }

    public Users getUserById(Integer id) {
        Optional<Users> userObj = iUserRepo.findById(id);
        return userObj.get();
    }
}

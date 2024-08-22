package com.bholacodecamp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.bholacodecamp.entity.User;
import com.bholacodecamp.service.UserService;



@Controller
public class WebController {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public String getAllUsers(Model model) {
    	List<User> users = userService.getAllUsers();
        model.addAttribute("users", users);
        return "users";
    }
    @GetMapping("/users/{id}")
    public String getUserById(Model model,@PathVariable("id")Long id) {
    	User user=userService.getUserById(id);
    	model.addAttribute("users",user);
    	return "users";
    }
}


package com.bholacodecamp.controller;

import com.bholacodecamp.entity.User;
import com.bholacodecamp.service.*;

import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

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
}


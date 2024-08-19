package ru.kata.spring.boot_security.demo.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import ru.kata.spring.boot_security.demo.entity.User;
import ru.kata.spring.boot_security.demo.service.UserService;

import java.security.Principal;


@Controller
@PreAuthorize("hasRole('ROLE_USER')")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public String userPage(Model model, Principal principal) {
        String username = principal.getName();

        User user = userService.findByUsername(username);
        model.addAttribute("user", user);
        return "user";
    }
}

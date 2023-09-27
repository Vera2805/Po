package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import web.model.User;
import web.service.UserService;


import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/")
    public String getUsersForm(ModelMap model) {
        List<User> users = userService.getAllUsers();
        model.addAttribute("users", users);
        return "users";
    }

    @RequestMapping("/add")
    public String newUserForm(ModelMap model) {
        return "add";
    }

    @RequestMapping("/edit")
    public String editUserForm(ModelMap model, @RequestParam String mail) {
        User user = userService.getUser(mail);
        model.put("user", user);
        model.addAttribute("email", mail);
        return "edit";
    }

    @RequestMapping("/new")
    public String newUserForm(@ModelAttribute("user") User user) {
        userService.addUser(user);
        return "redirect:/";
    }

    @RequestMapping("/update")

    public String updateUserForm(@ModelAttribute("user") User user) {
        userService.updateUser(user);
        return "redirect:/";
    }

    @RequestMapping("/delete")
    public String deleteUserForm(@RequestParam String mail) {

        userService.deleteUser(mail);
        return "redirect:/";
    }
}






package vn.hoidanit.laptopshop.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import vn.hoidanit.laptopshop.domain.User;
import vn.hoidanit.laptopshop.services.UserService;

@Controller
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/")
    // public String requestMethodName(Model model) {
    // String hello = this.userService.handleHello();
    // model.addAttribute("hello", hello);
    // model.addAttribute("name", "Hoi");
    // return "hello";
    // }
    public String requestMethodName() {
        return "hello";
    }

    @RequestMapping(value = "/admin/user/create")
    public String getUserPage(Model model, @ModelAttribute("newUser") User user) {
        model.addAttribute("newUser", new User());
        List<User> arrUsers = this.userService.getAllUsersByEmail("honguyen@gmail.com");
        System.out.println("Users: " + arrUsers);
        this.userService.handleUserSaved(user);
        return "/admin/user/create";
    }

    @RequestMapping(value = "/admin/adminPage", method = RequestMethod.POST)
    public String createUserPage(Model model, @ModelAttribute("newUser") User user) {
        model.addAttribute("newUser", new User());
        return "/admin/adminPage";
    }

}

package vn.hoidanit.laptopshop.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
    public String requestMethodName() {
        return "hello";
    }

    @RequestMapping(value = "/admin/user/create")
    public String getUsersPage(Model model) {
        model.addAttribute("newUser", new User());
        return "/admin/user/create";
    }

    @RequestMapping(value = "/admin/user/create", method = RequestMethod.POST)
    public String createUser(Model model, @ModelAttribute("newUser") User user) {
        model.addAttribute("newUser", new User());
        this.userService.handleUserSaved(user);
        return "redirect:/admin/user";
    }

    @RequestMapping(value = "/admin/adminPage", method = RequestMethod.POST)
    public String createUserPage(Model model, @ModelAttribute("newUser") User user) {
        model.addAttribute("newUser", new User());
        return "/admin/adminPage";
    }

    @RequestMapping(value = "/admin/user")
    public String getUsersPages(Model model) {
        List<User> users = this.userService.findAll();
        model.addAttribute("users", users);
        return "/admin/user/table-user";
    }

    @GetMapping(value = "/admin/user/{id}")
    public String getUserDetailPage(Model model, @PathVariable("id") long id) {

        User user = this.userService.findUserById(id).get(0);
        model.addAttribute("user", user);

        System.out.println("User: " + user.toString());
        return "/admin/user/detail-user";
    }
}

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
import org.springframework.web.bind.annotation.PostMapping;

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

    @GetMapping(value = "/admin/user/detail/{id}")
    public String getUserDetailPage(Model model, @PathVariable("id") long id) {

        User user = this.userService.getUserById(id);
        model.addAttribute("user", user);
        return "/admin/user/detail-user";
    }

    @RequestMapping(value = "/admin/user/update/{id}")
    public String getUpdateUserPage(Model model, @PathVariable long id) {
        User userCurrent = this.userService.getUserById(id);
        model.addAttribute("NewUser", userCurrent);
        return "/admin/user/update-user";
    }

    @PostMapping(value = "/admin/user/update")
    public String postUpdateUser(Model model, @ModelAttribute("NewUser") User users) {
        User userCurrent = this.userService.getUserById(users.getId());
        model.addAttribute("user", userCurrent);
        if (userCurrent != null) {
            userCurrent.setAddress(users.getAddress());
            userCurrent.setFullName(users.getFullName());
            userCurrent.setPhone(users.getPhone());
            userCurrent.setName(users.getName());
            this.userService.handleUserSaved(userCurrent);
        }
        return "redirect:/admin/user";
    }

    @GetMapping(value = "/admin/user/delete/{id}")
    public String deleteUserPage(Model model, @PathVariable("id") long id) {
        User user = this.userService.getUserById(id);
        model.addAttribute("NewUser", user);
        return "/admin/user/delete-user";
    }

    @PostMapping(value = "/admin/user/delete")
    public String deleteUser(Model model, @ModelAttribute("NewUser") User users) {
        User user = this.userService.getUserById(users.getId());
        model.addAttribute("NewUser", user);
        if (user != null) {
            this.userService.deleteUserById(users.getId());
        }
        return "redirect:/admin/user";
    }
}

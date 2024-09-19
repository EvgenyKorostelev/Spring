package ru.korostelev.DZSem4.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.korostelev.DZSem4.controller.payload.UpdateUserPayload;
import ru.korostelev.DZSem4.entity.User;
import ru.korostelev.DZSem4.service.UserService;


@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public String findUserById(@PathVariable Integer id, Model model) {
        model.addAttribute("user", userService.findUserById(id));
        return "users/user";
    }

    @PostMapping
    public String addUser(@RequestBody User user, Model model) {
        model.addAttribute(userService.addUser(user));
        return "users/user";
    }

    @GetMapping("/{id}/edit")
    public  String getUserEdit(@PathVariable Integer id,
                               Model model){
        model.addAttribute("user", userService.findUserById(id));
        return "users/user_edit";
    }

    @PostMapping("/{id}/edit")
    public String updateUserById(@PathVariable Integer id,
                                 @ModelAttribute(name = "product", binding = false) User user,
                                 UpdateUserPayload payload,
                                 Model model) {
        User oldUser = userService.findUserById(id);
        User updatedUser = new User(user.getId(), payload.name(), payload.email());
        model.addAttribute("user", userService.updateUser(oldUser, updatedUser));
        return "users/user_edit";
    }

    @PostMapping("/{id}/delete")
    public String deleteUserById(@PathVariable Integer id) {
        userService.deleteUserById(id);
        return "redirect:/users/list";
    }
}

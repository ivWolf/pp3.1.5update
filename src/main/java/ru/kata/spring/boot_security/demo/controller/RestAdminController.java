package ru.kata.spring.boot_security.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.kata.spring.boot_security.demo.model.Role;
import ru.kata.spring.boot_security.demo.service.RoleService;
import ru.kata.spring.boot_security.demo.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/admin")
public class RestAdminController {

    //    private final UserService userService;
    private final RoleService roleService;

    public RestAdminController(UserService userService, RoleService roleService) {
//        this.userService = userService;
        this.roleService = roleService;
    }

//    // User
//
//    @GetMapping("/users")
//    public List<User> getAllUsers() {
//        return userService.findAll();
//    }
//
//    @GetMapping("/users/{id}")
//    public User getUserById(@PathVariable("id") Long id) {
//        return userService.findById(id);
//    }
//
//    @PostMapping("/users")
//    public User createUser(@RequestBody User user) {
//        return userService.createUser(user);
//    }
//
//    @PutMapping("/users/{id}")
//    public User updateUser(@PathVariable("id") Long id, @RequestBody User user) {
//        user.setId(id);
//        return userService.updateUser(user);
//    }
//
//    @DeleteMapping("/users/{id}")
//    public void deleteUserById(@PathVariable("id") Long id) {
//        userService.deleteById(id);
//    }

    // Role

    @GetMapping("/roles")
    public List<Role> getAllRoles() {
        return roleService.findAll();
    }

    @PostMapping("/roles")
    public Role createRole(@RequestBody Role role) {
        return roleService.saveRole(role);
    }

    @DeleteMapping("/roles/{id}")
    public void deleteRoleById(@PathVariable("id") Long id) {
        roleService.deleteById(id);
    }
}
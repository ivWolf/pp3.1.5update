package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.model.Role;

import java.util.List;

public interface RoleService {
    Role findById(Long id);
    List<Role> findAll();
    Role saveRole(Role role);
    void deleteById(Long id);
}

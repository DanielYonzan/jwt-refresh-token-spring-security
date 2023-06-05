package com.daniel.jwtspringsecurity.service;

import com.daniel.jwtspringsecurity.model.Role;
import com.daniel.jwtspringsecurity.model.User;
import java.util.List;

/**
 * @author daniel <daniel.tamang@f1soft.com>
 * created on 2023-06-05
 */
public interface Userservice {

    User saveUser(User user);

    Role saveRole(Role role);

    void addRoleToUser(String username, String roleName);

    User getUser(String username);

    List<User> getUsers();
}

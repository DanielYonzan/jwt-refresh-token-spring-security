package com.daniel.jwtspringsecurity.repo;

import com.daniel.jwtspringsecurity.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author daniel <daniel.tamang@f1soft.com>
 * created on 2023-06-05
 */
public interface UserRespository extends JpaRepository<User, Long> {

    User findByUsername(String username);
}

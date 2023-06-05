package com.daniel.jwtspringsecurity.repo;

import com.daniel.jwtspringsecurity.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author daniel <daniel.tamang@f1soft.com>
 * created on 2023-06-05
 */
public interface RoleRespository extends JpaRepository<Role, Long> {

    Role findByName(String name);
}

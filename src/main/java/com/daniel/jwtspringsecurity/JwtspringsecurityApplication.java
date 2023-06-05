package com.daniel.jwtspringsecurity;

import com.daniel.jwtspringsecurity.model.Role;
import com.daniel.jwtspringsecurity.model.User;
import com.daniel.jwtspringsecurity.service.Userservice;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
public class JwtspringsecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(JwtspringsecurityApplication.class, args);
    }

    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    @Bean
    CommandLineRunner run(Userservice userservice) {
        return args -> {
          userservice.saveRole(new Role(null, "ROLE_USER"));
          userservice.saveRole(new Role(null, "ROLE_MANAGER"));
          userservice.saveRole(new Role(null, "ROLE_ADMIN"));
          userservice.saveRole(new Role(null, "ROLE_SUPER_ADMIN"));

          userservice.saveUser(new User(null, "John Wick","john","1234",new ArrayList<>()));
          userservice.saveUser(new User(null, "Will Smith","will","1234",new ArrayList<>()));
          userservice.saveUser(new User(null, "Jim Carry","jim","1234",new ArrayList<>()));
          userservice.saveUser(new User(null, "Jon Snow","jon","1234",new ArrayList<>()));

          userservice.addRoleToUser("john","ROLE_USER");
          userservice.addRoleToUser("john","ROLE_MANAGER");
          userservice.addRoleToUser("will","ROLE_MANAGER");
          userservice.addRoleToUser("jim","ROLE_ADMIN");
          userservice.addRoleToUser("jon","ROLE_SUPER_ADMIN");
          userservice.addRoleToUser("jon","ROLE_ADMIN");
          userservice.addRoleToUser("jon","ROLE_USER");
        };
    }
}

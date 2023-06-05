package com.daniel.jwtspringsecurity.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

/**
 * @author daniel <daniel.tamang@f1soft.com>
 * created on 2023-06-05
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 private Long id;
 private String name;
 private String username;
 private String password;

 @ManyToMany(fetch = FetchType.EAGER)
 private Collection<Role> roles = new ArrayList<>();
}

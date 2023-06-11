package com.ali.springboot.registrationlogindemo.repository;

import com.ali.springboot.registrationlogindemo.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {

    Role findByName(String name);
}



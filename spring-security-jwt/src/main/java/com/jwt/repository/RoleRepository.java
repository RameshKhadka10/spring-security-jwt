package com.jwt.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jwt.model.ERole;
import com.jwt.model.Role;

public interface RoleRepository extends JpaRepository<Role,Long>{
	Optional<Role> findByName(ERole name);

}

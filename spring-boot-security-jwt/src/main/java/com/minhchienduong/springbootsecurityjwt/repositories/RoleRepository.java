package com.minhchienduong.springbootsecurityjwt.repositories;

import com.minhchienduong.springbootsecurityjwt.models.ERole;
import com.minhchienduong.springbootsecurityjwt.models.Role;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}

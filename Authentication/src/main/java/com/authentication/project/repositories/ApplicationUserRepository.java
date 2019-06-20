package com.authentication.project.repositories;

import com.authentication.project.models.ApplicationUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationUserRepository extends JpaRepository<ApplicationUser, Long> {

  ApplicationUser findByUsername(String username);
}

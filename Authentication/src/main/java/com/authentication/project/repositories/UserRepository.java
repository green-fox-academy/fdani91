package com.authentication.project.repositories;

import com.authentication.project.models.GitHubUser;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<GitHubUser, Long> {


}

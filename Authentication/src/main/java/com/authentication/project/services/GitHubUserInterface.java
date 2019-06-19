package com.authentication.project.services;

import com.authentication.project.models.GitHubUser;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GitHubUserInterface {

  @GET("/users/{username}")
  Call<GitHubUser> getUser(@Path("username") String username);
}

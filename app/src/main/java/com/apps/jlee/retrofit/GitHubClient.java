package com.apps.jlee.retrofit;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Interface to define our API requests. Retrofit library recognizes annotations that are attached to each method signature.
 * @GET tells Retrofit what kind of request this is, followed by the coresponding API endpoint
 */

public interface GitHubClient
{
    @GET("/users/{user}/repos")
    Call<List<GitHubRepo>> reposForUser(@Path("user") String user);
}

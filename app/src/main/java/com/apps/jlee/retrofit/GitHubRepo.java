package com.apps.jlee.retrofit;

/**
 * This called a model class. Gson uses POJO classes to convert JSON data to objects. Annotations such as @SerializedName are not mandatory but are when we want to name a variable different of
 * the JSON key.
 */
public class GitHubRepo
{
    private String name;

    public String getName()
    {
        return name;
    }
}

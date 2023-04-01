package com.communitystart.communitystart.dto;

public class GithubUser {
    String name;
    Long id;
    String bio;

    public String getName() {
        return name;
    }

    public void setName(String user) {
        this.name = user;
    }

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}

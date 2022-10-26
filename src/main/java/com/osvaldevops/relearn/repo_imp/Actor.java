package com.osvaldevops.relearn.repo_imp;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Actor {
    private final String login;
    private final String avatarUrl;
    private final String htmlUrl;
    @JsonCreator
    public Actor(
            @JsonProperty("login") String login,
            @JsonProperty("avatarUrl") String avatarUrl,
            @JsonProperty("htmlUrl") String htmlUrl
    ){
        this.login = login;
        this.avatarUrl = avatarUrl;
        this.htmlUrl = htmlUrl;
    }

    public String getLogin() {
        return login;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }
}

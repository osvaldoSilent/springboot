package com.osvaldevops.relearn.repo_imp;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Issue {
    private final String htmlUrl;
    private final int number;
    private final String title;

    @JsonCreator
    public Issue(
            @JsonProperty()String htmlUrl,
            @JsonProperty()int number,
            @JsonProperty()String title
    ){
        this.htmlUrl = htmlUrl;
        this.number = number;
        this.title = title;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public int getNumber() {
        return number;
    }

    public String getTitle() {
        return title;
    }
}

package com.osvaldevops.relearn.repo_imp;

import com.osvaldevops.relearn.model.GitHubProject;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class GitHubClient {
    private static final String EVENT_ISSUES_URL = "https://api.github.com/repos/OSVALDEVOPS/SPRINGBOOT/issues/events";
    private final RestTemplate restTemplate;
    public GitHubClient(RestTemplateBuilder builder){
        this.restTemplate = builder.build();
    }
    public ResponseEntity<RepositoryEvent[]> fetchEvents(String orgName, String repoName){
        return this.restTemplate.getForEntity(EVENT_ISSUES_URL, RepositoryEvent[].class, orgName, repoName);
    }
}

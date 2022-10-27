package com.osvaldevops.relearn.controller;

import com.osvaldevops.relearn.model.GitHubProject;
import com.osvaldevops.relearn.repo.RepoGitHubProject;
import com.osvaldevops.relearn.repo_imp.GitHubClient;
import com.osvaldevops.relearn.repo_imp.RepositoryEvent;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EventController {
    private final RepoGitHubProject repoGitHubProject;
    private final GitHubClient gitHubClient;

    public EventController(RepoGitHubProject repoGitHubProject, GitHubClient gitHubClient) {
        this.repoGitHubProject = repoGitHubProject;
        this.gitHubClient = gitHubClient;
    }

    @GetMapping("events/{repoName}")
    @ResponseBody
    public RepositoryEvent[] fetchEvents(@PathVariable String repoName){
        GitHubProject project = this.repoGitHubProject.findByRepo(repoName);
        System.out.println(project.getRepo() + " "+ project.getOrg() );
        return this.gitHubClient.fetchEvents( project.getOrg(), project.getRepo()).getBody();
    }
}

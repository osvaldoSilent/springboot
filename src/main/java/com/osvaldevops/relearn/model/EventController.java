package com.osvaldevops.relearn.model;

import com.osvaldevops.relearn.repo.RepoGitHubProject;
import com.osvaldevops.relearn.repo_imp.GitHubClient;
import com.osvaldevops.relearn.repo_imp.RepositoryEvent;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class EventController {
    private final RepoGitHubProject repoGitHubProject;
    private final GitHubClient gitHubClient;

    public EventController(RepoGitHubProject repoGitHubProject, GitHubClient gitHubClient) {
        this.repoGitHubProject = repoGitHubProject;
        this.gitHubClient = gitHubClient;
    }

    @GetMapping("events/{repoName}")
    public RepositoryEvent[] fetchEvents(@PathVariable String repoName){
        GitHubProject project = this.repoGitHubProject.findByRepo(repoName);
        System.out.println(project.getRepo() + " "+ project.getOrg() );
        return this.gitHubClient.fetchEvents(project.getRepo(), project.getOrg()).getBody();
    }
}

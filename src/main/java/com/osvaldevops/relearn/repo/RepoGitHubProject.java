package com.osvaldevops.relearn.repo;

import com.osvaldevops.relearn.model.GitHubProject;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface RepoGitHubProject extends PagingAndSortingRepository<GitHubProject, Long> {
    GitHubProject findByRepo(String repo);
}

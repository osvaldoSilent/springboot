package com.osvaldevops.relearn.model;

import javax.persistence.*;

@Entity
@Table(name="GITHUBPROJECT")
public class GitHubProject {
    @Id
    @GeneratedValue
    @Column(name="id_gitproject")
    long id;
    @Column(name="org_name")
    String org;
    @Column(name="repo_name")
    String repo;

    public GitHubProject(long id, String org_name, String org) {
        this.id = id;
        this.org = org_name;
        this.repo = org;
    }

    public GitHubProject() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org;
    }

    public String getRepo() {
        return repo;
    }

    public void setRepo(String repo) {
        this.repo = repo;
    }
}

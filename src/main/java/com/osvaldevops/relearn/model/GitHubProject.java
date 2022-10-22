package com.osvaldevops.relearn.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class GitHubProject {
    @Id
    @GeneratedValue
    @Column(name="id_gitproject")
    long id;
    @Column
    String name;
    @Column
    String org;

    public GitHubProject(long id, String name, String org) {
        this.id = id;
        this.name = name;
        this.org = org;
    }

    public GitHubProject() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org;
    }
}

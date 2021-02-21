package com.aplication.QRCodeBadgeGenerator.model;

import jdk.jfr.Name;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "Campo Nome nao pode estar em Branco")
    @Column(name = "name")
    private String name;


    @NotBlank(message = "Campo Email nao pode estar em Branco")
    @Email()
    @Column(name = "email")
    private String email;


    @NotBlank(message = "Campo do Twitter nao pode estar em Branco")
    @Column(name = "twitter")
    private String twitter;

    @NotBlank(message = "Campo do GitHub nao pode estar em Branco")
    @Column(name = "gitHuber")
    private String gitHuber;

    public User(final String name, final String email, final String twitter, final String gitHuber) {
        this.name = name;
        this.email = email;
        this.twitter = twitter;
        this.gitHuber = gitHuber;
    }

    public User(){}


    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(final String twitter) {
        this.twitter = twitter;
    }

    public String getGitHuber() {
        return gitHuber;
    }

    public void setGitHuber(final String gitHuber) {
        this.gitHuber = gitHuber;
    }
}

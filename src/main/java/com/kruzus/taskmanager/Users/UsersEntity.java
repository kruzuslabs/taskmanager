package com.kruzus.taskmanager.Users;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "main_users", schema = "public", catalog = "tasks_db")
public class UsersEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private UUID id;
    @Basic
    @Column(name = "username", nullable = true, length = -1)
    private String username;
    @Basic
    @Column(name = "password", nullable = true, length = -1)
    private String password;
    @Basic
    @Column(name = "joined", nullable = true)
    private Date joined;
    @Basic
    @Column(name = "country", nullable = true, length = -1)
    private String country;
    @Basic
    @Column(name = "total_posts", nullable = true)
    private Integer totalPosts;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getJoined() {
        return joined;
    }

    public void setJoined(Date joined) {
        this.joined = joined;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getTotalPosts() {
        return totalPosts;
    }

    public void setTotalPosts(Integer totalPosts) {
        this.totalPosts = totalPosts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsersEntity that = (UsersEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(username, that.username) && Objects.equals(password, that.password) && Objects.equals(joined, that.joined) && Objects.equals(country, that.country) && Objects.equals(totalPosts, that.totalPosts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password, joined, country, totalPosts);
    }
}

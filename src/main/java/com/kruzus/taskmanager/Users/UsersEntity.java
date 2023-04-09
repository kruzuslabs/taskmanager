package com.kruzus.taskmanager.Users;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "users", schema = "public", catalog = "tasksdb")
public class UsersEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "userid", nullable = false)
    private long userid;
    @Basic
    @Column(name = "username", nullable = true, length = 50)
    private String username;
    @Basic
    @Column(name = "fullname", nullable = true, length = 50)
    private String fullname;
    @Basic
    @Column(name = "password", nullable = true, length = 100)
    private String password;
    @Basic
    @Column(name = "joined", nullable = false, length = -1)
    private String joined;
    @Basic
    @Column(name = "total_tasks", nullable = false)
    private short total_tasks;

    public long getUserid() {
        return userid;
    }

    public void setUserid(long userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJoined() {
        return joined;
    }

    public void setJoined(String joined) {
        this.joined = joined;
    }

    public short getTotaltasks() {
        return total_tasks;
    }

    public void setTotaltasks(short totaltasks) {
        this.total_tasks = totaltasks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        UsersEntity that = (UsersEntity) o;
        return userid == that.userid && total_tasks == that.total_tasks && Objects.equals(username, that.username)
                && Objects.equals(fullname, that.fullname) && Objects.equals(password, that.password)
                && Objects.equals(joined, that.joined);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userid, username, fullname, password, joined, total_tasks);
    }
}

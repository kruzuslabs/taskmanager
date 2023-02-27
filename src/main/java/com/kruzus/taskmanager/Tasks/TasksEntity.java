package com.kruzus.taskmanager.Tasks;

import com.fasterxml.jackson.annotation.JsonSetter;
import jakarta.persistence.*;

import java.util.Objects;

@Entity(name = "TaskEntity")
@Table(name = "tasks", schema = "public", catalog = "taskdb")
public class TasksEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "taskID", nullable = false, unique = true)
    public int taskId;
    @Basic
    @Column(name = "title", nullable = true, length = -1)
    public String title;
    @Basic
    @Column(name = "body", nullable = true, length = -1)
    public String body;
    @Basic
    @Column(name = "date", nullable = true, length = -1)
    public String date;
    @Basic
    @Column(name = "userID", nullable = true, length = -1)
    public String userId;

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TasksEntity that = (TasksEntity) o;
        return taskId == that.taskId && Objects.equals(title, that.title) && Objects.equals(body, that.body) && Objects.equals(date, that.date) && Objects.equals(userId, that.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId, title, body, date, userId);
    }
}

package com.kruzus.taskmanager.Tasks;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "main_tasks", schema = "public", catalog = "tasks_db")
public class TasksEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "task_id", nullable = false)
    private long taskId;
    @Basic
    @Column(name = "posted_by", nullable = true)
    private Object postedBy;
    @Basic
    @Column(name = "title", nullable = true, length = -1)
    private String title;
    @Basic
    @Column(name = "body", nullable = true, length = -1)
    private String body;
    @Basic
    @Column(name = "date", nullable = true)
    private Date date;
    @Basic
    @Column(name = "completed", nullable = false)
    private boolean completed;

    public long getTaskId() {
        return taskId;
    }

    public void setTaskId(long taskId) {
        this.taskId = taskId;
    }

    public Object getPostedBy() {
        return postedBy;
    }

    public void setPostedBy(Object postedBy) {
        this.postedBy = postedBy;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TasksEntity that = (TasksEntity) o;
        return taskId == that.taskId && completed == that.completed && Objects.equals(postedBy, that.postedBy) && Objects.equals(title, that.title) && Objects.equals(body, that.body) && Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId, postedBy, title, body, date, completed);
    }
}

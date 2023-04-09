package com.kruzus.taskmanager.Tasks;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tasks", schema = "public", catalog = "tasksdb")
public class TasksEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private long id;
    @Basic
    @Column(name = "title", nullable = true, length = -1)
    private String title;
    @Basic
    @Column(name = "body", nullable = true, length = -1)
    private String body;
    @Basic
    @Column(name = "due_Date", nullable = false, length = -1)
    private String due_date;
    @Basic
    @Column(name = "time_Posted", nullable = false, length = -1)
    private String time_posted;
    @Basic
    @Column(name = "completed", nullable = false)
    private boolean completed;
    @Basic
    @Column(name = "severity", nullable = false)
    private short severity;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getDueDate() {
        return due_date;
    }

    public void setDueDate(String dueDate) {
        this.due_date = dueDate;
    }

    public String getTimePosted() {
        return time_posted;
    }

    public void setTimePosted(String timePosted) {
        this.time_posted = timePosted;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public short getSeverity() {
        return severity;
    }

    public void setSeverity(short severity) {
        this.severity = severity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TasksEntity that = (TasksEntity) o;
        return id == that.id && completed == that.completed && severity == that.severity && Objects.equals(title, that.title) && Objects.equals(body, that.body) && Objects.equals(due_date, that.due_date) && Objects.equals(time_posted, that.time_posted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, body, due_date, time_posted, completed, severity);
    }
}

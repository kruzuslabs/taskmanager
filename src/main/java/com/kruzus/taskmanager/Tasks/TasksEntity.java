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
    @Column(name = "dueDate", nullable = false, length = -1)
    private String dueDate;
    @Basic
    @Column(name = "timePosted", nullable = false, length = -1)
    private String timePosted;
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
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getTimePosted() {
        return timePosted;
    }

    public void setTimePosted(String timePosted) {
        this.timePosted = timePosted;
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
        return id == that.id && completed == that.completed && severity == that.severity && Objects.equals(title, that.title) && Objects.equals(body, that.body) && Objects.equals(dueDate, that.dueDate) && Objects.equals(timePosted, that.timePosted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, body, dueDate, timePosted, completed, severity);
    }
}

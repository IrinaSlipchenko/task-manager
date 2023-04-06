package ru.home.taskManager.model;

import java.time.Instant;

public class Task {
    private final Long id;
    private final Instant time; // время создания задачи
    private String title;
    private String description;
    private TaskStatus status;
    private Worker performer; // исполнитель задачи

    public Task(Long id, String title, String description, Worker performer) {
        this.id = id;
        this.time = Instant.now();
        this.title = title;
        this.description = description;
        this.status = TaskStatus.NEW;
        this.performer = performer;
    }

    public Long getId() {
        return id;
    }

    public Instant getTime() {
        return time;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public Worker getPerformer() {
        return performer;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public void setPerformer(Worker performer) {
        this.performer = performer;
    }
}

package ru.home.taskManager.model;

public class Worker {
    private final Long id;
    private String name;
    private String position;
    private String avatar; // photo url

    public Worker(Long id, String name, String position, String avatar) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.avatar = avatar;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}

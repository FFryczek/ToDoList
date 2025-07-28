package com.ffryczek.ToDoList;

import jakarta.persistence.*;
import java.util.UUID;
import java.time.LocalDateTime;

@Entity
public class Task {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private UUID id;
    @Column(name ="Name")
    private String name;
    @Column(name ="Description")
    private String description;
    @Column(name ="Due")
    private LocalDateTime due;

    //Empty constructor
    public Task() {
    }

    //Custom constructor
    public Task(UUID id, String name, String description, LocalDateTime due) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.due = due;
    }

    //Custom constructor new task
    public Task( String name, String description, LocalDateTime due) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.description = description;
        this.due = due;
    }    

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getDue() {
        return due;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDue(LocalDateTime due) {
        this.due = due;
    }
}

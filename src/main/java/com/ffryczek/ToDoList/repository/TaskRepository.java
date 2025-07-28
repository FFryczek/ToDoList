package com.ffryczek.ToDoList.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ffryczek.ToDoList.Task;

public interface TaskRepository extends JpaRepository<Task,UUID> {
}

package com.ffryczek.ToDoList.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ffryczek.ToDoList.Task;
import com.ffryczek.ToDoList.service.TaskService;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private final TaskService taskService;

    //Constructor
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    //Crud Methods
    @PostMapping
    public Task postTask(@RequestBody Task task) {
        this.taskService.insert(task);
        return task;
    }

    @GetMapping
    public List<Task> getAlltasks() {
        return this.taskService.getAllTasks();
    }
    @GetMapping("/{id}")
    public Task getTaskById(@PathVariable("id") UUID taskID) {
        return this.taskService.findById(taskID);
    }

    @PutMapping("/{id}")
    public Task putMethodName(@PathVariable("id") UUID taskID, @RequestBody Task task) {
        this.taskService.updateTask(taskID, task);

        return task;
    }
    
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") UUID taskID) {
        this.taskService.removeById(taskID);
    }
    
    

}

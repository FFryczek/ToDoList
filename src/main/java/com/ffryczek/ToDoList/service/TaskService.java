package com.ffryczek.ToDoList.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.ffryczek.ToDoList.Task;
import com.ffryczek.ToDoList.repository.TaskRepository;

@Service
public class TaskService {
    private final TaskRepository taskRepository;

    //Constructor
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    //Methods
    public Task updateTask(UUID taskID, Task updatedTask) throws IllegalArgumentException {
        //Fetch task (if no match for ID throw exception)
        Optional<Task> optionalTask = taskRepository.findById(taskID);
        if (!optionalTask.isPresent()) {
            throw new IllegalArgumentException("\nUnable to find task with provided ID\n");
        }
        //Assign old task
        Task extractedTask = optionalTask.get();
        //Update
        extractedTask.setName(updatedTask.getName());
        extractedTask.setDescription(updatedTask.getDescription());
        extractedTask.setDue(updatedTask.getDue());

        return taskRepository.save(extractedTask);

    }
    
    public Task insert(Task task) {
        return taskRepository.save(task);
    }

    public Task findById(UUID taskID) {
        Optional<Task> optionalTask = taskRepository.findById(taskID);
        if (!optionalTask.isPresent()) {
            throw new IllegalArgumentException("\nUnable to find task with provided ID\n");
        } else {
            return optionalTask.get();
        }
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public void removeById(UUID taskID) {
        taskRepository.deleteById(taskID);
    }

}

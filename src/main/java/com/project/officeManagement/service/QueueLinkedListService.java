package com.project.officeManagement.service;

import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.Queue;

@Service
public class QueueLinkedListService {

    private final Queue<String> taskQueue = new LinkedList<>();

    // Add
    public void addTask(String task) {
        taskQueue.offer(task);
    }

    // Process
    public String processTask() {
        return taskQueue.poll();
    }

    public String peekTask() {
        return taskQueue.peek();
    }
}

package com.project.officeManagement.controller;

import com.project.officeManagement.dto.QueueLinkedListDto;
import com.project.officeManagement.service.QueueLinkedListService;
import lombok.Data;
import lombok.Getter;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/queue")
@Getter
@Data
public class QueueLinkedListController {

    private final QueueLinkedListService queueService;

    public QueueLinkedListController(QueueLinkedListService queueService) {
        this.queueService = queueService;
    }

    @PostMapping("/add")
    public String addTask(@RequestBody QueueLinkedListDto request) {
        queueService.addTask(request.getTaskName());
        return "Task added to LinkedList Queue";
    }

    @GetMapping("/process")
    public String processTask() {
        return queueService.processTask();
    }
}

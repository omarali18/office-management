package com.project.officeManagement.dto;

import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class QueueLinkedListDto {

    private String taskName;

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }
}

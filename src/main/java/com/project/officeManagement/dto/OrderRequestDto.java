package com.project.officeManagement.dto;

import lombok.Data;

@Data
public class OrderRequestDto {
    private String productName;
    private Double amount;
}
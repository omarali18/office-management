package com.project.officeManagement.dto;

import lombok.Data;

@Data
public class PaymentRequestDto {
    private Long orderId;
    private Double paidAmount;
}

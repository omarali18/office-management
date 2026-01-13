package com.project.officeManagement.service;

import com.project.officeManagement.dto.PaymentRequestDto;
import com.project.officeManagement.entity.PaymentEntity;
import com.project.officeManagement.repository.PaymentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class PaymentService {

    private final PaymentRepository paymentRepository;

    @Transactional(
            propagation = Propagation.REQUIRES_NEW,
            isolation = Isolation.SERIALIZABLE,
            rollbackFor = Exception.class,
            noRollbackFor = IllegalArgumentException.class,
            readOnly = false,
            timeout = 20
    )
    public PaymentEntity processPayment(PaymentRequestDto dto) {

        if (dto.getPaidAmount() <= 0) {
            throw new IllegalArgumentException("Invalid payment amount");
        }

        PaymentEntity payment = PaymentEntity.builder()
                .orderId(dto.getOrderId())
                .paidAmount(dto.getPaidAmount())
                .paymentStatus("SUCCESS")
                .build();

        return paymentRepository.save(payment);
    }
}

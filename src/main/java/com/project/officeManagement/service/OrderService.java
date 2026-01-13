package com.project.officeManagement.service;

import com.project.officeManagement.dto.OrderRequestDto;
import com.project.officeManagement.entity.OrderEntity;
import com.project.officeManagement.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;
    private final PaymentService paymentService;

    @Transactional(
            propagation = Propagation.REQUIRED,
            isolation = Isolation.READ_COMMITTED,
            rollbackFor = Exception.class,
            timeout = 30
    )
    public OrderEntity createOrder(OrderRequestDto dto) {

        OrderEntity order_1 = OrderEntity.builder()
                .productName(dto.getProductName())
                .amount(dto.getAmount())
                .status("CREATED")
                .build();

        return orderRepository.save(order_1);
    }

    @Transactional
    public OrderEntity markOrderPaid(Long orderId) {
        OrderEntity order_1 = orderRepository.findById(orderId)
                .orElseThrow(() -> new RuntimeException("Order not found"));

        order_1.setStatus("PAID");
        return orderRepository.save(order_1);
    }
}


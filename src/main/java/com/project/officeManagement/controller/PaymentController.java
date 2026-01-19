package com.project.officeManagement.controller;


import com.project.officeManagement.dto.PaymentRequestDto;
import com.project.officeManagement.entity.PaymentEntity;
import com.project.officeManagement.service.OrderService;
import com.project.officeManagement.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentService paymentService;
    private final OrderService orderService;

    @PostMapping("/payments")
    public ResponseEntity<?> makePayment(
            @RequestBody PaymentRequestDto dto) {

        try {
            PaymentEntity payment = paymentService.processPayment(dto);
            orderService.markOrderPaid(dto.getOrderId());

            return new ResponseEntity<>(payment, HttpStatus.OK);

        } catch (IllegalArgumentException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);

        } catch (Exception e) {
            return new ResponseEntity<>("Payment failed",
                    HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
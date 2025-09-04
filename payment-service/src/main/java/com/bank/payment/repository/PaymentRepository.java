package com.bank.payment.repository;

import com.bank.payment.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
    List<Payment> findByFromAccountIdOrToAccountId(Long fromAccountId, Long toAccountId);
}
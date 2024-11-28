package com.acmeplex.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.acmeplex.model.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
}

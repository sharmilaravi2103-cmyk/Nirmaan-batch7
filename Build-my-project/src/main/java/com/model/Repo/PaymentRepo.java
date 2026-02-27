package com.model.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Payment;
@Repository

public interface PaymentRepo extends JpaRepository<Payment, Long> {

}

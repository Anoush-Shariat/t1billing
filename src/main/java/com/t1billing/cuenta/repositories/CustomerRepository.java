package com.t1billing.cuenta.repositories;

import com.t1billing.cuenta.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}

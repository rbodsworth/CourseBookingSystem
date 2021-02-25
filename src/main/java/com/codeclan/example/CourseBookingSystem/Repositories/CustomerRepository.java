package com.codeclan.example.CourseBookingSystem.Repositories;

import com.codeclan.example.CourseBookingSystem.Models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}

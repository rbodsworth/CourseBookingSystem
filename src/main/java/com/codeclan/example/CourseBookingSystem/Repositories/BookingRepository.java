package com.codeclan.example.CourseBookingSystem.Repositories;

import com.codeclan.example.CourseBookingSystem.Models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}

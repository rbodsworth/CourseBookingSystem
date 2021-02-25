package com.codeclan.example.CourseBookingSystem.Repositories;

import com.codeclan.example.CourseBookingSystem.Models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}

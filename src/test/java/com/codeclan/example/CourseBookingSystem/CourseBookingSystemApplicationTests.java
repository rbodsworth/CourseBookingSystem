package com.codeclan.example.CourseBookingSystem;

import com.codeclan.example.CourseBookingSystem.Models.Booking;
import com.codeclan.example.CourseBookingSystem.Models.Course;
import com.codeclan.example.CourseBookingSystem.Models.Customer;
import com.codeclan.example.CourseBookingSystem.Repositories.BookingRepository;
import com.codeclan.example.CourseBookingSystem.Repositories.CourseRepository;
import com.codeclan.example.CourseBookingSystem.Repositories.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CourseBookingSystemApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	BookingRepository bookingRepository;

	@Test
	public void createCustomerCourseAndBooking(){

		Customer customer1 = new Customer("Richard", "Edinburgh", 35);
		customerRepository.save(customer1);

		Course course1 = new Course("Intro to Python", "Edinburgh", 5);
		courseRepository.save(course1);

		Booking booking1 = new Booking("25/02/2021", customer1, course1);
		bookingRepository.save(booking1);

	}
}
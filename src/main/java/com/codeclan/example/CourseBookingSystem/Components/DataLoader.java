package com.codeclan.example.CourseBookingSystem.Components;

import com.codeclan.example.CourseBookingSystem.Models.Booking;
import com.codeclan.example.CourseBookingSystem.Models.Course;
import com.codeclan.example.CourseBookingSystem.Models.Customer;
import com.codeclan.example.CourseBookingSystem.Repositories.BookingRepository;
import com.codeclan.example.CourseBookingSystem.Repositories.CourseRepository;
import com.codeclan.example.CourseBookingSystem.Repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {

        Customer customer1 = new Customer("Richard", "Edinburgh", 35);
        customerRepository.save(customer1);

        Customer customer2 = new Customer("Thomas", "Glasgow", 28);
        customerRepository.save(customer2);

        Customer customer3 = new Customer("James", "Inverness", 44);
        customerRepository.save(customer3);

        Course course1 = new Course("Intro to Python", "Edinburgh", 5);
        courseRepository.save(course1);

        Course course2 = new Course("CSS", "Glasgow", 3);
        courseRepository.save(course2);

        Course course3 = new Course("Advanced Java", "Edinburgh", 4);
        courseRepository.save(course3);

        Booking booking1 = new Booking("25/02/2021", customer1, course1);
        bookingRepository.save(booking1);

        Booking booking2 = new Booking("27/02/2021", customer2, course2);
        bookingRepository.save(booking2);

        Booking booking3 = new Booking("27/02/2021", customer3, course2);
        bookingRepository.save(booking3);

        Booking booking4 = new Booking("05/03/2021", customer1, course3);
        bookingRepository.save(booking3);

}
}

package com.example.student.student.StudentConfig;

import com.example.student.student.studentModel.Student;
import com.example.student.student.studentRepository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.APRIL;
import static java.time.Month.FEBRUARY;
//
//@Configuration
//public class StudentConfig {
//    @Bean
//    CommandLineRunner commandLineRunner(StudentRepository repository) {
//        return args -> {
//            Student james = new Student(
//                    "James Martin",
//                    "jamesmartin@gmail.com",
//                    LocalDate.of(2000, APRIL, 4)
//            );
//            Student kayshan = new Student(
//                            "Kayshan West",
//                            "Kay@gmail.com",
//                            LocalDate.of(2004, FEBRUARY, 16)
//            );
//
//            repository.saveAll(
//                    List.of(james, kayshan)
//            );
//        };
//    }
//}

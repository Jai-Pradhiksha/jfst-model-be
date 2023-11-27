package com.saveetha.jfstmodelbe.emp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class EmployeeConfiguration {

    @Bean
    CommandLineRunner commandLineRunner(EmployeeRepository employeeRepository)
    {
        return args -> {
            Employee Jai = new Employee(
                    "Jai",
                    LocalDate.of(2003, Month.NOVEMBER,28),
                    "Jai@email.com"
            );

            Employee Mira = new Employee(
                    "Mira",
                    LocalDate.of(2004, Month.JANUARY,6),
                    "mira@email.com"
            );

            Employee Ram = new Employee(
                    "Ram",
                    LocalDate.of(2000, Month.JANUARY,15),
                    "ram@email.com"
            );

            Employee Prathiba = new Employee(
                    "Prathiba",
                    LocalDate.of(2008, Month.DECEMBER,22),
                    "nami@email.com"
            );

            employeeRepository.saveAll(
                    List.of(Jai, Mira, Ram, Prathiba)
            );
        };
    }
}

package org.hsf.dao;

import org.hsf.entities.Department;
import org.hsf.entities.Job;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;

import static org.junit.jupiter.api.Assertions.*;

class JobDaoImplTest {
    private static JobDao jobDao;

    @BeforeAll
    static void setup() {
        jobDao = new JobDaoImpl();
    }

    @Test
    void createJob() {
        // Input
        Job job = new Job();

        job.setTitle("Senior Java Backend Developer");
        job.setDescription("""
                We are looking for a Senior Java Backend Developer 
                with strong experience in Spring Boot, Microservices, 
                PostgreSQL, Docker, and Kubernetes.
                
                Responsibilities:
                - Design scalable APIs
                - Build Microservices
                - Optimize database queries
                
                Benefits:
                - Remote working
                - 13th month salary
                - Premium healthcare
                """);

        job.setLocation("Ha Noi, Viet Nam");

        job.setSalaryMin(1500.00);
        job.setSalaryMax(3000.00);

        job.setStatus("OPEN");

        job.setUtmSource("linkedin");
        job.setUtmMedium("social");

        job.setDeadline(
                OffsetDateTime.of(
                        2026,
                        06,
                        12,
                        23,
                        59,
                        59,
                        0,
                        ZoneOffset.ofHours(7)
                )
        );

        job.setPublishedAt(OffsetDateTime.now());

        Department department = new Department();
        department.setId(2L);

        job.setDepartment(department);

        // Actual Result
        Job actualResult = jobDao.createJob(job);

        assertEquals(job, actualResult);
    }

    @Test
    void findByTitle() {
    }
}
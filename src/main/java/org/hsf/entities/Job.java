package org.hsf.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.OffsetDateTime;

@Entity
@Table(name = "jobs")
@NoArgsConstructor@AllArgsConstructor
@Getter@Setter
@ToString
@Builder
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(unique = true, nullable = false, columnDefinition = "VARCHAR(500)")
    private String title;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String description;

    @Column(nullable = false, columnDefinition = "VARCHAR(500)")
    private String location;

    @Column(name = "salary_min", columnDefinition = "NUMERIC(15,2)")
    private Double salaryMin;

    @Column(name = "salary_max", columnDefinition = "NUMERIC(15,2)")
    private Double salaryMax;

    @Column(columnDefinition = "VARCHAR(50)")
    private String status;

    @Column(name = "utm_source", columnDefinition = "VARCHAR(150)")
    private String utmSource;

    @Column(name = "utm_medium", columnDefinition = "VARCHAR(150)")
    private String utmMedium;

    private OffsetDateTime deadline;

    private OffsetDateTime publishedAt;

    @ManyToOne
    @JoinColumn(name = "department_id", referencedColumnName = "department_id")
    private Department department;

    @ManyToOne
    @JoinColumn(name = "recruiter_id", referencedColumnName = "id")
    private User user;
}

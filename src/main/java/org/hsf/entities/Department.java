package org.hsf.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "departments")
@NoArgsConstructor@AllArgsConstructor
@Getter@Setter
@ToString
public class Department extends BaseEntity {
    @Id
    @Column(name = "department_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "department_name", unique = true, nullable = false, columnDefinition = "NVARCHAR(255)")
    private String departmentName;

    @Column(columnDefinition = "TEXT")
    private String description;
}
package org.hsf.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "interview_templates")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class InterviewTemplate extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "template_name", columnDefinition = "VARCHAR(255)")
    private String templateName;

    @Column(name = "file_path", columnDefinition = "VARCHAR(1000)")
    private String filePath;

    @Column(name = "is_active")
    private Boolean isActive;

    @OneToOne(mappedBy = "interviewTemplate")
    private Interview interview;
}

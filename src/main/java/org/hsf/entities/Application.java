package org.hsf.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.OffsetDateTime;

@Entity
@Table(name = "applications")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Application extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(columnDefinition = "VARCHAR(50)")
    private String status;

    @Column(name = "applied_at")
    private OffsetDateTime appliedAt;

    @ManyToOne
    @JoinColumn(name = "job_id", referencedColumnName = "id")
    private Job job;

    @OneToOne
    @JoinColumn(name = "candidate_id", referencedColumnName = "id")
    private Candidate candidate;

    @OneToOne
    @JoinColumn(name = "cv_id", referencedColumnName = "id")
    private CV cv;

    @ManyToOne
    @JoinColumn(name = "department_id", referencedColumnName = "department_id")
    private Department department;

    @OneToOne(mappedBy = "candidate")
    private EvaluationNote evaluationNote;
}

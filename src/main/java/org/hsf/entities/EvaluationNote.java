package org.hsf.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "evaluation_notes")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class EvaluationNote extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(columnDefinition = "TEXT")
    private String content;

    @OneToOne
    @JoinColumn(name = "application_id", columnDefinition = "id")
    private Application application;
}

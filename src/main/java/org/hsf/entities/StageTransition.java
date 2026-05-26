package org.hsf.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.OffsetDateTime;

@Entity
@Table(name = "stage_transitions")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class StageTransition extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(columnDefinition = "TEXT")
    private String notes;

    @Column(name = "moved_at")
    private OffsetDateTime movedAt;

    @ManyToOne
    @JoinColumn(name = "application_id", referencedColumnName = "id")
    private Application application;

    @ManyToOne
    @JoinColumn(name = "from_stage_id", referencedColumnName = "id")
    private PipelineStage fromStage;

    @ManyToOne
    @JoinColumn(name = "to_stage_id", referencedColumnName = "id")
    private PipelineStage toStage;

}

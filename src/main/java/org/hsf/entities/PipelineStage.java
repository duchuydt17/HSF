package org.hsf.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Table(name = "pipeline_stages")
@NoArgsConstructor@AllArgsConstructor
@Getter@Setter
@ToString
public class PipelineStage extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "stage_name", columnDefinition = "VARCHAR(100)")
    private String stageName;

    @Column(name = "stage_order")
    private int stageOrder;

    @Column(columnDefinition = "VARCHAR(30)")
    private String color;

    @Column(name = "is_default")
    private Boolean isDefault;

    @OneToMany(mappedBy = "fromStage")
    private Set<StageTransition> fromStagess;

    @OneToMany(mappedBy = "toStage")
    private Set<StageTransition> toStages;

    @OneToOne(mappedBy = "transferredFrom")
    private Application application;

    @OneToOne(mappedBy = "pipelineStageId")
    private PipelineStage pipelineStage;
}

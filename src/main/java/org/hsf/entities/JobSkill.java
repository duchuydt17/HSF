package org.hsf.entities;

import jakarta.persistence.*;

@Entity
public class JobSkill {
    @Id
    @Column(name = "job_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Job job;

    @Id
    @Column(name = "skill_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Skill skill;
}

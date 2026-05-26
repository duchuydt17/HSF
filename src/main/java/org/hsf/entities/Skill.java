package org.hsf.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Table(name = "skills")
@NoArgsConstructor@AllArgsConstructor
@Getter@Setter
@ToString
public class Skill extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "skill_name", columnDefinition = "VARCHAR(150)")
    private String skillName;

    @Column(columnDefinition = "VARCHAR(150)")
    private String category;

    @OneToMany(mappedBy = "skill")
    private Set<JobSkill> jobSkills;

    @OneToMany(mappedBy = "skill")
    private Set<CandidateSkill> candidateSkills;
}

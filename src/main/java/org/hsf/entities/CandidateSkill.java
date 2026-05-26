package org.hsf.entities;

import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

public class CandidateSkill {
    @Id
    @Column(name = "candidate_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Candidate candidate;

    @Id
    @Column(name = "skill_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Skill skill;
}

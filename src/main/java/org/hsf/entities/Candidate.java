package org.hsf.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Table(name = "candidates")
@NoArgsConstructor@AllArgsConstructor
@Getter@Setter
@ToString
public class Candidate extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "full_name", columnDefinition = "VARCHAR(255)")
    private String fullName;

    @Column(columnDefinition = "VARCHAR(255)")
    private String email;

    @Column(name = "password_hash", columnDefinition = "VARCHAR(255)")
    private String passwordHash;

    @Column(name = "auth_provider", columnDefinition = "VARCHAR(50)")
    private String authProvider;

    @Column(name = "oauth_provider_id", columnDefinition = "VARCHAR(255)")
    private String oauthProviderId;

    @Column(columnDefinition = "VARCHAR(50)")
    private String status;

    @Column(columnDefinition = "VARCHAR(30)")
    private String phone;

    @Column(columnDefinition = "VARCHAR(150)")
    private String source;

    @Column(columnDefinition = "VARCHAR(150)")
    private String utm_source;

    @Column(name = "utm_source", columnDefinition = "VARCHAR(150)")
    private String utmSource;

    @Column(name = "utm_medium", columnDefinition = "VARCHAR(150)")
    private String utmMedium;

    @Column(name = "utm_campaign", columnDefinition = "VARCHAR(255)")
    private String utmCampaign;

    @Column(name = "is_duplicate")
    private Boolean isDuplicate;

    @OneToMany(mappedBy = "candidate")
    private Set<CandidateSkill> candidateSkills;

    @OneToOne(mappedBy = "candidate")
    private CV cv;

    @OneToOne(mappedBy = "candidate")
    private Set<Application> applications;
}

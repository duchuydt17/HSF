package org.hsf.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Table(name = "users")
@NoArgsConstructor@AllArgsConstructor
@Getter@Setter
@ToString
public class User extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "full_name", columnDefinition = "VARCHAR(255)")
    private String fullName;

    @Column(columnDefinition = "VARCHAR(255)")
    private String email;

    @Column(name = "password_hash", columnDefinition = "VARCHAR(255)")
    private String passwordHash;

    @Column(columnDefinition = "VARCHAR(30)")
    private String phone;

    @Column(columnDefinition = "VARCHAR(30)")
    private String role;

    @Column(name = "sso_provider_id", columnDefinition = "VARCHAR(255)")
    private String ssoProviderId;

    @Column(columnDefinition = "VARCHAR(50)")
    private String status;

    @ManyToOne
    @JoinColumn(name = "department_id", referencedColumnName = "department_id")
    private Department department;

    @OneToMany(mappedBy = "user")
    private Set<Job> jobs;

    @OneToMany(mappedBy = "user")
    private Set<Notification> notifications;

    @OneToMany(mappedBy = "user")
    private Set<InterviewInterviewer> interviewInterviewers;
}

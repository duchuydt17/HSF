package org.hsf.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.OffsetDateTime;
import java.util.Set;

@Entity
@Table(name = "interviews")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Interview extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "interview_type", columnDefinition = "VARCHAR(50)")
    private String interviewType;

    @Column(name = "scheduled_at")
    private OffsetDateTime scheduledAt;

    @Column(name = "meeting_link", columnDefinition = "VARCHAR(1000)")
    private String meetingLink;

    @Column(columnDefinition = "VARCHAR(50)")
    private String status;

    @Column(name = "duration_minutes")
    private int durationMinutes;

    @Column(columnDefinition = "TEXT")
    private String feedback;

    @Column(columnDefinition = "VARCHAR(50)")
    private String result;

    @Column(name = "interviewer_name", columnDefinition = "VARCHAR(255)")
    private String interviewerName;

    @Column(name = "interviewer_email", columnDefinition = "VARCHAR(255)")
    private String interviewerEmail;

    @Column(name = "notes_file_path", columnDefinition = "VARCHAR(1000)")
    private String notesFilePath;

    @OneToOne
    @JoinColumn(name = "application_id", referencedColumnName = "id")
    private Application application;

    @OneToOne
    @JoinColumn(name = "interview_template_id", referencedColumnName = "id")
    private InterviewTemplate interviewTemplate;

    @OneToMany(mappedBy = "interview")
    private Set<InterviewInterviewer> interviewInterviewers;
}

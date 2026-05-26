package org.hsf.entities;

import jakarta.persistence.*;

@Entity
public class InterviewInterviewer {
    @Id
    @ManyToOne
    @JoinColumn(name = "interview_id", referencedColumnName = "id")
    private Interview interview;

    @Id
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;
}

package org.hsf.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.OffsetDateTime;

@Entity
@Table(name = "email_logs")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class EmailLog extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "recipient_email", columnDefinition = "VARCHAR(255)")
    private String recipientEmail;

    @Column(columnDefinition = "VARCHAR(50)")
    private String status;

    @Column(name = "sent_at")
    private OffsetDateTime sentAt;

    @ManyToOne
    @JoinColumn(name = "email_template_id", referencedColumnName = "id")
    private EmailTemplate emailTemplate;
}

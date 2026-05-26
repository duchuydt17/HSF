package org.hsf.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Table(name = "email_templates")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class EmailTemplate extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "template_name", columnDefinition = "VARCHAR(255)")
    private String templateName;

    @Column(columnDefinition = "VARCHAR(50)")
    private String type;

    @Column(columnDefinition = "VARCHAR(500)")
    private String subject;

    @Column(name = "body_html", columnDefinition = "TEXT")
    private String bodyHtml;

    @Column(columnDefinition = "TEXT")
    private String placeholders;

    @Column(name = "is_active")
    private Boolean isActive;

    @OneToMany(mappedBy = "emailTemplate")
    private Set<EmailLog> emailLogs;
}
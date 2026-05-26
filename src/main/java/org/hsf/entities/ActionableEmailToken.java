package org.hsf.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.OffsetDateTime;

@Entity
@Table(name = "actionable_email_tokens")
@NoArgsConstructor@AllArgsConstructor
@Getter@Setter
@ToString
public class ActionableEmailToken extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "token_hash", columnDefinition = "VARCHAR(512)")
    private String tokenHash;

    @Column(name = "action_type", columnDefinition = "VARCHAR(50)")
    private String actionType;

    @Column(name = "expires_at")
    private OffsetDateTime expiresAt;

    @Column(name = "used_at")
    private OffsetDateTime usedAt;

    @OneToOne
    @JoinColumn(name = "application_id", referencedColumnName = "id")
    private Application application;
}

package org.hsf.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "audit_logs")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class AuditLog extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "entity_type", columnDefinition = "VARCHAR(150)")
    private String entityType;

    @Column(name = "entity_id")
    private long entityId;

    @Column(columnDefinition = "VARCHAR(50)")
    private String action;

    @Column(columnDefinition = "JSONB")
    private String changes;

    @Column(name = "ip_address", columnDefinition = "VARCHAR(50)")
    private String ipAddress;
}

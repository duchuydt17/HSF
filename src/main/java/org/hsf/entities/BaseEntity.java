package org.hsf.entities;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor@AllArgsConstructor
@Getter@Setter
@ToString
@MappedSuperclass
public class BaseEntity {
    @Column(name = "created_at")
    private LocalDateTime createdAt;
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
    @Column(name = "deleted_at")
    private LocalDateTime deleted_at;
    @Column(name = "is_deleted")
    private Boolean isDeleted;
    @Column(name = "created_by", columnDefinition = "VARCHAR(255)")
    private String createdBy;
    @Column(name = "updated_by", columnDefinition = "VARCHAR(255)")
    private String updatedBy;
}

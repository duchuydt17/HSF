package org.hsf.entities;

import jakarta.persistence.*;

import java.time.OffsetDateTime;

@Entity
@Table(name = "cvs")
public class CV extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "file_path", columnDefinition = "VARCHAR(1000)")
    private String filePath;

    @Column(name = "file_type", columnDefinition = "VARCHAR(50)")
    private String fileType;

    @Column(name = "parsed_data", columnDefinition = "JSONB")
    private String parsedData;

    @Column(name = "parsed_status", columnDefinition = "VARCHAR(50)")
    private String parsedStatus;

    @Column(name = "uploaded_at")
    private OffsetDateTime uploadedAt;
}

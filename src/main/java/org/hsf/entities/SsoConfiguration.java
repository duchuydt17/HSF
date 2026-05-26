package org.hsf.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "sso_configurations")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class SsoConfiguration extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "provider_type", columnDefinition = "VARCHAR(50)")
    private String providerType;

    @Column(name = "ldap_url", columnDefinition = "VARCHAR(500)")
    private String ldapUrl;

    @Column(name = "base_dn", columnDefinition = "VARCHAR(500)")
    private String baseDn;

    @Column(name = "bind_user", columnDefinition = "VARCHAR(255)")
    private String bindUser;

    @Column(name = "is_active")
    private Boolean isActive;
}

package com.hnzl.glowdrop.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "services")
public class Service {

    @Id
    private String id;

    @Enumerated(EnumType.STRING)
    @Column(name = "owner_type")
    private OwnerType ownerType;

    @Column(name = "owner_id")
    private String ownerId;

    @Column(name = "name")
    private String name;

    @Column(name = "base_price_cents")
    private Integer basePrice; // rename to basePrice and add currency

    @Column(name = "duration_min")
    private Integer durationMin;

    @Column(name = "description")
    private String description;
}

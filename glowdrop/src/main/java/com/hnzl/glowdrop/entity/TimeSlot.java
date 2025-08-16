package com.hnzl.glowdrop.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.Instant;

@Data
@Entity
@Table(name = "time_slots")
public class TimeSlot {

    @Id
    private String id;

    @ManyToOne
    @JoinColumn(name = "service_id")
    private Service service;

    @Enumerated(EnumType.STRING)
    @Column(name = "type")
    private SlotType type;

    @ManyToOne
    @JoinColumn(name = "salon_id")
    private Salon salon;

    @ManyToOne
    @JoinColumn(name = "private_studio_id")
    private PrivateStudio privateStudio;

    @ManyToOne
    @JoinColumn(name = "performer_pro_id")
    private ProProfile performer;

    @Column(name = "start_at")
    private Instant startAt;

    @Column(name = "end_at")
    private Instant endAt;

    @Column(name = "price_cents")
    private Integer price;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private SlotStatus status;
}

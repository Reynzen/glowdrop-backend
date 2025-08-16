package com.hnzl.glowdrop.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "salon_staff")
public class SalonStaff {

    @Id
    private String id;

    @ManyToOne
    @JoinColumn(name = "salon_id")
    private Salon salon;

    @ManyToOne
    @JoinColumn(name = "pro_id")
    private ProProfile pro;

    @Column(name = "role")
    private String role;
}

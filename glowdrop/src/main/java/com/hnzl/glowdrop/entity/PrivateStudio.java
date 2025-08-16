package com.hnzl.glowdrop.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "private_studio")
public class PrivateStudio {

    @Id
    private String id;

    @ManyToOne
    @JoinColumn(name = "pro_id")
    private ProProfile pro;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "city")
    private String city;

    @Column(name = "lat")
    private Double lat;

    @Column(name = "lng")
    private Double lng;
}

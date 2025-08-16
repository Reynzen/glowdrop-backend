package com.hnzl.glowdrop.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "salons")
public class Salon {

    @Id
    private String id;

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

    @Column(name = "logo_url")
    private String logoUrl;
}

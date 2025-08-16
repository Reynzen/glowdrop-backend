package com.hnzl.glowdrop.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "pro_profiles")
public class ProProfile {

    @Id
    private String id;

    @Column(name = "display_name")
    private String displayName;

    @Column(name = "email")
    private String email;

    @Column(name = "avatar_url")
    private String avatarUrl;

    @Column
    private String city;
}

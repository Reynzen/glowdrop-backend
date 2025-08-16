package com.hnzl.glowdrop.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.Instant;

@Data
@AllArgsConstructor
public class SlotModel {
    private String serviceName;
    private Integer basePrice;
    private Integer durationMin;
    private String performerName;
    private String performerAvatar;
    private Instant startAt;
    private Integer price;
    private String locationName;
    private String address;
    private String city;
}

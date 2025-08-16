package com.hnzl.glowdrop.repository;

import com.hnzl.glowdrop.entity.SlotStatus;
import com.hnzl.glowdrop.entity.TimeSlot;
import com.hnzl.glowdrop.model.SlotModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TimeSlotsRepository extends JpaRepository<TimeSlot, String> {

    @Query("""
            SELECT new com.hnzl.glowdrop.model.SlotModel(
                s.name,
                s.basePrice,
                s.durationMin,
                p.displayName,
                p.avatarUrl,
                t.startAt,
                t.price,
                COALESCE(sa.name, ps.name),
                COALESCE(sa.address, ps.address),
                COALESCE(sa.city, ps.city)
            )
            FROM TimeSlot t
            JOIN t.service s
            JOIN t.performer p
            LEFT JOIN t.salon sa
            LEFT JOIN t.privateStudio ps
            WHERE t.status = :status
            """)
    List<SlotModel> findByStatus(SlotStatus status);
}

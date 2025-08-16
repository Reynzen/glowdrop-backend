package com.hnzl.glowdrop.controller;

import com.hnzl.glowdrop.entity.SlotStatus;
import com.hnzl.glowdrop.model.SlotModel;
import com.hnzl.glowdrop.repository.TimeSlotsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class SlotController {

    private final TimeSlotsRepository timeSlotRepository;

    @GetMapping("/api/slots")
    public List<SlotModel> getAvailableSlots() {
        return timeSlotRepository.findByStatus(SlotStatus.AVAILABLE);
    }
}

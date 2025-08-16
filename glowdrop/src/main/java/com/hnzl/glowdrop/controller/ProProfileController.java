package com.hnzl.glowdrop.controller;

import com.hnzl.glowdrop.entity.ProProfile;
import com.hnzl.glowdrop.repository.ProProfileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/profiles")
@RequiredArgsConstructor
public class ProProfileController {

    private final ProProfileRepository repository;

    @GetMapping
    public List<ProProfile> all() {
        return repository.findAll();
    }
}

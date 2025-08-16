package com.hnzl.glowdrop.repository;

import com.hnzl.glowdrop.entity.ProProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProProfileRepository extends JpaRepository<ProProfile, String> { }

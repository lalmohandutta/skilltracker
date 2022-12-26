package com.ayushcoaching.springboot.skilltracker.profile.repository;

import com.ayushcoaching.springboot.skilltracker.profile.entity.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Long> {
    Profile findByProfileId(Long profileId);
}

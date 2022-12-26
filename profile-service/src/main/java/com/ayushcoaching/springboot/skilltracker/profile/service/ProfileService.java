package com.ayushcoaching.springboot.skilltracker.profile.service;

import com.ayushcoaching.springboot.skilltracker.profile.entity.Profile;
import com.ayushcoaching.springboot.skilltracker.profile.repository.ProfileRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ProfileService {

    @Autowired
    private ProfileRepository profileRepository;

    public Profile saveProfile(Profile profile) {
        log.info("Inside method of save Profile service");
        return profileRepository.save(profile);
    }

    public Profile getProfile(Long profileId) {

        return profileRepository.findByProfileId(profileId);
    }
}

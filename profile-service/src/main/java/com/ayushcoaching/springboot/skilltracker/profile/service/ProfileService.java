package com.ayushcoaching.springboot.skilltracker.profile.service;

import com.ayushcoaching.springboot.skilltracker.profile.entity.Profile;
import com.ayushcoaching.springboot.skilltracker.profile.repository.ProfileRepository;
import com.ayushcoaching.springboot.skilltracker.profile.vo.FSEProfile;
import com.ayushcoaching.springboot.skilltracker.profile.vo.Skill;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
@Slf4j
public class ProfileService {

    @Autowired
    private ProfileRepository profileRepository;
    @Autowired
    private RestTemplate restTemplate;

    public Profile saveProfile(Profile profile) {
        log.info("Inside method of save Profile service");
        return profileRepository.save(profile);
    }

    public Profile getProfile(Long profileId) {

        return profileRepository.findByProfileId(profileId);
    }

    public FSEProfile getCompleteProfile(Long profileId) {

        FSEProfile fseProfile = new FSEProfile();

        Profile profile = profileRepository.findByProfileId(profileId);
        fseProfile.setProfile(profile);

        List<Skill> skills = restTemplate.getForObject("http://localhost:9002/skill/getskillbyprofile/" + profileId, List.class);

        fseProfile.setSkills(skills);

        return fseProfile;

    }
}

package com.ayushcoaching.springboot.skilltracker.profile.controller;

import com.ayushcoaching.springboot.skilltracker.profile.entity.Profile;
import com.ayushcoaching.springboot.skilltracker.profile.service.ProfileService;
import com.ayushcoaching.springboot.skilltracker.profile.vo.FSEProfile;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/profile")
@Slf4j
public class ProfileController {

    @Autowired
    private ProfileService profileService;

    @PostMapping("/save")
    public Profile saveProfile(@RequestBody Profile profile){
        log.info("Inside method of Save Profile controller");
        return profileService.saveProfile(profile);
    }

    @GetMapping("/getprofile/{id}")
    public Profile getProfile(@PathVariable("id") Long profileId){
        log.info("Inside method of Get Profile controller");
        return profileService.getProfile(profileId);
    }

    @GetMapping("/getcompleteprofile/{id}")

    public FSEProfile getCompleteProfile(@PathVariable("id") Long profileId){
        log.info("Inside method of Get Profile controller");
        return profileService.getCompleteProfile(profileId);
    }

}

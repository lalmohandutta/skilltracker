package com.ayushcoaching.springboot.skilltracker.skill.controller;

import com.ayushcoaching.springboot.skilltracker.skill.entity.Skill;
import com.ayushcoaching.springboot.skilltracker.skill.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/skill")
public class SkillController {

    @Autowired
    private SkillService skillService;

    @PostMapping("/save")
    public Skill saveSkill(@RequestBody Skill skill){
        return skillService.saveSkill(skill);
    }

    @GetMapping("/getskill/{id}")
    public Skill getSkill(@PathVariable("id") Long skillId){
        return  skillService.getSkill(skillId);
    }


    @GetMapping("/getskillbyprofile/{id}")
    public List<Skill> getSkillByProfile(@PathVariable("id") Long profileId){
        return  skillService.getSkillByProfile(profileId);
    }



}

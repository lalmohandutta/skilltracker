package com.ayushcoaching.springboot.skilltracker.skill.service;

import com.ayushcoaching.springboot.skilltracker.skill.entity.Skill;
import com.ayushcoaching.springboot.skilltracker.skill.repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillService {
    @Autowired
    private SkillRepository skillRepository;


    public Skill saveSkill(Skill skill) {

        return  skillRepository.save(skill);
    }

    public Skill getSkill(Long skillId) {

        return skillRepository.findBySkillId(skillId);
    }

    public List<Skill> getSkillByProfile(Long profileId) {

        return skillRepository.findByProfileId(profileId);
    }
}

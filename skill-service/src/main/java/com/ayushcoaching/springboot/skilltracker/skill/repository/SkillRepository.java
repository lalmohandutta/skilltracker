package com.ayushcoaching.springboot.skilltracker.skill.repository;

import com.ayushcoaching.springboot.skilltracker.skill.entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Long> {
    Skill findBySkillId(Long skillId);

    List<Skill> findByProfileId(Long profileId);
}

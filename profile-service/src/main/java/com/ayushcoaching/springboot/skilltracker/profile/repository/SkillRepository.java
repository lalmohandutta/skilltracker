package com.ayushcoaching.springboot.skilltracker.profile.repository;

import com.ayushcoaching.springboot.skilltracker.profile.entity.Profile;
import com.ayushcoaching.springboot.skilltracker.profile.entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Long> {
    Skill findBySkillId(Long skillId);
}

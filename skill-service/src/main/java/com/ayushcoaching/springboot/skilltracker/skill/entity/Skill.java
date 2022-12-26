package com.ayushcoaching.springboot.skilltracker.skill.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long skillId;

    private String skillName;

    private Integer proficiencyLevel;

    private Long profileId;


}

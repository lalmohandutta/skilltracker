package com.ayushcoaching.springboot.skilltracker.profile.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Skill {
    private Long skillId;

    private String skillName;

    private Integer proficiencyLevel;

    private Long profileId;

}

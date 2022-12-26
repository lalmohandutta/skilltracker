package com.ayushcoaching.springboot.skilltracker.profile.vo;

import com.ayushcoaching.springboot.skilltracker.profile.entity.Profile;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FSEProfile {

    private Profile profile;

    private List<Skill> skills;
}

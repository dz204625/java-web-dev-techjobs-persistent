package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    private String skillDescription;

    @ManyToMany(mappedBy="skills")
    private final List<Job> jobs = new ArrayList<>();


    public Skill() {
    }

    public Skill(String skillDescription) {
        this.skillDescription = skillDescription;
    }

    public String getSkillDescription() {
        return skillDescription;
    }

    public void setSkillDescription(String skillDescription) {
        this.skillDescription = skillDescription;
    }

    public List<Job> getJobs() {
        return jobs;
    }


}
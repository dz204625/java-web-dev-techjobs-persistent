package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @OneToMany(mappedBy = "employer")
    //@JoinColumn
    private List<Job> jobs = new ArrayList<>();

    @Size(min =1, max =300 , message = "Location must be between 1 to 300 characters long!")
    @NotBlank
    private String location;

    public Employer(){
    }

    public Employer(List<Job> jobs, String location) {
        this.jobs = jobs;
        this.location = location;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
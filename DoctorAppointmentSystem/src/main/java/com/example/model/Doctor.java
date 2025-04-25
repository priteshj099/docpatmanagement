package com.example.model;

import javax.persistence.*;

@Entity
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String specialization;
    private String education;
    private int experience;
    private String profileDetails;

    // Default constructor
    public Doctor() {
    }

    // Parameterized constructor
    public Doctor(Long id, String name, String specialization, String education, int experience, String profileDetails) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
        this.education = education;
        this.experience = experience;
        this.profileDetails = profileDetails;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getProfileDetails() {
        return profileDetails;
    }

    public void setProfileDetails(String profileDetails) {
        this.profileDetails = profileDetails;
    }

    // toString method
    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", specialization='" + specialization + '\'' +
                ", education='" + education + '\'' +
                ", experience=" + experience +
                ", profileDetails='" + profileDetails + '\'' +
                '}';
    }
}

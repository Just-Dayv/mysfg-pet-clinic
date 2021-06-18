package com.sprin5.tutorials.mysfgpetclinic.model;

import java.util.Set;

public class Vet extends Person{

    private Set<Specialty>specialties;

    public Set<Specialty> getSpecialties() {
        return specialties;
    }

    public void setSpecialties(Set<Specialty> specialties) {
        this.specialties = specialties;
    }
}

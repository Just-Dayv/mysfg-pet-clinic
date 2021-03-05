package com.sprin5.tutorials.mysfgpetclinic.services;

import com.sprin5.tutorials.mysfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastName);
    Owner findById(Long id);
    Owner save (Owner owner);
    Set<Owner> findAll();
}

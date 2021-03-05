package com.sprin5.tutorials.mysfgpetclinic.services;

import com.sprin5.tutorials.mysfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet owner);
    Set<Pet> findAll();
}

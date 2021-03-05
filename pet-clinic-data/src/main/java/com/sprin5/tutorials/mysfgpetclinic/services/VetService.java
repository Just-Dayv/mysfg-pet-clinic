package com.sprin5.tutorials.mysfgpetclinic.services;

import com.sprin5.tutorials.mysfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}

package com.sprin5.tutorials.mysfgpetclinic.services.map;

import com.sprin5.tutorials.mysfgpetclinic.model.Vet;
import com.sprin5.tutorials.mysfgpetclinic.services.CrudService;
import com.sprin5.tutorials.mysfgpetclinic.services.VetService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet,Long> implements VetService {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(),object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}

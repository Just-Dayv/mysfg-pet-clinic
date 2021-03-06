package com.sprin5.tutorials.mysfgpetclinic.services.map;

import com.sprin5.tutorials.mysfgpetclinic.model.Owner;
import com.sprin5.tutorials.mysfgpetclinic.services.CrudService;
import com.sun.xml.bind.v2.model.core.ID;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner,Long> implements CrudService<Owner,Long> {
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);

    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(),object);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }
}

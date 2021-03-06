package com.sprin5.tutorials.mysfgpetclinic.services;

import com.sprin5.tutorials.mysfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner,Long> {

    Owner findByLastName(String lastName);

}

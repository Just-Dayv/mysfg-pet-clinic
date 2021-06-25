package com.sprin5.tutorials.mysfgpetclinic.bootstrap;

import com.sprin5.tutorials.mysfgpetclinic.model.Owner;
import com.sprin5.tutorials.mysfgpetclinic.model.PetType;
import com.sprin5.tutorials.mysfgpetclinic.model.Vet;
import com.sprin5.tutorials.mysfgpetclinic.services.OwnerService;
import com.sprin5.tutorials.mysfgpetclinic.services.PetTypeService;
import com.sprin5.tutorials.mysfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }


    @Override
    public void run(String... args) throws Exception {
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType saveDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Cat");
        PetType saveCatPetType = petTypeService.save(cat);


        Owner owner1 = new Owner();
        owner1.setFirstName("Mich");
        owner1.setLastName("West");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setLastName("Glen");
        owner2.setFirstName("Fiona");


        ownerService.save(owner2);
        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setLastName("Jessie");
        vet2.setFirstName("Porter");

        vetService.save(vet2);

        System.out.println("Loaded Vets...");
    }
}

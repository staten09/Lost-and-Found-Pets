package com.thespotted.The.Spotted.service;

import com.thespotted.The.Spotted.exceptions.UserNotFoundException;
import com.thespotted.The.Spotted.models.Pet;
import com.thespotted.The.Spotted.models.data.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;
import java.util.UUID;

@Service
public class PetService {

    private PetRepository petRepository;

    @Autowired
    public PetService(PetRepository petRepository){
        this.petRepository = petRepository;
    }

    public Pet addPet(Pet pet){
        pet.setPetId(UUID.randomUUID().toString());
        return petRepository.save(pet);
    }

    public List<Pet> findAllPets(){
        return petRepository.findAll();
    }

    public Pet updatePet(Pet pet){
        return petRepository.save(pet);
    }

    public Pet findPetById(Integer id){
        return petRepository.findPetById(id).orElseThrow(() -> new UserNotFoundException("Pet by id" + id + "was not found"));

    }
    public void deletePet(Integer id){
        petRepository.deletePetById(id);
    }

}

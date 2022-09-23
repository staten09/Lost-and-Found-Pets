package com.thespotted.The.Spotted.models.data;

import com.thespotted.The.Spotted.models.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PetRepository extends JpaRepository<Pet,Integer> {
    void deletePetById(Integer id);

    Optional<Pet> findPetById(Integer id);
}

package com.thespotted.The.Spotted.controllers;

import com.thespotted.The.Spotted.models.Pet;
import com.thespotted.The.Spotted.service.PetService;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/pet")
public class PetController {
    private PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowedMethods("GET", "POST", "PUT", "DELETE").allowedOrigins("*")
                        .allowedHeaders("*");
            }
        };
    }

    @GetMapping("/all")
    public ResponseEntity<List<Pet>> getAllPets(){
        List<Pet> pets = petService.findAllPets();
        return new ResponseEntity<>(pets, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Pet> getPetById(@PathVariable("id") Integer id){
        Pet pet = petService.findPetById(id);
        return new ResponseEntity<>(pet, HttpStatus.OK);
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/add")
    public ResponseEntity<Pet> addPet(@RequestBody Pet pet){
        Pet newPet = petService.addPet(pet);
        return new ResponseEntity<>(newPet, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Pet> updatePet(@RequestBody Pet pet){
        Pet updatePet = petService.updatePet(pet);
        return new ResponseEntity<>(updatePet, HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<?> deletePet(@PathVariable("id") Integer id){
        petService.deletePet(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

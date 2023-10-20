package guru.springframework.sfgpetclinic1.services;

import guru.springframework.sfgpetclinic1.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}

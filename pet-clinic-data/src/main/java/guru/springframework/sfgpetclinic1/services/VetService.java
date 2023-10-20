package guru.springframework.sfgpetclinic1.services;

import guru.springframework.sfgpetclinic1.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}

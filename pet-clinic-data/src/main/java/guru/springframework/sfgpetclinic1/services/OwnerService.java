package guru.springframework.sfgpetclinic1.services;

import guru.springframework.sfgpetclinic1.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastName);
    Owner findById(Long id);
    Owner save(Long id);
    Set<Owner> findAll();
}

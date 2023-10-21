package guru.springframework.sfgpetclinic1.services;

import guru.springframework.sfgpetclinic1.model.Owner;


public interface OwnerService extends CrudService<Owner,Long> {

    Owner findByLastName(String lastName);

}

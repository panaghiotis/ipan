package panos.springframework.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import panos.springframework.petclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
}

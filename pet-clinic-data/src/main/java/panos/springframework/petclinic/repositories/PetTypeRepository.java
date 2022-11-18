package panos.springframework.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import panos.springframework.petclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}

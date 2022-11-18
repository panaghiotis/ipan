package panos.springframework.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import panos.springframework.petclinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {
}

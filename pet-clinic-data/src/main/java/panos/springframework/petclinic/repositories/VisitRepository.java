package panos.springframework.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import panos.springframework.petclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}

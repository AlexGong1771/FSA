package sk.posam.fsa.jpa_repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sk.posam.fsa.model.Pizza;

public interface JpaPizzaRepo extends JpaRepository<Pizza , Long> {
    Pizza updatePizza(Long id, Pizza updatedPizza);
}

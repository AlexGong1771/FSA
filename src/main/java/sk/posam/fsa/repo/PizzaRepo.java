package sk.posam.fsa.repo;

import sk.posam.fsa.model.Pizza;

import java.util.List;

public interface PizzaRepo {
    Pizza createPizza(Pizza pizza);

    Pizza getPizzaById(Long id);

    List<Pizza> getAllPizzas();

    Pizza updatePizza(Long id, Pizza updatedPizza);

    void deletePizza(Long id);
}

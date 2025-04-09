package sk.posam.fsa.service;

import sk.posam.fsa.model.Pizza;

import java.util.List;

public interface PizzaFacade {

    Pizza createPizza(Pizza pizza);

    Pizza getPizzaById(Long id);

    List<Pizza> getAllPizzas();

    Pizza updatePizza(Long id, Pizza updatedPizza);

    void deletePizza(Long id);
}

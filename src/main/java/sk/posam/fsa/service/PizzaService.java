package sk.posam.fsa.service;

import sk.posam.fsa.model.Pizza;
import sk.posam.fsa.repo.PizzaRepo;

import java.util.List;

public class PizzaService implements PizzaFacade{
    private final PizzaRepo pizzaRepo;

    public PizzaService(PizzaRepo pizzaRepo) {
        this.pizzaRepo = pizzaRepo;
    }

    @Override
    public Pizza createPizza(Pizza pizza) {
        return pizzaRepo.createPizza(pizza);
    }

    @Override
    public Pizza getPizzaById(Long id) {
        return pizzaRepo.getPizzaById(id);
    }

    @Override
    public List<Pizza> getAllPizzas() {
        return pizzaRepo.getAllPizzas();
    }

    @Override
    public Pizza updatePizza(Long id, Pizza updatedPizza) {
        return pizzaRepo.updatePizza(id , updatedPizza);
    }

    @Override
    public void deletePizza(Long id) {
         pizzaRepo.deletePizza(id);
    }
}

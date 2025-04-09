package sk.posam.fsa.jpa_repository;

import sk.posam.fsa.model.Pizza;
import sk.posam.fsa.repo.PizzaRepo;

import java.util.List;

public class PizzaJpaAdapter implements PizzaRepo {
    private final JpaPizzaRepo jpaPizzaRepo;

    public PizzaJpaAdapter(JpaPizzaRepo jpaPizzaRepo) {
        this.jpaPizzaRepo = jpaPizzaRepo;
    }

    @Override
    public Pizza createPizza(Pizza pizza) {
        return jpaPizzaRepo.save(pizza);
    }

    @Override
    public Pizza getPizzaById(Long id) {
        return jpaPizzaRepo.getById(id);
    }

    @Override
    public List<Pizza> getAllPizzas() {
        return jpaPizzaRepo.findAll();
    }

    @Override
    public Pizza updatePizza(Long id, Pizza updatedPizza) {
        return jpaPizzaRepo.updatePizza(id , updatedPizza);
    }

    @Override
    public void deletePizza(Long id) {
        jpaPizzaRepo.deleteById(id);
    }
}

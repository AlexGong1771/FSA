package sk.posam.fsa.jpa_repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sk.posam.fsa.model.Order;
import sk.posam.fsa.model.Pizza;
import sk.posam.fsa.model.User;

public interface JpaOrderRepo extends JpaRepository<Order, Long> {
    Order createOrder(User user);
    void addPizzaToOrder(Order order, Pizza pizza);
    void removePizzaFromOrder(Order order, Pizza pizza);
}

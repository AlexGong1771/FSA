package sk.posam.fsa.jpa_repository;

import sk.posam.fsa.model.Order;
import sk.posam.fsa.model.Pizza;
import sk.posam.fsa.model.User;
import sk.posam.fsa.repo.OrderRepo;

import java.util.List;

public class OrderJpaAdapter implements OrderRepo {
    private final JpaOrderRepo jpaOrderRepo;

    public OrderJpaAdapter(JpaOrderRepo jpaOrderRepo) {
        this.jpaOrderRepo = jpaOrderRepo;
    }

    @Override
    public Order createOrder(User user) {
        return jpaOrderRepo.createOrder(user);
    }

    @Override
    public void addPizzaToOrder(Order order, Pizza pizza) {
        jpaOrderRepo.addPizzaToOrder(order,pizza);
    }

    @Override
    public void removePizzaFromOrder(Order order, Pizza pizza) {
          jpaOrderRepo.removePizzaFromOrder(order,pizza);
    }

    @Override
    public List<Order> getOrdersByUser(User user) {
        return List.of();
    }

    @Override
    public Order getOrderById(long orderId) {
        return jpaOrderRepo.getById(orderId);
    }

    @Override
    public void completeOrder(Order order) {
   this.createOrder(order.getUser());
    }
}

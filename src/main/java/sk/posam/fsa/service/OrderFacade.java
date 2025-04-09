package sk.posam.fsa.service;

import sk.posam.fsa.model.Order;
import sk.posam.fsa.model.Pizza;
import sk.posam.fsa.model.User;

import java.util.List;

public interface OrderFacade {

    Order createOrder(User user);

    void addPizzaToOrder(Order order, Pizza pizza);

    void removePizzaFromOrder(Order order, Pizza pizza);

    List<Order> getOrdersByUser(User user);

    Order getOrderById(long orderId);

    void completeOrder(Order order);
}

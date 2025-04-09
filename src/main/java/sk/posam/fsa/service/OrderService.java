package sk.posam.fsa.service;

import sk.posam.fsa.model.Order;
import sk.posam.fsa.model.Pizza;
import sk.posam.fsa.model.User;
import sk.posam.fsa.repo.OrderRepo;

import java.util.List;

public class OrderService implements OrderFacade{
    private final OrderRepo orderRepo;

    public OrderService(OrderRepo orderRepo) {
        this.orderRepo = orderRepo;
    }

    @Override
    public Order createOrder(User user) {
        return orderRepo.createOrder(user);
    }

    @Override
    public void addPizzaToOrder(Order order, Pizza pizza) {
         orderRepo.addPizzaToOrder(order,pizza);
    }

    @Override
    public void removePizzaFromOrder(Order order, Pizza pizza) {
         orderRepo.removePizzaFromOrder(order ,pizza);
    }

    @Override
    public List<Order> getOrdersByUser(User user) {
        return orderRepo.getOrdersByUser(user);
    }

    @Override
    public Order getOrderById(long orderId) {
        return orderRepo.getOrderById(orderId);
    }

    @Override
    public void completeOrder(Order order) {
         orderRepo.completeOrder(order);
    }
}

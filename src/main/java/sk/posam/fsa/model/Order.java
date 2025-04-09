package sk.posam.fsa.model;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToMany
    @JoinTable(
            name = "order_pizza",
            joinColumns = @JoinColumn(name = "order_id"),
            inverseJoinColumns = @JoinColumn(name = "pizza_id")
    )
    private List<Pizza> pizzas;

    // Konštruktory
    public Order() {
        this.pizzas = new ArrayList<>();
    }

    public Order(User user) {
        this.user = user;
        this.pizzas = new ArrayList<>();
    }

    // Getter a Setter metódy
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }


    public void addPizza(Pizza pizza) {
        this.pizzas.add(pizza);
    }

    public void removePizza(Pizza pizza) {
        this.pizzas.remove(pizza);
    }
}

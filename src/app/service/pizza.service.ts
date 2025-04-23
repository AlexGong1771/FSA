import { Injectable } from '@angular/core';
import { Pizza } from "../model/pizza.model";

@Injectable({ providedIn: 'root' })
export class PizzaService {
  private pizzas: Pizza[] = [
    { id: 1, name: 'Margherita', ingredients: ['Tomato', 'Mozzarella'], price: 6.5 },
    { id: 2, name: 'Pepperoni', ingredients: ['Tomato', 'Mozzarella', 'Pepperoni'], price: 8.0 },
    { id: 3, name: 'Funghi', ingredients: ['Tomato', 'Mozzarella', 'Mushrooms'], price: 7.5 }
  ];

  getPizzas(): Pizza[] {
    return this.pizzas;
  }
}

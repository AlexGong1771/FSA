import { CommonModule } from '@angular/common';
import {Component} from '@angular/core';

@Component({

  selector: 'app-pizza-list',
  templateUrl: './pizza-list.component.html',
  styleUrls: ['./pizza-list.component.css'],
  imports: [CommonModule]
})
export class PizzaListComponent {
  pizzas = [
    { name: 'Margherita', price: 7.99, ingredients: ['syr', 'paradajky', 'bazalka'] },
    { name: 'Pepperoni', price: 8.99, ingredients: ['syr', 'paradajky', 'saláma'] },
    { name: 'Hawaiian', price: 9.49, ingredients: ['syr', 'šunka', 'ananás'] }
  ];
}

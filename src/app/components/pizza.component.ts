import { Component, OnInit } from '@angular/core';
import { PizzaService } from "../service/pizza.service";
import { Pizza } from "../model/pizza.model";
import {CurrencyPipe} from '@angular/common';

@Component({
  selector: 'app-pizza-list',
  templateUrl: './pizza-list.component.html',
  imports: [
    CurrencyPipe
  ],
  styleUrls: ['./pizza-list.component.scss']
})
export class PizzaListComponent implements OnInit {
  pizzas: Pizza[] = [];

  constructor(private pizzaService: PizzaService) {}

  ngOnInit(): void {
    this.pizzas = this.pizzaService.getPizzas();
  }
}

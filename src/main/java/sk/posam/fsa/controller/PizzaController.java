package sk.posam.fsa.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;
import sk.posam.fsa.api.PizzasApi;
import sk.posam.fsa.dto.PizzaRestDto;
import sk.posam.fsa.dto.PizzasRestDto;


@RestController
@Validated
public class PizzaController  implements PizzasApi {
    @Override
    @Secured("ROLE_ADMIN")
    public ResponseEntity<PizzaRestDto> createPizza(PizzaRestDto pizzaRestDto) {
        return ResponseEntity.accepted().build();
    }

    @Override
    public ResponseEntity<PizzasRestDto> getPizzas() {
        return ResponseEntity.accepted().build();
    }
}

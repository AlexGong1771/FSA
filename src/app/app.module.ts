import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent } from './app.component';
import { PizzaListComponent } from './components/pizza-list.components';
import { KeycloakAngularModule, KeycloakService } from 'keycloak-angular';
import { RouterModule } from '@angular/router'; // <-- Dôležité!
import { CommonModule } from '@angular/common';  // Pre ngFor

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot([]), // <-- Môžeš sem dať aj routy neskôr
    KeycloakAngularModule,
    PizzaListComponent
  ],
  providers: [KeycloakService],
  bootstrap: [AppComponent]
})
export class AppModule {}

import { bootstrapApplication } from '@angular/platform-browser';
import { appConfig } from './app/app.config';
import { AppComponent } from './app/app.component';
import { platformBrowserDynamic } from '@angular/platform-browser-dynamic';
import { KeycloakService } from 'keycloak-angular';
import { AppModule } from "./app/app.module";
import { keycloakConfig } from './app/keycloak-init';

function bootstrap() {
  platformBrowserDynamic().bootstrapModule(AppModule)
    .catch(err => console.error(err));
}

KeycloakService.prototype.init({
  config: keycloakConfig,
  initOptions: {
    onLoad: 'login-required',
    checkLoginIframe: false,
  },
  enableBearerInterceptor: true,
  bearerExcludedUrls: ['/assets']
}).then(() => bootstrap());



bootstrapApplication(AppComponent, appConfig)
  .catch((err) => console.error(err));

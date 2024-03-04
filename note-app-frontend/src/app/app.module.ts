import { NgModule } from '@angular/core';
import { AppComponent } from './app.component';
import { SharedModule } from '../libs/ui/shared/shared.module';
import { BrowserModule } from '@angular/platform-browser';
import { RouterModule } from '@angular/router';
import { CommonModule } from '@angular/common';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { LoginComponent } from './auth/login/login.component';
import { ReactiveFormsModule } from '@angular/forms';

const COMPONENTS = [
    LoginComponent
]

@NgModule({
  declarations: [AppComponent, ...COMPONENTS],
  imports: [
    BrowserModule,
    ReactiveFormsModule,
    SharedModule,
    RouterModule,
    CommonModule,
    HttpClientModule,
    AppRoutingModule
  ],
  exports: [RouterModule],
  bootstrap: [AppComponent],
})
export class AppModule {}

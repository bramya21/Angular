import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule} from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { RegistrationComponent } from './registration/registration.component';
import { IfComponent } from './if/if.component';
import { ForComponent } from './for/for.component';
import { MovieComponent } from './movie/movie.component';
import { SwitchComponent } from './switch/switch.component';
import { BuiltInPipeComponent } from './built-in-pipe/built-in-pipe.component';
import { ReversePipe } from './reverse.pipe';
import { ValidatePipe } from './validate.pipe';
import { SpeakComponent } from './speak/speak.component';
import { ListenComponent } from './listen/listen.component';
import { C1Component } from './c1/c1.component';
import { C2Component } from './c2/c2.component';
import { CommunicatorComponent } from './communicator/communicator.component';
import { HomepageComponent } from './homepage/homepage.component';
import { ViewtransactionComponent } from './viewtransaction/viewtransaction.component';
import { HttpPromiseComponent } from './http-promise/http-promise.component';
import {HttpClientModule} from '@angular/common/http';
import { HttpobservableComponent } from './httpobservable/httpobservable.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    RegistrationComponent,
    IfComponent,
    ForComponent,
    MovieComponent,
    SwitchComponent,
    BuiltInPipeComponent,
    ReversePipe,
    ValidatePipe,
    SpeakComponent,
    ListenComponent,
    C1Component,
    C2Component,
    CommunicatorComponent,
    HomepageComponent,
    ViewtransactionComponent,
    HttpPromiseComponent,
    HttpobservableComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

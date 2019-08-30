import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule} from '@angular/forms';
// import {BrowserAnimationsModule} from '@angular/platform-browser/animations'
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
// import { UpdateprofileComponent } from './updateprofile/updateprofile.component';
// import { LoginuserComponent } from './loginuser/loginuser.component';
import { UserComponent } from './user/user.component';
import { ProductsComponent } from './products/products.component';
import { AboutComponent } from './about/about.component';
import { ServicesComponent } from './services/services.component';
import { ErrorComponent } from './error/error.component';
 import { RoutingModule } from './routing.module';

 import { UserIdleModule } from 'angular-user-idle';
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
    HttpobservableComponent,
    // UpdateprofileComponent,
    // LoginuserComponent,
    UserComponent,
    ProductsComponent,
    AboutComponent,
    ServicesComponent,
    ErrorComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    RoutingModule,
    AppRoutingModule,
    // BrowserAnimationsModule,
    HttpClientModule,
    UserIdleModule.forRoot({idle: 60, timeout: 30, ping: 10})
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

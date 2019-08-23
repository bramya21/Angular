import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }
  public username:string;
  public password:string;
  public loginStatus:string;
  public Login()
  {
    if(this.username=="admin" && this.password=="nimda")
      this.loginStatus="Successful";
    else
      this.loginStatus="Invalid";


  }
}

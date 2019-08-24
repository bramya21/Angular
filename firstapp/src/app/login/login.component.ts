import { Component, OnInit } from '@angular/core';
import { BuiltinType, identifierModuleUrl } from '@angular/compiler';

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
  public Login(colStatus:any,imgStatus:any)
  {
    
    if(this.username=="admin" && this.password=="nimda")
    {  this.loginStatus="Successful";
     colStatus.style="color:green";
     //colStatus.disabled=true;
     imgStatus.src="/assets/download.jpg";
  
  }
    else
     { this.loginStatus="Invalid";colStatus.style="color:red";}
    

  }
}

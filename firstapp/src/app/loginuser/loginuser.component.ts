import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-loginuser',
  templateUrl: './loginuser.component.html',
  styleUrls: ['./loginuser.component.css']
})
export class LoginuserComponent implements OnInit {

  username: string;
  password: string;
  constructor() { }

  ngOnInit() {
  }
  login() : void {
    if(this.username == 'admin' && this.password == 'admin'){
     alert("successful login");
    }else {
      alert("Invalid credentials");
    }
  }

}

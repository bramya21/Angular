import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }
  public name:string;
  public age:number;
  public address:string;
  public registerStatus:string;
  Register()
  {
    if(this.name!=""&&this.address!=""&&this.age!=null){
    this.registerStatus="Registration Successful";
  }
  else
  {
    this.registerStatus="Please fill all the details";
  }


}
}

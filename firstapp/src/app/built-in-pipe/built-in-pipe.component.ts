import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-built-in-pipe',
  templateUrl: './built-in-pipe.component.html',
  styleUrls: ['./built-in-pipe.component.css']
})
export class BuiltInPipeComponent implements OnInit {
  title:string="Built in Pipes"
  person:Person;
  constructor() {
    this.person=new Person();
    this.person.adhar="123412341234";
    this.person.age=25;
    this.person.name="Uma";
   }

  ngOnInit() {
  }

}
class Person
{
  name:string;
  age:number;
  adhar:string;
}
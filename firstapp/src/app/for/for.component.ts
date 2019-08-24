import { Component, OnInit } from '@angular/core';
import {Movie} from '../movie'
@Component({
  selector: 'app-for',
  templateUrl: './for.component.html',
  styleUrls: ['./for.component.css']
})
export class ForComponent implements OnInit {

  cPlayers:Player[]=[];
  Login():string{
    return "Logged In";
  }
  // public obj:Movie;
  // public wishlist:string[]=["Mac Laptop","Smart Tv","IPhone","BluetoothSpeaker","BluetoothHeadset"];
  constructor() { 
    // this.obj.name="Bahubali";
    var p1=new Player();
    p1.id=99;
    p1.name="Virat Kohli";
    this.cPlayers.push(p1);
  }

  ngOnInit() {
    this.cPlayers.push({id:100,name:'Ms Dhoni'});
    this.cPlayers.push({id:101,name:'Sachin Tendulkar'});
    this.cPlayers.push({id:102,name:'Yuvraj Singh'});
  }
  
}
class Player
  {
    id:number;
    name:string;
  }